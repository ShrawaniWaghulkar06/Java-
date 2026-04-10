class RailwayReservation {

    private int availableTickets = 2; // total tickets

    // synchronized method to book ticket
    synchronized void bookTicket(String passengerName) {
        if (availableTickets > 0) {
            System.out.println(passengerName + " is booking ticket...");
            availableTickets--;
            System.out.println("Ticket booked successfully for " + passengerName);
        } else {
            System.out.println("No tickets available for " + passengerName);
        }
    }
}

// Thread class
class Passenger extends Thread {
    RailwayReservation rr;
    String name;

    Passenger(RailwayReservation rr, String name) {
        this.rr = rr;
        this.name = name;
    }

    public void run() {
        rr.bookTicket(name);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        RailwayReservation rr = new RailwayReservation();

        Passenger p1 = new Passenger(rr, "A");
        Passenger p2 = new Passenger(rr, "B");
        Passenger p3 = new Passenger(rr, "C");

        p1.start();
        p2.start();
        p3.start();
    }
}