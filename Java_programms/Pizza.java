
class Pizza{
  String Size;
   String type;
   int price;
    Pizza() {
      Size="medium";
      type="paneer tikka pizza";
      price=199;
 }
}
class Main {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
       System.out.println("-----pizza details-----"); 
      System.out.println("Price:" + p1.price);  
      System.out.println("Size: "+ p1.Size); 
      System.out.println("type: " + p1.type);
  } 
}
