import java.util.Arraylist;
import java.util.Scanner;


class student {
    int id;
    String name;
    int age;

    student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}

public class project {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Arraylist<student> students = new Arraylist<student>();

        while (true) {
            System.out.println("Student management,");
            System.out.println("1. Add student");
            System.out.println("2. view students");
            System.out.println("3. Update Students");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit"); 

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter student ID: ");
                int id = sc.nextInt();
                sc.nextLine(); // Consume newline
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student age: ");
                int age = sc.nextInt();
                students.add(new student(id, name, age));
            }

            else if (choice == 2) {
                System.out.println("List of students:");
                for (student s : students) {
                    System.out.println("ID: " + s.id + ", Name: " + s.name + ", Age: " + s.age);
                }
            }

            else if (choice == 3) {
                System.out.print("Enter student ID to update: ");
                int id = sc.nextInt();
                boolean found = false;
                for (student s : students) {
                    if (s.id == id) {
                        found = true;
                        sc.nextLine(); // Consume newline
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = sc.nextInt();
                        s.name = newName;
                        s.age = newAge;
                        System.out.println("Student updated successfully.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            }

            else if (choice == 4) {
                System.out.print("Enter student ID to delete: ");
                int id = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == id) {
                        found = true;
                        students.remove(i);
                        System.out.println("Student deleted successfully.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else {
                System.out.println("Invalid choice. Please try again.");
            }

        }
    }
}