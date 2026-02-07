import java.util.Scanner;
class ATM_with_Drawal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Acount balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter the amount to withdraw: ");
        double withdraw = sc.nextDouble();
        if ( withdraw % 100 ==0 && (balance -withdraw) >= 1000) {
            balance = balance - withdraw;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");

        }
        if (withdraw % 100 != 0) {
            System.out.println("Withdrawal amount must be a multiple of 100.");
        } else if ((balance - withdraw) < 1000) {
            System.out.println("Insufficient balance. Minimum balance of 1000 must be maintained.");
        }
        sc.close();
    }
}