class Curry{
  Curry(){
    System.out.println("This is Curry");
  }
}
class Chicken extends Curry{
  Chicken()
  {
    System.out.println("It's Chicken Curry.");
  }
}
class Fish extends Curry{
    Fish(){
    System.out.println("It's Fish Curry.");
  }
}
public class Currystyles{
  public static void main(String[]args){
    Chicken C=new Chicken();
    Fish F=new Fish();
  }}
