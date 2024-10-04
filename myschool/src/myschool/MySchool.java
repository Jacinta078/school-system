package myschool;
import java.util.Scanner;
public class MySchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] studentNames = new String[100]; // Array to store student names
        int studentCount = 0;
        int choice;

        do {
            System.out.println("\n--- School System Menu ---");
            System.out.println("1. Register a student");
            System.out.println("2. List all students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (studentCount < studentNames.length) {
                        System.out.print("Enter the student's name: ");
                        String name = scanner.nextLine();
                        studentNames[studentCount] = name;
                        studentCount++;
                        System.out.println("Student " + name + " registered successfully!");
                    } else {
                        System.out.println("Registration limit reached. Can't register more students.");
                    }
                    break;

                case 2:
                    if (studentCount == 0) {
                        System.out.println("No students registered yet.");
                    } else {
                        System.out.println("\n--- List of Registered Students ---");
                        for (int i = 0; i < studentCount; i++) {
                            System.out.println((i + 1) + ". " + studentNames[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }

        } while (choice != 3); // Repeat the loop until the user chooses to exit

        scanner.close();
    }
}