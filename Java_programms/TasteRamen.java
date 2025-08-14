  Ramen(){
    System.out.println("This is Ramen");
  }
}
class SpicyRamen extends Ramen{
  SpicyRamen()
  {
    System.out.println("Buldak Carbonara is spicy.");
  }
}
class MildRamen extends Ramen{
  MildRamen(){
    System.out.println("paldo Gomtang is milder option.");
  }
}
public class TasteRamen{
  public static void main(String[]args){
    SpicyRamen S=new SpicyRamen();
    MildRamen M=new MildRamen();
  }
}
