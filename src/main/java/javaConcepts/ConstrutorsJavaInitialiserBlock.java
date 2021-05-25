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
public class ConstrutorsJavaInitialiserBlock {

    {
//InitialiserBlock // they get execute when object is created 
        System.out.println("abc 1");
    }

    {
        System.out.println("abc 2");
    }

    {
        System.out.println("abc 3");
    }

    ConstrutorsJavaInitialiserBlock() {
        System.out.println("special method");
    }

    public static void main(String[] args) {
        ConstrutorsJavaInitialiserBlock obj = new ConstrutorsJavaInitialiserBlock();
        // when object is created then  first it call initialiserBlock and then constructor
    }
}
