import java .util.Scanner;
class Login_Authentication{
    public static void main( String[] args){
        Scanner sc = new Scanner (System.in);
        String correctUsername = "admin";
        String correctPassword = "password123";
        int attempts = 3;
        while (attempts > 0) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.print("Enter password: ");
            String password = sc.nextLine();
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful! Welcome, " + username + "!");
                break;
            } else {
                attempts--;
                System.out.println("Invalid credentials. Attempts remaining: " + attempts);
                if (attempts == 0) {
                    System.out.println("Account locked due to too many failed login attempts.");
                }
            }
        }
    }
}