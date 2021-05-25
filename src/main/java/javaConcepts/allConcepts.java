package javaConcepts;

public class allConcepts {
    allConcepts() {    this(10);    System.out.println("1");   }  
    allConcepts(int a) {    System.out.println("2");}
    {   System.out.println("3");  }
    static {    System.out.println("4");   }  
    static int a;   int b;
    void setData() {
        a = a + 10;
        b = b + 10;        }
    void display() {
        System.out.println("a is  : " + a);
        System.out.println("b is : " + b);
        a += 5;
        b += 5;   }
    void setData2(int a, int b) {
        this.a = 10 + b;
        b = b + 10;
    }

   public static void main(String[] args) {
        allConcepts obj1 = new allConcepts();
        obj1.setData();
        obj1.display();
        obj1.setData2(50, 100);
        allConcepts obj2 = new allConcepts();
        obj2.setData();
        obj2.display();
        obj2.setData2(100, 200);
    }

}
