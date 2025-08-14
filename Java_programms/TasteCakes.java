class SweetDish
{
  void Cake(){
    System.out.println("I like cakes as dessert.");
  }
}
class Chocolate extends SweetDish{
  @Override
  void Cake(){
    System.out.println("I like Chocolate cake.");
  }
}
class Vanilla extends SweetDish{
  @Override
  void Cake(){
    System.out.println("I also like vanilla flavoured cake");
  }
}
class Strawberry extends SweetDish{
  @Override
  void Cake(){
    System.out.println("Strawberry is not my favourite");
  }
}
public class TasteCakes{
  public static void main(String[]args)
  {
    SweetDish s;
    s=new Chocolate();
    s.Cake();
    s=new Vanilla();
    s.Cake(); 
    s=new Strawberry();
    s.Cake();
    }
}
