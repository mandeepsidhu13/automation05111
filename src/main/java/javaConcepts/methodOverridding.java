package javaConcepts;
class base3
{
      void display()
      {
          System.out.println("method in base class");
      }
}
public class methodOverridding  extends base3{
     void display() // same signature 
      {
          System.out.println("method in derived class");// change in definition
      }
    public static void main(String[] args) {
        // ref                                                  object
     methodOverridding obj= new methodOverridding();
     obj.display();
     base3 obj1= new base3();
     obj1.display();
     base3 obj2= new methodOverridding();
     obj2.display();

  
     
    }
}
