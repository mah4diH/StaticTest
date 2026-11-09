package StaticTest;

public class dTestStatic {

    dTestStatic sd = new dTestStatic();

    void method1() {
        method4();  // 1
        dTestStatic.method2(); // 2
//        dTestStatic.method3(); // 3

    }

    static void method2() {
    }

    void method3() {
        method1(); //4
        method2(); //5
        sd.method2(); //6
    }

    static void method4() {
    }
}
