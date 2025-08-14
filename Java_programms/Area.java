class rsq {
    double radius;
rsq(double radius) {
        this.radius = radius;
    }
   double squareRadius() {
        return radius * radius;
    }
}
class CircleArea extends rsq {
 CircleArea(double radius) {
        super(radius); 
    }
  double calculateArea() {
        double rSquare = squareRadius(); 
        return Math.PI * rSquare;       
    }
}
public class Area {
    public static void main(String[] args) {
        CircleArea c = new CircleArea(6); 
        double area = c.calculateArea();
        System.out.println("Area of circle: " + area);
    }
}
