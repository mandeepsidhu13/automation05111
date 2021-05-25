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
public class ConstrcutorOverloading {
    // multiple constructors having same name with different list of arguments
    // no of arguments, type of arguments, order of arguments
    ConstrcutorOverloading()
    {
        System.out.println("1");
    }
    ConstrcutorOverloading(int a)
    {
        System.out.println("2"); 
    }
    ConstrcutorOverloading(char a)
    {
        System.out.println("3"); 
    }
    ConstrcutorOverloading(int a,char b)
    {
        System.out.println("4"); 
    }
    ConstrcutorOverloading(char a,int b)
    {
        System.out.println("5"); 
    }
    public static void main(String[] args) {
        ConstrcutorOverloading obj = new ConstrcutorOverloading();
        ConstrcutorOverloading obj1 = new ConstrcutorOverloading(10);
        ConstrcutorOverloading obj2 = new ConstrcutorOverloading('c');
        ConstrcutorOverloading obj3 = new ConstrcutorOverloading(10,'c');
        ConstrcutorOverloading obj4 = new ConstrcutorOverloading('c', 10);
    }
}
// Static block
// intialiser block
// constructor
// types of constructors
// constructors overloading


