/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaConcepts;

/**
 How we can call one constructor from the other Constructor in the same class
 */
public class CallingConstrcutor1 {
    CallingConstrcutor1()
    {
        this(10);
        // this is the first statement
        // you should not wroite your code in such a way so that
        // we can reach in recursion mode
        System.out.println("1");
   
    }
    CallingConstrcutor1(int a)
    {
  
        System.out.println("2");
    }
    public static void main(String[] args) {
         CallingConstrcutor1 obj = new  CallingConstrcutor1();
        //CallingConstrcutor obj2 = new  CallingConstrcutor(10);
    }
}
