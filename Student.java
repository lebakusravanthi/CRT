import java.util.Hashset;
class Student {
int rollNo;
String name;
public Student(int rollNo,String name){
this.rollNo=rollNo;
this.name=name;
}
public String toString(){
	return "RollNo:"+rollNo+",Name:"+name;
}
}
public class HashSetWithObjects{
	public static void main(String[] args){
		HashSet<Student>StudentSet=new HashSet<>();
		StudentSet.add(new Student(101,"Alice"));
		StudentSet.add(new Student(102,"Bob"));
		StudentSet.add(new Student(101,"Alice"));
		System.out.println("Students in Set:");
		for(Student s:StudentSet){
			System.out.println(s);
        }
    }
}
			
		