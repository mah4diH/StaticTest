package StaticTest;


public class StaticDemo1 {

    static String n1 = examName("OOP");

    static {
        // block
        System.out.println("a");
        n1 = "1";
        n1 = "2";
    }

    public static String examName(String s) {
        System.out.println(s);
        return s;
    }

    public StaticDemo1() {
        n1 = "a";
    }

    //    {
//        n1 = examName("A");
//        System.out.println("here1");
//    }
//
//    static {
//        n1 = examName("C");
//        System.out.println("here2");
//    }
//
//    public StaticDemo1() {
//        System.out.println("here3");
//    }
//


    public static void main(String[] args) {
//        StaticDemo1 sd = new StaticDemo1();
//        System.out.println("Hello");
    }
}
