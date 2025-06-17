import java.util.HashSet;
import java.util.Scanner;
public class CheckStudent {
public static void main(String[] args){
HashSet<String>Students=new HashSet<>();
Students.add("sravanthi");
Students.add("sujitha");
Students.add("srilekha");
Scanner sc=new Scanner(System.in);
System.out.println("Enter a name to search:");
String name=sc.nextLine();
if (Students.contains(name)){
	System.out.println(name +" is present:");
}
else
{
	System.out.println(name +" is not found");
}
}
}