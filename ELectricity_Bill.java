import java.util.Scanner;

class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount;

        if (units <= 100) {
            billAmount = units * 2;
        } else if (units <= 200) {
            billAmount = (100 * 2) + (units - 100) * 3;
        } else {
            billAmount = (100 * 2) + (100 * 3) + (units - 200) * 5;
        }

        // Fixed charge
        billAmount = billAmount + 150;

        System.out.println("The  Total electricity bill = " + billAmount);

        sc.close();
    }
}
