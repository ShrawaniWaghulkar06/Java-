class ChatApplication {

    // Thread for Sending Messages
    static class Sender extends Thread {
        public void run() {
            try {
                System.out.println("Sender Thread State: " + Thread.currentThread().getState());

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Sending message " + i);
                    Thread.sleep(1000); // simulate delay
                }

            } catch (InterruptedException e) {
                System.out.println("Sender interrupted");
            }
        }
    }

    // Thread for Receiving Messages
    static class Receiver extends Thread {
        public void run() {
            try {
                System.out.println("Receiver Thread State: " + Thread.currentThread().getState());

                for (int i = 1; i <= 3; i++) {
                    System.out.println("Receiving message " + i);
                    Thread.sleep(1200); // simulate delay
                }

            } catch (InterruptedException e) {
                System.out.println("Receiver interrupted");
            }
        }
    }

    public static void main(String[] args) {

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Thread lifecycle states
        System.out.println("Sender State (New): " + sender.getState());
        System.out.println("Receiver State (New): " + receiver.getState());

        sender.start();
        receiver.start();

        System.out.println("Sender State (Runnable): " + sender.getState());
        System.out.println("Receiver State (Runnable): " + receiver.getState());
    }
}