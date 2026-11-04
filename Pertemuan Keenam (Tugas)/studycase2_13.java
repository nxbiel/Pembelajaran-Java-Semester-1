import java.util.Scanner;
public class studycase2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student name: ");
        String studentName = sc.nextLine();

        System.out.print("Activity type (BELMAWA, BAKORMA, Mandiri, PKM, or Others): ");
        String activityType = sc.nextLine();

        if (activityType.equalsIgnoreCase("BELMAWA")
                || activityType.equalsIgnoreCase("BAKORMA")
                || activityType.equalsIgnoreCase("Mandiri")) {

            System.out.print("Competition rank (1/2/3, enter 0 if not ranked): ");
            int competitionRank = sc.nextInt();

            System.out.print("Number of uploaded documents (0-4): ");
            int documentCount = sc.nextInt();

            if (competitionRank >= 1 && competitionRank <= 3
                    && documentCount == 4) {
                System.out.println("Name: " + studentName);
                System.out.println("Funding status: Award granted");
                System.out.println("Competition rank: " + competitionRank);
                System.out.println("Activity type: " + activityType);
                System.out.println("All documents are complete.");
            } else {
                System.out.println("Name: " + studentName);
                System.out.println("Funding status: Not granted");

                if (competitionRank < 1 || competitionRank > 3) {
                    System.out.println("Must achieve 1st, 2nd, or 3rd place.");
                }

                if (documentCount < 4) {
                    System.out.println("Missing documents: "
                            + (4 - documentCount));
                }
            }

        } else if (activityType.equalsIgnoreCase("PKM")) {
            System.out.print("Funding approval (1=Approved, 0=Not approved): ");
            int fundingStatus = sc.nextInt();

            System.out.print("Number of uploaded documents (0-4): ");
            int documentCount = sc.nextInt();

            if (fundingStatus == 1 && documentCount == 4) {
                System.out.println("Name: " + studentName);
                System.out.println("Funding status: Granted");
            } else {
                System.out.println("Name: " + studentName);
                System.out.println("Funding status: Not granted");

                if (fundingStatus == 0) {
                    System.out.println("PKM funding was not approved.");
                }

                if (documentCount < 4) {
                    System.out.println("Missing documents: "
                            + (4 - documentCount));
                }
            }

        } else if (activityType.equalsIgnoreCase("Others")) {
            System.out.print("Number of uploaded documents (0-4): ");
            int documentCount = sc.nextInt();

            System.out.println("Name: " + studentName);
            System.out.println("Funding status: Not granted");

            if (documentCount < 4) {
                System.out.println("Missing documents: "
                        + (4 - documentCount));
            }

        } else {
            System.out.println("Invalid activity type.");
        }
        sc.close();
    }
}
    