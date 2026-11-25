import java.util.Scanner;

public class AverageScoreModified18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Question 2: the array size comes from the keyboard
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        while (n < 1) {
            System.out.print("The number must be at least 1. Try again: ");
            n = input.nextInt();
        }

        int[] studentScores = new int[n];
        int total = 0;
        int passedCount = 0;

        for (int i = 0; i < studentScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            studentScores[i] = input.nextInt();
            total += studentScores[i];
            // Question 1: count students with a score above 70
            if (studentScores[i] > 70) {
                passedCount++;
            }
        }

        double average = (double) total / studentScores.length;

        int highest = studentScores[0];
        int lowest = studentScores[0];
        for (int i = 1; i < studentScores.length; i++) {
            if (studentScores[i] > highest) highest = studentScores[i];
            if (studentScores[i] < lowest) lowest = studentScores[i];
        }

        System.out.println("Total score: " + total);
        System.out.println("Average: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Students who passed (> 70): " + passedCount);

        input.close();
    }
}
