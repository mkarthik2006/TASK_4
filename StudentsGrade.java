import java.util.HashMap;
import java.util.Scanner;

public class StudentsGrade {

    private HashMap<String, Integer> studentGrades;

    public StudentsGrade() {
        studentGrades = new HashMap<>();
    }

    public void addStudent(String name, int grade) {
        studentGrades.put(name, grade);
    }

    public void removeStudent(String name) {
        studentGrades.remove(name);
    }

    public int getGrade(String name) {
        return studentGrades.getOrDefault(name, -1); // Return -1 if student not found
    }

    public static void main(String[] args) {
        StudentsGrade manager = new StudentsGrade();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Get Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    scanner.nextLine();
                    manager.addStudent(name, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    name = scanner.nextLine();
                    manager.removeStudent(name);
                    break;
                case 3:
                    System.out.print("Enter student name to get grade: ");
                    name = scanner.nextLine();
                    int studentGrade = manager.getGrade(name);
                    if (studentGrade != -1) {
                        System.out.println("Grade for " + name + ": " + studentGrade);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}