class BookOrdered{
  String title;
   String Author;
   int price;
   BookOrdered(String title,String Author,int price) {
      this.title=title;
      this.Author=Author;
      this.price=price;
 }
 BookOrdered(BookOrdered b)
 {
     this.title=b.title;
     this.Author=b.Author;
     this.price=b.price;
 }
 void display()
 {
      System.out.println("Title=" +title);
       System.out.println("Auhtor=" + Author);
        System.out.println("Price=" + price);
     }
}
class Main {
    public static void main(String[] args) {
    BookOrdered b1 = new BookOrdered("Peer e Kamil","Umera Ahmed",387);
    BookOrdered b2= new BookOrdered(b1);
    System.out.println("-----Firstly ordered Record-----");
    b1.display();
    System.out.println("-----Again ordered Record-----");
    b2.display();
    int totalBill=b1.price+b2.price;
    System.out.println("\nTotal Bill= Rs. " + totalBill);
    }
}
