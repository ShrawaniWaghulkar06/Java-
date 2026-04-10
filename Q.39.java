class OnlineShoppingSystem {

    // Payment Thread
    static class Payment extends Thread {
        public void run() {
            try {
                System.out.println("Processing payment...");
                Thread.sleep(2000); // simulate payment time
            } catch (InterruptedException e) {
                System.out.println("Payment interrupted");
            }
        }
    }

    // Order Processing Thread
    static class OrderProcessing extends Thread {
        public void run() {
            try {
                Thread.sleep(1000); // ensure payment starts first
                System.out.println("Order confirmed...");
            } catch (InterruptedException e) {
                System.out.println("Order interrupted");
            }
        }
    }

    public static void main(String[] args) {

        Payment p = new Payment();
        OrderProcessing o = new OrderProcessing();

        p.start();
        o.start();
    }
}