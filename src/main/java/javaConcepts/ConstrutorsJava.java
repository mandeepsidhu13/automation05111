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
public class ConstrutorsJava {
    /* special methods
    1. it does not have any return type
    2. same name as class name
    3. they called automatically when the object is created
    */
 // return type   function name ()  {  }
    void display()
    {
        System.out.println("display function");
    }
    
    ConstrutorsJava()
    {
        System.out.println("special method");
    }
    
    public static void main(String[] args) {
        ConstrutorsJava obj = new ConstrutorsJava();
        //obj.display(); // function call 
    }
    
}
