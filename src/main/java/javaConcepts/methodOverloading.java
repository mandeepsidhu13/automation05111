package javaConcepts;
//when we want to do same function with different no and type of inputs
// it does not depend on return type but it must have diff list of arguments
// no of arguements , type of arguments , order of arguments

public class methodOverloading {

    void sum(int a, int b) {
        int c = a + b;
        System.out.println("the result is  : " + c);
    }

    int sum(int a, int b, int d) {
        int c = a + b + d;
        System.out.println("the result is  : " + c);
        return c;
    }

    void sum(float a, float b) {
        float c = a + b;
        System.out.println("the result is  : " + c);
    }

    void sum(int a, float b) {
        float c = a + b;
        System.out.println("the result is  : " + c);
    }

    void sum(float b, int a) {
        float c = a + b;
        System.out.println("the result is  : " + c);
    }

    public static void main(String[] args) {
        methodOverloading obj = new methodOverloading();
        obj.sum(2.5f, 2.6f);
        obj.sum(3.5f, 10);
        obj.sum(20, 2.5f);
        obj.sum(10, 10);
        obj.sum(10, 20, 30);
    }

}
