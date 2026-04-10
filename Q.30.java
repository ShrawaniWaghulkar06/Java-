import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accept password from user
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Mask all characters except last two
        int len = password.length();
        if (len > 2) {
            String maskedPart = password.substring(0, len - 2).replaceAll(".", "*");
            String visiblePart = password.substring(len - 2);
            password = maskedPart + visiblePart;
        }

        // Display masked password
        System.out.println("Masked Password: " + password);

        sc.close();
    }
}