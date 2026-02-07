import java.util.Scanner;
class Prime_Number_Range{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter Ending number: ");
        int end = sc.nextInt();
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.println(i);
            }
        }
    }
}