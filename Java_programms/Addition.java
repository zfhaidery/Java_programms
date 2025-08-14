class MathCalculator{
  int Add(int a,int b)
  {
    return a+b;
  }
  int Add(int a,int b,int c){
    return a+b+c;
  }
  double Add(double a,double b)
  {
    return a+b;
  }
}
public class Addition{
  public static void main(String[]args){
    MathCalculator m=new MathCalculator();
    System.out.println(m.Add(5,10));
    System.out.println(m.Add(5,10,15));
    System.out.println(m.Add(5.5,4.3));  
  }}
