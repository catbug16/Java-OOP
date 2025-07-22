public class Rectangle {
    double length;
    double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.0, 5.0);
        double area = rect.calculateArea();
        System.out.println("Area of Rectangle: " + area);
    }
}
