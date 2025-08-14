class BeautyProduct{
    int price;
    String brand;
    String Product;
    public BeautyProduct(int price,String brand,String Product){
    this.price=price;
    this.brand=brand;
    this.Product=Product;
    }
}
public class MakeUp {
    public static void main(String[] args) {
        BeautyProduct c1=new BeautyProduct(799, "Maybelline", "Fit Me Matte + Poreless Foundation");
        System.out.println(c1.price);
        System.out.println(c1.brand);
        System.out.println(c1.Product);
    }
}
