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
public class TypesofConstrutors {
    /*
    3 types of constructors
    1. default  constructor
        we do not write  default  constructor,  complier will add default  constructor when there 
    is no contructor is the class( there is not body )
        TypesofConstrutors()  { }
    
    2. no - arg constructor
         TypesofConstrutors()  {  .... ......  ..}
    
    3. parameterized constructor
        TypesofConstrutors(int a,......,.... ,.....)  {  .... ......  ..}
    */

    TypesofConstrutors()
    {
        System.out.println("no arg const");
    }
    TypesofConstrutors(int a)
    {
        System.out.println("parm 1 const");
    }
   
    public static void main(String[] args) {
        TypesofConstrutors obj = new TypesofConstrutors();
        TypesofConstrutors obj1= new TypesofConstrutors(10);
    }
}
