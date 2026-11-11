public class NumberArrayDoubled18 {
    public static void main(String[] args) {
        int[] numbers = {5, 13, -7, 17};

        // Question 3: show each element together with its doubled value
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i] + ", doubled = " + (numbers[i] * 2));
        }
    }
}