class Restaurant {

    private boolean foodAvailable = false;

    // Chef (Producer)
    synchronized void prepareFood() {
        try {
            if (foodAvailable) {
                wait(); // wait if food already prepared
            }
            System.out.println("Chef prepared food");
            foodAvailable = true;
            notify(); // notify waiter
        } catch (InterruptedException e) {
            System.out.println("Chef interrupted");
        }
    }

    // Waiter (Consumer)
    synchronized void serveFood() {
        try {
            if (!foodAvailable) {
                wait(); // wait if no food available
            }
            System.out.println("Waiter served food");
            foodAvailable = false;
            notify(); // notify chef
        } catch (InterruptedException e) {
            System.out.println("Waiter interrupted");
        }
    }
}

// Chef Thread
class Chef extends Thread {
    Restaurant r;

    Chef(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

// Waiter Thread
class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Restaurant r = new Restaurant();

        Chef chef = new Chef(r);
        Waiter waiter = new Waiter(r);

        chef.start();
        waiter.start();
    }
}