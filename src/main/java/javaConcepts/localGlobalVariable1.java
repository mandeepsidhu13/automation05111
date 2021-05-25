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
public class localGlobalVariable1 {
    int a; // global variable
    void sum(int a, int b) {// local variable
    //    a = a;// local
        this.a=a; // global
        b = b;
        int c = a + b;
        System.out.println("result is : " + c);
    }
    void display() {
        System.out.println("a is :" + a);
    }
// if you have same name for the local and global variable 
    public static void main(String[] args) {
        localGlobalVariable1 obj = new localGlobalVariable1();
        obj.sum(10, 10); // 20 
        obj.display();//10
    }
}
