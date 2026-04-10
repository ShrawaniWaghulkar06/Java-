class DownloadManager implements Runnable {

    private String fileName;

    // Constructor
    DownloadManager(String fileName) {
        this.fileName = fileName;
    }

    // Run method
    public void run() {
        try {
            System.out.println("Downloading " + fileName + "...");

            for (int i = 1; i <= 3; i++) {
                Thread.sleep(1000); // simulate download time
                System.out.println(fileName + " progress " + i);
            }

            System.out.println(fileName + " Download Complete!");
        } catch (InterruptedException e) {
            System.out.println(fileName + " Download Interrupted");
        }
    }

    public static void main(String[] args) {

        // Creating multiple threads
        Thread t1 = new Thread(new DownloadManager("File1"));
        Thread t2 = new Thread(new DownloadManager("File2"));
        Thread t3 = new Thread(new DownloadManager("File3"));

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}