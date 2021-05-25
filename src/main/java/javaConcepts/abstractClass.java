
package javaConcepts;
/*
a class is abract if 
    1. if you do not allow any other class to make a object of thic class
2. if this class have at least one method abstract
3. if a class is abstrct then this class must have 1 method which is abstrct
+ one method which is not abstract 

 because if all the methods are abstarct then  that is not class it become interface

*/
abstract class b // you can create the object of this class 
{
     void fun()
    {
        System.out.println("abc");
    }
    abstract void fun2();
  abstract void fun3();
}


abstract public class abstractClass extends b {
  
   void fun2(){ }

   
    
}
