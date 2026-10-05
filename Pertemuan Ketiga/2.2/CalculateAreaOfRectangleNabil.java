import java.util.Scanner; 

public class CalculateAreaOfRectangleNabil { 

    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in); 

        int length; 
        int width; 
        int area; 

        System.out.print("Enter the length of the rectangle: "); 
        length = input.nextInt(); 
        System.out.print("Enter the width of the rectangle: "); 
        width = input.nextInt(); 

        area = length * width; 
        System.out.println("The area of the rectangle is: " + area);
        input.close(); 
    } 
}