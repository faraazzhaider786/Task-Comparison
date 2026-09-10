# Task-Comparison
I write code for the simple task , then i do the same task by AI  and then i find comparisons.

## My Work:
<img width="975" height="512" alt="image" src="https://github.com/user-attachments/assets/26712683-04aa-46b3-90a2-f3c530b73763" />



## Task Done By AI:

### Code:
```java
import java.util.Scanner;

public class Task1 {
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
```

### Output:
<img width="975" height="507" alt="image" src="https://github.com/user-attachments/assets/42b7b01a-73d7-41b2-b3a5-7ba1b84d476e" />


## Differences between My Work and AI Work:

| My Work | AI Work |
|---------|---------|
| I did not handle the error. | AI code handles the error using try and catch. |
| I did all the task in one main program. | AI does the task in functions i.e., separate function for every little work like for readName, readMarks and calculateGrades. |
| In my program, user can enter wrong inputs. | In AI program, invalid inputs are handled by program. |
| I uses string concatenation. | AI program uses printf for formatting. |
| I didn't use number conversion. | AI code uses number conversion for inputs. |
