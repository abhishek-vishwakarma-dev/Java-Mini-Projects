
import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<Integer, String> map = new HashMap<>();

        while (true) {
            System.out.print("Enter Roll Number (0 to exit): ");
            int rollnum = sc.nextInt();
            sc.nextLine();

            if (rollnum == 0) {
                break;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            map.put(rollnum, name);

            System.out.println("Student added successfully");
        }

        System.out.println("All Student Details:");
        System.out.println(map);

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        if (map.containsKey(searchRoll)) {
            System.out.println("Student Name: " + map.get(searchRoll));
        } else {
            System.out.println("Student not found!");
        }

        System.out.println("Enter the rollNumber to remove the Student: ");
        int remove = sc.nextInt();

        if (map.containsKey(remove)) {
            System.out.println("Student removed succesfully --> " + map.remove(remove));
        } else {
            System.out.println("Enter the correct roll Number to remove");
        }

        System.out.println("Student details now: " + map);

        System.out.println("Enter the roll Number for update a Student ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the name for the Student to update: ");
        String correctName = sc.nextLine();

        if (map.containsKey(rollNumber)) {
            map.put(rollNumber, correctName);
            System.out.println("Student updated successfully");
            System.out.println("Student details after the updation: " + map);
        } else {
            System.out.println("Enter the correct Roll Number for update ");
        }

        System.out.println("To find the total number of Students enter 'total'");
        String input = sc.nextLine();

        if (input.equals("total")) {
            System.out.println("The total no of Student are: " + map.size());
        } else {
            System.out.println("Enter correct input");
        }

        sc.close();
    }
}
