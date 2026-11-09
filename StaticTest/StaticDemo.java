package StaticTest;// A java program to demonstrate use of
// static keyword with methods and variables 

// Student class 
class Student {
    String name;
    int rollNo;
    // static variable 
    static String versityName;
    // static counter to set unique roll no 
    static int counter = 0;
    int counter2 = 0;

    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        counter++;
        counter2++;
    }

    // instance method
    void getStudentInfo() {
        System.out.println("name : " + this.name);
        System.out.println("rollNo : " + this.rollNo);
        // accessing static variable 
        System.out.println("versityName : " + versityName);
    }
}

//Driver class 
public class StaticDemo {
    public static void main(String[] args) {
        // calling static method 
        // without instantiating Student class 
        Student.versityName = "UIU";
        Student s1 = new Student("Alice", 1);
        // counter 1 counter2 1
        Student s2 = new Student("Bob", 2);
        // counter 2 counter2 1
        s1.getStudentInfo();
        s2.getStudentInfo();
        Student s3 = new Student("Nice", 5);
        // counter 3 counter2 1
        // what is the value of the counter?
        System.out.println(Student.counter);
        System.out.println(s1.counter2); //1
        System.out.println(s2.counter2); //1
        System.out.println(s3.counter2); //1
    }
} 