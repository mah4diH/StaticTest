package StaticTest;

public class cTestStatic {

    final String exam1 = "O";
    final String exam3;
    static String exam2 = "C";

    {
        // CODE SNIPPET 1
        System.out.println(exam1);
    }

    {
        // CODE SNIPPET 1
        exam3 = "3";
        System.out.println("e" + exam1);
    }


    static {
        // CODE SNIPPET 2
        System.out.println("e" + exam2);
    }

    static {
        // CODE SNIPPET 2
        System.out.println(exam2);
    }

    public static void main(String[] args) {
        cTestStatic demo = new cTestStatic();
    }
}
