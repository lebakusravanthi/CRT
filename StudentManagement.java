import java.util.ArrayList;

class Student {
    String name;
    int age;
    double grade;

    Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 18, 85.5));
        students.add(new Student("Bob", 19, 78.0));
        students.add(new Student("Charlie", 20, 90.2));
        students.add(new Student("Diana", 18, 67.8));
        students.add(new Student("Eve", 21, 88.4));

       
        System.out.println("Students with grade above 80:");
        for (Student s : students) {
            if (s.grade > 80) {
                System.out.println(s.name + " - Grade: " + s.grade);
            }
        }
    }
}