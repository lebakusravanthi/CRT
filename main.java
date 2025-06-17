import java.util.HashMap;
import java.util.Map;
public class main{
public static void main(String[] args){
HashMap<Integer,String>studentMap=new HashMap<>();
studentMap.put(101,"Alice");
studentMap.put(102,"Bob");
studentMap.put(103,"Charlie");
System.out.println("Name of student with ID 102:"+studentMap.get(102));
System.out.println("Contains ID 104?"+studentMap.containsKey(104));
studentMap.remove(101);
System.out.println("All Students:");
for(Map.Entry<Integer,String>entry:studentMap.entrySet()) {
System.out.println("ID:"+entry.getKey()+",Name:"+entry.getValue());
}
}
}