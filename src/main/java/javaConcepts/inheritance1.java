/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaConcepts;

class base {

    public void add(int a, int b) {
        int c = a + b;
        System.out.println("result is  : " + c);
    }

    public void sub(int a, int b) {
        int c = a - b;
        System.out.println("result is  : " + c);
    }

}
//java does not support mutiple inheritance
// it support single, muti-level

class derived extends base {

    public void mul(int a, int b) {
        int c = a * b;
        System.out.println("result is  : " + c);
    }

    public void div(int a, int b) {
        int c = a / b;
        System.out.println("result is  : " + c);
    }
}

public class inheritance1 {

    public static void main(String[] args) {
        derived obj = new derived();
        obj.add(10, 10);
        obj.sub(20, 10);
        obj.mul(10, 10);
        obj.div(20, 10);
    }
}
