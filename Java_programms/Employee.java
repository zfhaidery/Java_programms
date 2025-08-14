class Employee{
  String Name;
   int id;
   int sal;
   Employee(int id,String Name,int sal) {
      this.Name=Name;
      this.id=id;
      this.sal=sal;
 }
}
class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1221,"Zainab fatima haidery",24000);
      System.out.println("-----Employee details-----"); 
      System.out.println("Name: " + e1.Name);  
      System.out.println("ID: "+ e1.id); 
      System.out.println("Salary: " + e1.sal);
   }
}
