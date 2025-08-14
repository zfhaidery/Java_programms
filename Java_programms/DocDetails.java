class Doctor{
  void DocName(){
    System.out.println("doctor's name is zainab fatima.");
  }
}
class Specialization extends Doctor{
  void Docspec(){
    System.out.println("specialization is dermatology.");
  }
}
class HospitalName extends Specialization{
  void HospName(){
    System.out.println("Works in AIIMS");
  }
}
public class DocDetails{
  public static void main(String[] args){
    HospitalName h=new HospitalName();
    h.DocName();
    h.Docspec();
    h.HospName();
  }
}
