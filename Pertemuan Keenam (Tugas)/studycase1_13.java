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