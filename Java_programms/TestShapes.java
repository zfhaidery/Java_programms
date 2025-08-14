class Shape {
    double area() {
        return 0; 
    }
}
class Circle extends Shape {
    double radius;
     Circle(double r) {
        radius = r;
    }
   @Override
    double area() {
        return 3.14 * radius * radius;
    }
}
class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) {
        length = l;
        width = w;
    }
   @Override
    double area() {
        return length * width;
    }
}
class Triangle extends Shape {
    double base, height;
    Triangle(double b, double h) {
        base = b;
        height = h;
    }
   @Override
    double area() {
        return 0.5 * base * height;
    }
}
public class TestShapes {
    public static void main(String[] args) {
        Shape s;
        s = new Circle(5);
        System.out.println("Area of Circle: " + s.area());
        s = new Rectangle(4, 6);
        System.out.println("Area of Rectangle: " + s.area());
        s = new Triangle(3, 5);
        System.out.println("Area of Triangle: " + s.area());
    }}
