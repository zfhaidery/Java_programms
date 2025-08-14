class Car{
    Car(){
        System.out.println("This is a car.");
    }
}
class Brand extends Car{
    Brand(){
        System.out.println("Its brand name is mercedes-Benz");
    }
}
class Speed extends Brand{
    Speed()
    {
        System.out.println("352 km/hr");
    }
}
public class Cardetails{
    public static void main(String[] args){
    Speed c=new Speed();
    }
}
