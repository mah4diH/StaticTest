package StaticTest;


import static StaticTest.Constants.INFINITY;
import static StaticTest.Constants.NOT_SET;

public class StaticBlock1 {
    static int b = 10; // class var
    public static final double PI = 3.1416;

    static double getAreaOfACircle(int radius) {
        if (radius == INFINITY) {
            return INFINITY;
        } else if (radius == NOT_SET) {
            return NOT_SET;
        }
        return PI * radius * radius;
    }

    static {
        System.out.println("this a block of this class 1 b:" + b);
        // we can access static var and static method here
    }

    static {
        System.out.println("this a block of this class 2");
    }

    int a = 5;

    { // init block
        System.out.println("init block 1 a:" + a + " " + b);
    }

    { // init block
        System.out.println("init block 2 a:" + a);
    }

    StaticBlock1() {
        System.out.println("this is the constructor");
    }

    public static void main(String[] args) {
//        StaticBlock1.main();
        StaticBlock1 sb = new StaticBlock1();
        StaticBlock1 sb1 = new StaticBlock1();
        // when a class is loaded in java,
        //      its static vars are initialized
        //      and its static blocks are executed
        //      if there are multiple static blocks, they are executed serially

        // when a object of a class is created,
        //      first the class must be loaded
        //      then the instance vars are initialized,
        //      then initialization block is executed.
        //      and then constructor is executed
    }
}
