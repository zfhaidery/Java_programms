  void ShowPerson(){
    System.out.println("this is a person.");
  }
}
class Student extends Person{
  void ShowStudent()
  {
    System.out.println("This is a Student.");
  }
}
class Employee extends Person{
  void ShowEmployee(){
    System.out.println("This is an employee. ");
  }
}
class Manager extends Employee{
    void ShowManager(){
    System.out.println("he is manager.");
  }
}
public class HybridEx{
  public static void main(String[]args){
    Manager m=new Manager();
    m.ShowPerson();
    m.ShowEmployee();
    m.ShowManager();
    Student s=new Student();
    s.ShowPerson();
    s.ShowStudent();
   }
}
