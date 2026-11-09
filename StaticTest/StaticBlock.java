package StaticTest;


import static StaticTest.Constants.ACCESS_DENIED;
import static StaticTest.Constants.INFINITY;

public class StaticBlock {

    static final double PI = 3.1416;

    static double getAreaOfCircle(int radius) {
        if (radius >= INFINITY) {
            return INFINITY;
        }
        return PI * radius * radius;
    }


    static int b = 10; // class var

    static {
        System.out.println("this a block of this class 1 b:" + b);
        // we can access static var and static method here
    }

    static {
        System.out.println("this a block of this class 2");
    }

    int a = 5;//instance var

    { // init block
        System.out.println("this a block of this object a:" + a);
    }

    { // init block
        System.out.println("this a block of this object 2 a:" + a);
    }

    StaticBlock() {
        System.out.println("this is the constructor");
    }

    public static void main(String[] args) {
//        StaticBlock sb = new StaticBlock();
        // when a class is loaded in java,
        //      its static vars are initialized
        //      and its static blocks are executed

        // when a object of a class is created,
        //      first the class must be loaded
        //      then the instance vars are initialized,
        //      then initialization block is executed.
        //      and then constructor is executed
        getAreaOfCircle(4);
        System.out.println(ACCESS_DENIED);
    }
}
