import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int id;
    int marks;

    Student(String name, int id, int marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    String getGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "Fail";
    }
}	
public class StudentManagement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Marks (out of 100): ");
            int marks = sc.nextInt();

            Student s = new Student(name, id, marks);
            studentList.add(s);
        }

        System.out.println("\n===== Student Report =====");
        for (Student s : studentList) {
            System.out.println("ID: " + s.id + " | Name: " + s.name + " | Marks: " + s.marks + " | Grade: " + s.getGrade());
        }

        sc.close();
    }
}
