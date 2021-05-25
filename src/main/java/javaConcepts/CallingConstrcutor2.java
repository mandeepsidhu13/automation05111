/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaConcepts;

/**
 * How we can call one constructor from the other Constructor in the same class
 */
public class CallingConstrcutor2 {

    CallingConstrcutor2() {
        System.out.println("1");

    }

    CallingConstrcutor2(int a) {
        this();
        System.out.println("2");
    }

    public static void main(String[] args) {
        //CallingConstrcutor2 obj = new  CallingConstrcutor2();
        CallingConstrcutor2 obj2 = new  CallingConstrcutor2(10);
    }
}
