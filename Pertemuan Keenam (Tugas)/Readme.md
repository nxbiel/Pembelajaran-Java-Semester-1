# Basic Programming Practicum Report
## Session 8: CASE STUDY ON SELECTION USING GIT AND GITHUB

**Department of Information Technology — Politeknik Negeri Malang — 2026/2027**

</div>

| | |
|---|---|
| **Name** | M. Syailendra Nabil Destama |
| **NIM** | 264107020241 |
| **Study Program** | D-IV Informatics Engineering |
| **Class** | 1I |

---

## Experiment 2: Case Study 1 – Basic Selection
```java
import java.util.Scanner;
public class studycase1_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pricePerCup = 18000;
        int totalPrice, discount, 
            totalToPay;
        int change, shortfall;

        System.out.print("Number of cups: ");
        int numberOfCups = sc.nextInt();
        
        System.out.print("Payment amount: ");
        int paymentAmount = sc.nextInt();
        
        totalPrice = numberOfCups * pricePerCup;
        discount = 0;

        if (totalPrice >= 100000) {
            discount = totalPrice * 10 / 100;
        }
            totalToPay = totalPrice - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Total price: " + totalPrice);
            System.out.println("Total to pay: " + totalToPay); 
        
        if (paymentAmount >= totalToPay) {
            change = paymentAmount - totalToPay;
            System.out.println("Here's your change, boss: " + change);            
        } else {
            shortfall = totalToPay - paymentAmount;
            System.out.println("Your money isn't enough, mate: " + shortfall);
        }
        sc.close();

    }
}

```

## Experiment 3: Case Study 2 – Nested Selection
```java
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
    
```
## Study Case 2 Testing Results by Galang Fairuz

| No | Activity Type | Documents | Rank/Funding | Output | Correct? |
|---|---|---:|---|---|---|
| 1 | BELMAWA | 4 | Rank 1 | Award granted | Yes |
| 2 | MANDIRI | 3 | Rank 2 | Not granted (1 document missing) | Yes |
| 3 | PKM | 4 | Passed (1) | Award granted | Yes |