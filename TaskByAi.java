import java.util.Scanner;

public class TaskByAi {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String name = readName(input);
            int marks = readMarks(input);
            char grade = calculateGrade(marks);

            System.out.printf("%s, you got a %c grade.%n", name, grade);
        }
    }

    private static String readName(Scanner input) {
        while (true) {
            System.out.print("Enter your name: ");
            String name = input.nextLine().trim();

            if (!name.isEmpty()) {
                return name;
            }

            System.out.println("Name cannot be empty. Please try again.");
        }
    }

    private static int readMarks(Scanner input) {
        while (true) {
            System.out.print("Enter your marks (0-100): ");

            if (!input.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                input.next();
                continue;
            }

            int marks = input.nextInt();
            if (marks >= 0 && marks <= 100) {
                return marks;
            }

            System.out.println("Marks must be between 0 and 100.");
        }
    }

    private static char calculateGrade(int marks) {
        if (marks >= 90) {
            return 'A';
        }
        if (marks >= 80) {
            return 'B';
        }
        if (marks >= 70) {
            return 'C';
        }
        return 'D';
    }
}
