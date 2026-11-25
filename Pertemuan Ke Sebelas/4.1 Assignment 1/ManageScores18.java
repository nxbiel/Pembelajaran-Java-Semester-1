import java.util.Scanner;

public class ManageScores18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Number of scores to enter
        System.out.print("Enter the number of student scores: ");
        int n = input.nextInt();
        while (n < 1) {
            System.out.print("The number must be at least 1. Try again: ");
            n = input.nextInt();
        }

        int[] scores = new int[n];
        int total = 0;

        // Enter each score, rejecting values outside 0 to 100
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            int score = input.nextInt();
            while (score < 0 || score > 100) {
                System.out.print("The score must be between 0 and 100. Try again: ");
                score = input.nextInt();
            }
            scores[i] = score;
            total += score;
        }

        // Average
        double average = (double) total / scores.length;

        // Highest and lowest
        int highest = scores[0];
        int lowest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) highest = scores[i];
            if (scores[i] < lowest) lowest = scores[i];
        }

        // Report with PASS / FAIL status
        System.out.println();
        System.out.println("===== SCORE REPORT =====");
        for (int i = 0; i < scores.length; i++) {
            String status = (scores[i] > 70) ? "PASS" : "FAIL";
            System.out.println("Student #" + (i + 1) + ": " + scores[i] + " (" + status + ")");
        }
        System.out.println("------------------------");
        System.out.printf("Average : %.2f%n", average);
        System.out.println("Highest : " + highest);
        System.out.println("Lowest  : " + lowest);

        input.close();
    }
}
