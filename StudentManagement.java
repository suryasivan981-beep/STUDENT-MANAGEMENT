import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {

            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                students.add(new Student(id, name, age));

                System.out.println("Student added successfully!");

            } 
            else if (choice == 2) {

                System.out.println("\nStudent Details:");

                for (Student s : students) {
                    System.out.println(
                        "ID: " + s.id +
                        ", Name: " + s.name +
                        ", Age: " + s.age
                    );
                }

            } 
            else if (choice == 3) {

                System.out.print("Enter ID to update: ");
                int id = sc.nextInt();

                for (Student s : students) {

                    if (s.id == id) {

                        System.out.print("Enter new name: ");
                        s.name = sc.next();

                        System.out.print("Enter new age: ");
                        s.age = sc.nextInt();

                        System.out.println("Student updated!");
                    }
                }

            } 
            else if (choice == 4) {

                System.out.print("Enter ID to delete: ");
                int id = sc.nextInt();

                for (int i = 0; i < students.size(); i++) {

                    if (students.get(i).id == id) {
                        students.remove(i);
                        System.out.println("Student deleted!");
                    }
                }

            } 
            else if (choice == 5) {

                System.out.println("Program ended.");
                break;

            } 
            else {

                System.out.println("Invalid choice!");

            }
        }

        sc.close();
    }
}