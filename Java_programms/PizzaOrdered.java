class PizzaOrdered{
  String type;
   String Size;
   int price;
   PizzaOrdered(String type,String Size,int price) {
      this.type=type;
      this.Size=Size;
      this.price=price;
 }
 PizzaOrdered(PizzaOrdered p)
 {
     this.type=p.type;
     this.Size=p.Size;
     this.price=p.price;
 }
 void display()
 {
     System.out.println("-----order-----");
      System.out.println("Type=" +type);
       System.out.println("Size=" + Size);
        System.out.println("Price=" + price);
     
 }
}
class Main {
    public static void main(String[] args) {
        PizzaOrdered p1 = new PizzaOrdered("Paneer tikka pizza","Medium",199);
        PizzaOrdered p2= new PizzaOrdered(p1);
     p1.display();
     p2.display();
     int totalBill=p1.price+p2.price;
       System.out.println("\nTotal Bill= Rs. " + totalBill);
    }
}
