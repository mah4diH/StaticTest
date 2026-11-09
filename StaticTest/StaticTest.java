package StaticTest;

// java program to demonstrate restriction on static methods
public class StaticTest {
    // instance variable
    public int b = 20;
    // static variable // class variable
    static int a = 10;
    // static method
    static void m1() {
        a = 20;
        System.out.println("from m1");

        // Cannot make a static reference to the non-static field b
//         b = 10; // compilation error
//
//        // Cannot make a static reference to the
//        // non-static method m2() from the type Test
//         m2();  // compilation error
//
//        //  Cannot use super in a static context
//         System.out.println(super.a); // compiler error
//         System.out.println(this.a); // compiler error
    }
    // instance method
    void m2() {
        System.out.println("from m2");
    }

    public static void main(String[] args) {
        // main method
//        StaticTest.a = 12;
//        StaticTest.m1();
//        // How can we access m2() and b?
//        StaticTest obj = new StaticTest();
//        obj.b = 12;
//        obj.m2();
        System.out.println("Hello");
        StaticDemo1.n1 = "Fariha";

    }
} 