package view.Include_pro;

import java.util.Scanner;

public class login {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        boolean login = false;
        while (count < 3) {
            System.out.print("Username: ");
            String username = sc.nextLine();
            System.out.print("Password: ");
            String password = sc.nextLine();
            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                System.out.println("Login success!");
                login = true;
                break;
            } else {
                System.out.println("Invalid username or password!");
                count++;
            }
        }
        if (!login) {
            System.out.println("You have exceeded the maximum number of attempts. Please try again later.");
            }
    }
}
