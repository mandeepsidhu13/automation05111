/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaConcepts;

/**
 *
 * @author mandeepkaur
 */
public class staticVaraible {
    int a;
    static int b;// they will share the preallocated memory to them
    // when new object is craeted it will refere to the previous memory
    // its does not create new memory allocation for the varaible
    // they get shared with all the objects created.
    
    void setData() {
        a = a + 20;
        b = b + 30;
    }
    void display() {
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
    }
    public static void main(String[] args) {
staticVaraible obj= new staticVaraible();
obj.setData();
obj.display();
staticVaraible obj2= new staticVaraible();
obj2.setData();
obj2.display();
    }
}
