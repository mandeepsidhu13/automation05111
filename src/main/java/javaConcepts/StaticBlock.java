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
public class StaticBlock {
    //  i want to display hello on the output screen without writing anything in main method, but can write any where else
    // it is possible -> static block 
    
    static{
        System.out.println("Hello 1");
        int a =10;
        int b=20;int c=a+b;
        System.out.println("result is  : "+c);
    }
    static{
        System.out.println("Hello 2");
    }
     static{
        System.out.println("Hello 4");
    }
    public static void main(String[] args) {
        System.out.println("World");
    }
    
     static{
        System.out.println("Hello 3");
    }
    // static block get execute before the main method only once  throughout the program
     // you can have as many as static block and all of them get execute in the sequence you wrote
}
