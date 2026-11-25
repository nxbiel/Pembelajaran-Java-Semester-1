public class Cinema18 {
    public static void main(String[] args) {
        String[][] audience = new String[4][2];
        
        audience[0][0] = "Amin";
        audience[0][1] = "Bena";
        audience[1][0] = "Candra";
        audience[1][1] = "Dela";
        audience[2][0] = "Eka";
        audience[2][1] = "Farhan";
        audience[3][0] = "Gisel";
        audience[3][1] = "Hana";

        System.out.printf("%s \t %s\n", audience[0][0], audience[0][1]);
        System.out.printf("%s \t %s\n", audience[1][0], audience[1][1]);
        System.out.printf("%s \t %s\n", audience[2][0], audience[2][1]);
        System.out.printf("%s \t %s\n", audience[3][0], audience[3][1]);

        // Question 4
        System.out.println("--- Question 4 ---");
        System.out.println(audience.length);
        System.out.println(audience[0].length);
        System.out.println(audience[1].length);
        System.out.println(audience[2].length);
        System.out.println(audience[3].length);

        // Question 6 (for loop)
        System.out.println("--- Question 6 ---");
        System.out.println(audience.length);
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + audience[i].length);
        }

        // Question 7 (foreach loop)
        System.out.println("--- Question 7 ---");
        System.out.println(audience.length);
        for (String[] rowAudience : audience) {
            System.out.println("Row length: " + rowAudience.length);
        }

        // Question 8 (for loop, row 3)
        System.out.println("--- Question 8 ---");
        System.out.println("Audience in row 3: ");
        for (int i = 0; i < audience[2].length; i++) {
            System.out.println(audience[2][i]);
        }

        // Question 9 (foreach loop, row 3)
        System.out.println("--- Question 9 ---");
        System.out.println("Audience in row 3: ");
        for (String name : audience[2]) {
            System.out.println(name);
        }

        // Question 10 (String.join)
        System.out.println("--- Question 10 ---");
        for (int i = 0; i < audience.length; i++) {
            System.out.println("Audience in row " + (i + 1) + ": " + String.join(", ", audience[i]));
        }
    }
}