public class ExampleVariable18 {
    public static void main(String[] args) {
        String oneOfMyHobbies = "Playing Futsal";
        boolean isSmart = true;
        char gender = 'M';
        byte _age = 18;
        double $gpa = 4.00, height = 1.72;

        System.out.println(oneOfMyHobbies);
        System.out.println("Are You Smart ? " + isSmart);
        System.out.println("My Gender Is " + gender);
        System.out.println("My Current Age Is " + _age);
        System.out.println(String.format("My GPA Is %s and my height is %s meters", $gpa, height));
    }
}