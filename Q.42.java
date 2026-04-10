class BankingSystem {

    private int balance = 1000; // initial balance

    void withdraw(String user, int amount) {
        synchronized (this) {   // synchronized block
            if (balance >= amount) {
                System.out.println(user + " is withdrawing " + amount);
                balance -= amount;
                System.out.println(user + " remaining balance: " + balance);
            } else {
                System.out.println("Insufficient balance for " + user);
            }
        }
    }
}

// Thread class
class User extends Thread {
    BankingSystem bank;
    String name;
    int amount;

    User(BankingSystem bank, String name, int amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(name, amount);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        User u1 = new User(bank, "A", 500);
        User u2 = new User(bank, "B", 700);
        User u3 = new User(bank, "C", 300);

        u1.start();
        u2.start();
        u3.start();
    }
}