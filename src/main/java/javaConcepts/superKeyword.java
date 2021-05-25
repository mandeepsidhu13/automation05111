package javaConcepts;

class baseC {

    baseC() {
        System.out.println("1");
    }

    void display() {
        System.out.println("display in base class");
    }
}

public class superKeyword extends baseC {

    public superKeyword() {
        this(10);
        System.out.println("2");
    }

    void display() {
        super.display();
        System.out.println("display in derived class");
        super.display();
    }

    superKeyword(int a) {
        super();
        System.out.println("3");
    }

    public static void main(String[] args) {
        superKeyword obj = new superKeyword();
        obj.display();
    }
}
