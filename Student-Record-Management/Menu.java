
import java.util.*;

public class Menu {

    static Map<Integer, String> students = new HashMap<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n========== Student Record Management System ==========");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Update Student");
            System.out.println("6. Remove Student");
            System.out.println("7. Count Total Students");
            System.out.println("0. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchByRollNumber(sc);
                    break;

                case 4:
                    searchByName(sc);
                    break;

                case 5:
                    updateStudent(sc);
                    break;

                case 6:
                    System.out.println("Remove Student feature pending.");
                    break;

                case 7:
                    System.out.println("Total Students: " + students.size());
                    break;

                case 0:
                    System.out.println("Thank you for using the system!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }

    static void addStudent(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        int rollno = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(rollno)) {
            System.out.println("Roll Number already exists!");
            return;
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        students.put(rollno, name);

        System.out.println("Student Added Successfully!");
    }

    static void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n========== Student Details ==========");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println("Roll Number: " + entry.getKey());
            System.out.println("Name: " + entry.getValue());
            System.out.println("--------------------------------");
        }
    }

    static void searchByRollNumber(Scanner sc) {

        System.out.print("Enter Roll Number: ");
        int rollno = sc.nextInt();

        if (students.containsKey(rollno)) {
            System.out.println("Student Found!");
            System.out.println("Name: " + students.get(rollno));
        } else {
            System.out.println("Student Not Found!");
        }
    }

    static void searchByName(Scanner sc) {

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            if (entry.getValue().equalsIgnoreCase(name)) {

                System.out.println("Student Found!");
                System.out.println("Roll Number: " + entry.getKey());
                System.out.println("Name: " + entry.getValue());

                found = true;
            }
        }

        if (!found) {
            System.out.println("Student Not Found!");
        }

    }

    static void updateStudent(Scanner sc) {
        System.out.println("Enter the Roll Number to Update");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        if (students.containsKey(rollNumber)) {
            System.out.println("Enter the new Name for Student");
            String newName = sc.nextLine();

            students.put(rollNumber, newName);
            System.out.println("Student Added Successfully!");

        } else {
            System.out.println("Roll Number not Found!");
        }

    }
}
