import java.util.Arrays;

public class NumberArray18 {
    public static void main(String[] args) {
        int[] numbers = new int[4];

        numbers[0] = 5;
        numbers[1] = 13;
        numbers[2] = -7;
        numbers[3] = 17;

        // Display with a for loop
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        // Display with a foreach loop
        for (int number : numbers) {
            System.out.println(number);
        }

        // Display with Arrays.toString()
        System.out.println(Arrays.toString(numbers));
    }
}