import java.util.HashSet;
public class HashSetDemo {
public static void main(String[] args){
HashSet<Integer>intSet=new HashSet<>();
intSet.add(10);
intSet.add(20);
intSet.add(10);
System.out.println("Integer Set:"+intSet);
HashSet<String>strSet=new HashSet<>();
strSet.add("Apple");
strSet.add("Banana");
strSet.add(null);
strSet.add("Apple");
System.out.println("StringSet:"+strSet);
}
}