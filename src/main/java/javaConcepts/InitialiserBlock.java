/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaConcepts;

/**
 * Hello abc 1 abc 2 abc 3 World abc 1 abc 2 abc 3
 */
public class InitialiserBlock {

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

    // you can have as many as  InitialiserBlock block and all of them get execute in the sequence you wrote
    public static void main(String[] args) {
        InitialiserBlock obj = new InitialiserBlock();
        System.out.println("World");
        InitialiserBlock obj2 = new InitialiserBlock();
    }

    static {
        System.out.println("Hello");
    }
    // static block get execute before the main method only once throughout the program
    // you can have as many as static block and all of them get execute in the sequence you wrote
}
