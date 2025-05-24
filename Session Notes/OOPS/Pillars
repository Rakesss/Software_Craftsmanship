-----------------------------------Abstraction---------------------------------------------------------------

Abstraction – Hiding Implementation Details
Focuses on what an object does rather than how it does it.

Helps in designing systems with clean interfaces and less complexity.

Achieved through abstract classes and interfaces.



------------------------------------Encapsulation--------------------------------------


Encapsulation – Hiding Data for Protection
Focuses on how an object maintains control over its own state.

Data (variables) is kept private, and access is controlled via getters/setters.



-----------------------------------------------Abstraction Example-------------------------------------------------



abstract class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo, double initialBalance) {
        this.accountNumber = accNo;
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);  // abstract method

    void showBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(int accNo, double initialBalance) {
        super(accNo, initialBalance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
}




--------------------------------------------------Encapsulation Example---------------------------------------------------



interface USBDevice {
    void connect();
    void disconnect();
}

class Keyboard implements USBDevice {
    public void connect() {
        System.out.println("Keyboard connected.");
    }

    public void disconnect() {
        System.out.println("Keyboard disconnected.");
    }
}



----------------------------------------------------Inheritance-----------------------------------------------------------
Inheritance is a mechanism in OOP where one class (called the child or subclass) inherits the properties and behaviors (fields and methods) from another class (called the parent or superclass).
