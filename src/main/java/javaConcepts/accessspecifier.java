package javaConcepts;

/*
access specifier in java ? 
1.  private 
2. proetected
3. public 
4.  default
 */
// if i have any private varaible and i want to access that outside the class ?
// we can ? No -> 
// indirectly you can how ?
// we can create public methods for that varbile (getter and setter)

class base1 {
    private int a=30;  protected int b;
    public int c=10;  int d; // default
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
public class accessspecifier extends base1 {
    public static void main(String[] args) {
accessspecifier obj= new accessspecifier();
        System.out.println("c is  : "+obj.c);
        obj.c=20;
            System.out.println("c is  : "+obj.c);
        System.out.println("a is  : "+obj.getA());
        obj.setA(50);
            System.out.println("a is  : "+obj.getA());
    }

}
