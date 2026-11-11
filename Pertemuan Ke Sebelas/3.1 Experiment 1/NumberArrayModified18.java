import java.util.Arrays;

public class NumberArrayModified18 {
    public static void main(String[] args) {
        // Question 2: declare and initialize the array in one statement
        int[] numbers = {5, 13, -7, 17};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(numbers));
    }
}