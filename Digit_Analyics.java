import java.util.Scanner;
class Digit_Analyics{
    public static void main(String [ ] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;
        int sum = 0;
        int count = 0;
        while (number !=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            sum += digit;
            count++;
            number /= 10;
        }
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reverse);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Count of digits: " + count);
    }
}