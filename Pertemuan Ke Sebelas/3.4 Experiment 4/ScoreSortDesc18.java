import java.util.Arrays;

public class ScoreSortDesc18 {
    public static void main(String[] args) {
        int[] scores = {78, 65, 90, 55, 88, 72};
        System.out.println("Before: " + Arrays.toString(scores));

        for (int i = 0; i < scores.length - 1; i++) {
            for (int j = 0; j < scores.length - 1 - i; j++) {
                // Question 5: the comparison changes from > to < for descending order
                if (scores[j] < scores[j + 1]) {
                    int temp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = temp;
                }
            }
        }
        System.out.println("After: " + Arrays.toString(scores));
    }
}
