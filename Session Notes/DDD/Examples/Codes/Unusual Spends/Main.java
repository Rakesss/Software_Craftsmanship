
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    private static LocalDateTime LocalDateTime;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter user ID: ");
        String userId = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter mobile: ");
        String mobile = scanner.nextLine();

        User user = new User(userId, name, email, mobile);

        System.out.print("Enter credit card number: ");
        String cardNumber = scanner.nextLine();
        CreditCard card = new CreditCard(cardNumber, userId);

        SpendingCategory groceries = SpendingCategory.GROCERIES;
        SpendingCategory travel = SpendingCategory.TRAVEL;

        System.out.print("Enter merchant ID: ");
        String merchantId = scanner.nextLine();
        System.out.print("Enter merchant name: ");
        String merchantName = scanner.nextLine();

        Merchant m = new Merchant(merchantId, merchantName, SpendingCategory.GROCERIES);

        System.out.print("Enter transaction ID: ");
        String transId = scanner.nextLine();
        System.out.print("Enter transaction amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter credit card ID for transaction: ");
        String cardId = scanner.nextLine();

        Transaction t = new Transaction(transId, amount, merchantId, cardId, LocalDateTime);
        System.out.println("Transaction Sucessfull From User: " + User.name);
        System.out.println("Time" + LocalDateTime.getMonth());

        scanner.close();
    }
}