    class Studentdetails{
    String Name;
    String address;
    String mobile;
    void Student1(String Name,String address, int mobile){
     this.Name=Name;
     this.address=address;
     this.mobile=mobile;
    }
    }
    class Studentresult extends Studentdetails{
    int Studid;
   int marks;
   String result;
   void setResult(int Studid,int marks,String result)
   {
    this.Studid=Studid;
    this.marks=marks;
    this.result=result;
    }
     void displayIdAndResult() {
        System.out.println("Student ID: " + Studid);
        System.out.println("Result: " + result);
    }
}
public class Main {
    public static void main(String[] args) {
    Studentresult s1 = new Studentresult();
    s1.Student1("cherry", "raipur", 123456789);
    s1.setResult(101, 88, "Pass");
    s1.displayIdAndResult();
    }
    }
