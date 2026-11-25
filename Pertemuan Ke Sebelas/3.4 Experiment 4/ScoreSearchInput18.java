import java.util.Arrays;
import java.util.Scanner;

public class ScoreSearchInput18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score #" + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        System.out.print("Enter the score to search for: ");
        int key = input.nextInt();

        boolean found = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == key) {
                System.out.println("Score " + key + " was found at index " + i);
                found = true;
                break;
            }
        }

        // Question 3: an informative message that shows the array that was searched
        if (!found) {
            System.out.println("Score " + key + " was not found in the array " + Arrays.toString(scores) + ".");
            System.out.println("Please check the value and try again.");
        }

        input.close();
    }
}
