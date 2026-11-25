import java.util.Scanner;

public class ScoreArrayForeach18 {
    public static void main(String[] args) {
        int[] finalScores = new int[10];
        Scanner input = new Scanner(System.in);

        // Question 3: this loop must stay a for loop because it assigns to finalScores[i]
        for (int i = 0; i < finalScores.length; i++) {
            System.out.print("Enter the score for student #" + (i + 1) + ": ");
            finalScores[i] = input.nextInt();
        }

        // This loop only reads the elements, so foreach works.
        // foreach has no index, so a manual counter numbers the students.
        int number = 1;
        for (int score : finalScores) {
            String status = (score > 70) ? "PASS" : "FAIL";
            System.out.println("Student #" + number + ": " + score + " (" + status + ")");
            number++;
        }

        input.close();
    }
}
