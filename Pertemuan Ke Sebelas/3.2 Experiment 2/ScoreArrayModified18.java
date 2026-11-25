import java.util.Scanner;

public class ScoreArrayModified18 {
    public static void main(String[] args) {
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }

        int passCount = 0;
        int failCount = 0;

        // Questions 2 and 4: print only the students who passed, count both groups
        for (int i = 0; i < finalScores.length; i++) {
            if (finalScores[i] > 70) {
                System.out.println("Student #" + (i + 1) + ": " + finalScores[i] + " (PASS)");
                passCount++;
            } else {
                failCount++;
            }
        }

        System.out.println("Students who passed: " + passCount);
        System.out.println("Students who failed: " + failCount);
        input.close();
    }
}
