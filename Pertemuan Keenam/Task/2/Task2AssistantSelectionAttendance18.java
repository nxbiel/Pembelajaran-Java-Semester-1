import java.util.Scanner;

public class Task2AssistantSelectionAttendance18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is the student active? (true/false): ");
        boolean isActive = sc.nextBoolean();
        System.out.print("Is the student under academic sanction? (true/false): ");
        boolean isSanctioned = sc.nextBoolean();

        if (isActive && !isSanctioned) {
            System.out.print("Grade in Basic Programming: ");
            int grade = sc.nextInt();
            System.out.print("Has a programming competency certificate? (true/false): ");
            boolean hasCertificate = sc.nextBoolean();

            if (grade >= 80 || hasCertificate) {
                System.out.print("Interview score: ");
                int interviewScore = sc.nextInt();

                if (interviewScore >= 75) {
                    System.out.println("Accepted as lab assistant");
                } else {
                    System.out.println("Not accepted: interview score is below 75");
                }
            } else {
                System.out.println("Failed: grade is below 80 and no programming competency certificate");
            }
        } else {
            System.out.println("Failed: student is not active or is under academic sanction");
        }
    }
}