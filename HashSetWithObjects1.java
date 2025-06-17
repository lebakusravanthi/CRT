import java.util.HashSet;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollNo + ", Name: " + name;
    }

    // Override equals and hashCode to ensure proper HashSet behavior
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student other = (Student) obj;
        return rollNo == other.rollNo && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return rollNo * 31 + name.hashCode();
    }
}

public class HashSetWithObjects1 {
    public static void main(String[] args) {
        HashSet<Student>StudentSet = new HashSet<>();
        StudentSet.add(new Student(101, "Alice"));
        StudentSet.add(new Student(102, "Bob"));
        StudentSet.add(new Student(101, "Alice")); // Duplicate entry

        System.out.println("Students in Set:");
        for (Student s :StudentSet) {
	     System.out.println(s);
		}
	}
}
