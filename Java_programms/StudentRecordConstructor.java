class StudentRecord{
  String Name;
   String result;
   int Marks;
   StudentRecord(String Name,String result,int Marks) {
      this.Name=Name;
      this.result=result;
      this.Marks=Marks;
 }
}
class Main {
    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord("Samntha","PASS",89);
        System.out.println("-----Student Record-----"); 
        System.out.println("Name: " + s1.Name);  
        System.out.println("Result: "+ s1.result); 
        System.out.println("Marks: " + s1.Marks);
    }
}
 