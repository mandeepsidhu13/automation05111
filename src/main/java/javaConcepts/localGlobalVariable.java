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
public class localGlobalVariable {
    int a; // global varaible
    static int b;
  //  String dd="";
  // java accept if you do not initialse global varaible takes value 0
   void sum(int x,int y) // local varaible
   {
       int z=x+y;
       System.out.println("result is : "+z);
   }
    
    public static void main(String[] args) {
        int c=10;// local // static
        // java  do not accept if you do not initialse local varaible
        localGlobalVariable obj= new localGlobalVariable();
        System.out.println("a is : "+obj.a); //a //0
        System.out.println("b is  :"+b); // obj.b //0
        System.out.println("c is  :"+c); //10
        obj.sum(10, 10); // 20
    }
}

// data types 
// int 0
// float 0.0
//double 0

// String -> class // has to be intialised //
