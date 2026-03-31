// ===================== 11. Hierarchical Inheritance =====================
class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle Area = " + (3.14 * 2 * 2));
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area = " + (4 * 5));
    }
}

// ===================== 12. Payment System =====================
abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by Credit Card: " + amount);
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by UPI: " + amount);
    }
}

class NetBankingPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid by NetBanking: " + amount);
    }
}

// ===================== 13. Employee Bonus =====================
abstract class Emp {
    String name;
    int id;
    abstract double calculateBonus();
}

class Manager extends Emp {
    double salary = 50000;
    double calculateBonus() {
        return salary * 0.2;
    }
}

class Developer extends Emp {
    double salary = 40000;
    double calculateBonus() {
        return salary * 0.1 + 2000;
    }
}

// ===================== 14. Multilevel Inheritance =====================
class Person {
    void role() {
        System.out.println("Person");
    }
}

class Employee1 extends Person {
    void role() {
        System.out.println("Employee");
    }
}

class Manager1 extends Employee1 {
    void role() {
        System.out.println("Manager");
    }
}

// ===================== 15. Ride Fare =====================
abstract class Ride {
    int distance;
    Ride(int d) {
        distance = d;
    }
    abstract void calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int d) { super(d); }
    void calculateFare() {
        System.out.println("Bike Fare: " + (distance * 5));
    }
}

class AutoRide extends Ride {
    AutoRide(int d) { super(d); }
    void calculateFare() {
        System.out.println("Auto Fare: " + (distance * 8));
    }
}

class CarRide extends Ride {
    CarRide(int d) { super(d); }
    void calculateFare() {
        System.out.println("Car Fare: " + (distance * 12));
    }
}

// ===================== 16. Staff =====================
class Staff {
    void work() {
        System.out.println("Staff working");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treating patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assisting doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist managing desk");
    }
}

// ===================== 17. Static Employee Count =====================
class EmployeeCount {
    static int count = 0;

    EmployeeCount() {
        count++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + count);
    }
}

// ===================== 18. Final Variable =====================
class Bank {
    final float rate = 5.0f;

    void calculateInterest(double amount) {
        System.out.println("Interest: " + (amount * rate / 100));
    }
}

// ===================== 19. Array of Books =====================
class Book {
    String title, author;
    float price;

    Book(String t, String a, float p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println(title + " " + author + " " + price);
    }
}

// ===================== 20. this Keyword =====================
class EmployeeThis {
    String name;
    double salary;

    EmployeeThis(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println(name + " " + salary);
    }
}

// ===================== MAIN CLASS =====================
public class Main {
    public static void main(String[] args) {

        // 11
        Circle c = new Circle();
        c.display();
        c.area();

        // 12
        Payment p = new UPIPayment();
        p.pay(1000);

        // 13
        Emp e = new Manager();
        System.out.println("Bonus: " + e.calculateBonus());

        // 14
        Person p1 = new Manager1();
        p1.role();

        // 15
        Ride r = new CarRide(10);
        r.calculateFare();

        // 16
        Staff s = new Doctor();
        s.work();

        // 17
        new EmployeeCount();
        new EmployeeCount();
        EmployeeCount.showCount();

        // 18
        Bank b = new Bank();
        b.calculateInterest(10000);

        // 19
        Book b1 = new Book("Java", "A", 500);
        Book b2 = new Book("Python", "B", 600);
        b1.display();
        b2.display();

        // 20
        EmployeeThis et = new EmployeeThis("Riya", 30000);
        et.display();
    }
}