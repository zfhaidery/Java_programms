class Coffee{
  String Size;
   String type;
   int price;
   Coffee() {
      Size="medium";
      type="lattee";
      price=150;
    }
}
class Main {
    public static void main(String[] args) {
        Coffee p1 = new Coffee();
        System.out.println("-----Coffee details-----");
        System.out.println( " Price: " + p1.price);
      System.out.println( " Size: " + p1.Size);
      System.out.println( " type: " + p1.type);
    }
}
