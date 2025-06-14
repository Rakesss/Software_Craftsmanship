//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User u1 = new User("01", "Rahul", "rahul@gmail.com", "9678412898");
        User u2 = new User("02", "Shivam", "shivam@gmail.com", "8573624356");


        CreditCard Card = new CreditCard("0101", "01");
        CreditCard card1 = new CreditCard("1002", "01");

        SpendingCategory groceries = SpendingCategory.GROCERIES;
        SpendingCategory travel = SpendingCategory.TRAVEL;

        Merchant m1 = new Merchant("01", "Dmart", groceries);
        Merchant m2 = new Merchant("02", "RedBus", travel);

        Transaction T1 = new Transaction("2", 500, "01", "0101", "5.30pm");
        Transaction T2 = new Transaction("5", 750, "02", "1002", "7.30AM");

        System.out.println("User:" + User.name);
    }
}