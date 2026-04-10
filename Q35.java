class BankApplication {

    static void processTransaction() throws Exception {
        boolean error = false;

        if (error) {
            throw new Exception("Transaction failed");
        } else {
            System.out.println("Transaction processed");
        }
    }

    public static void main(String[] args) {
        try {
            processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}