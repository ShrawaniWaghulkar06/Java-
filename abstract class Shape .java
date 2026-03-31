abstract class Shape {
    abstract void calculate_area();

    void display_info() {
        System.out.println("Shape Info");
    }
}

class Circle extends Shape {
    void calculate_area() {
        System.out.println("Circle Area = " + (3.14 * 2 * 2));
    }
}

class Rectangle extends Shape {
    void calculate_area() {
        System.out.println("Rectangle Area = " + (4 * 5));
    }
}

class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();

        s1.display_info();
        s1.calculate_area();

        s2.display_info();
        s2.calculate_area();
    }
}