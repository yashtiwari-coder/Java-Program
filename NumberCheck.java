import java.util.Scanner;
class NumberCheck {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter a interger: ");
        int number = sc.nextInt();
        if (number > 0) {   
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        if(number % 5 == 0 && number % 7 == 0) {
            System.out.println("The number is divisible by both 5 and 7.");
        
        } else {
            System.out.println("The number is not divisible by either 5 or 7.");
        }

     sc.close();
    }
}

    
