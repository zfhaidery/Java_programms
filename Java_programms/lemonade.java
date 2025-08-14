class lemonade{
    int price;
    String ingredients;
    public lemonade(int price,String ingredients){
    this.price=price;
    this.ingredients=ingredients;
}
}
class Main {
    public static void main(String[] args) {
        lemonade c1=new lemonade(150, "Black salt,lemon juice, sugar");
        System.out.println("Ingredients" + c1.ingredients);
        System.out.println("Price:" + c1.price);
 }
}
