class AreaCalculator{
  double Area(double r)
  {
    return 3.14*r*r;
  }
double Area(double l,double w){
  return l*w;
}
double Area(int b,int h){
  return 0.5*b*h;
}
}
public class OverloadArea{
public static void main(String[]args){
    AreaCalculator c=new AreaCalculator();
    System.out.println("Area of Circle:" +c.Area(5.0));
    System.out.println("Area of Circle:" +c.Area(4.0,6.0));
    System.out.println("Area of Circle:" +c.Area(3.0,5.0));
  }
} 
