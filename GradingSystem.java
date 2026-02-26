import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double percentage;

        // Taking input
        System.out.print("Enter the percentage: ");
        percentage = sc.nextDouble();

        // Grading system using if-else ladder
        if (percentage >= 90) {
            System.out.println("Grade A");
        }
        else if (percentage >= 80) {
            System.out.println("Grade B");
        }
        else if (percentage >= 70) {
            System.out.println("Grade C");
        }
        else if (percentage >= 60) {
            System.out.println("Grade D");
        }
        else if (percentage >= 40) {
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}