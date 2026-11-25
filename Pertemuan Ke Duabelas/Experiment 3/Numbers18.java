import java.util.Arrays;

public class Numbers18 {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Step 3
        System.out.println("--- Step 3: Arrays.toString per row ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Question 2
        System.out.println("--- Question 2: Arrays.toString(myNumbers) ---");
        System.out.println(Arrays.toString(myNumbers).replaceAll("@[0-9a-f]+", "@<hash>"));

        // Question 3
        System.out.println("--- Question 3: Arrays.deepToString ---");
        System.out.println(Arrays.deepToString(myNumbers));

        // Question 5
        System.out.println("--- Question 5: length of each row ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumbers[i].length);
        }

        // Question 7
        System.out.println("--- Question 7: replace row 0 ---");
        myNumbers[0] = new int[7];
        System.out.println(myNumbers.length);
        System.out.println(myNumbers[0].length);

        // Discussion: aliasing vs. deep copy
        System.out.println("--- Discussion: copy ---");
        int[][] copy = myNumbers;
        copy[0][0] = 99;
        System.out.println("Alias   -> myNumbers[0][0] = " + myNumbers[0][0]);

        myNumbers[0][0] = 0;
        int[][] deep = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            deep[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        deep[0][0] = 99;
        System.out.println("Deep    -> myNumbers[0][0] = " + myNumbers[0][0]);

        int[][] cloned = myNumbers.clone();
        cloned[0][0] = 99;
        System.out.println("clone() -> myNumbers[0][0] = " + myNumbers[0][0]);
    }
}