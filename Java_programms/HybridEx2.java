class Father{
  void ShowFather(){
    System.out.println("this is the father.");
  }
}
class Daughter extends Father{
  void ShowDaughter()
  {
    System.out.println("This girl is the father's daughter.");
  }
}
class Son extends Father{
  void ShowSon(){
    System.out.println("This boy is the son of a father. ");
  }
}
class Grandchild extends Son{
    void ShowGrandchild(){
    System.out.println("this Son's child is grandchild of father.");
  }
}
public class HybridEx2{
  public static void main(String[]args){
    Grandchild m=new Grandchild();
    m.ShowFather();
    m.ShowSon();
    m.ShowGrandchild();
    Daughter s=new Daughter();
    s.ShowFather();
    s.ShowDaughter();  
  }
}
