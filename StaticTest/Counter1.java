package StaticTest;

class Counter1{
    int count=0;//will get memory each time when the instance is created

    Counter1(){
        count++;//incrementing value
        System.out.println(count);
    }

    public static void main(String args[]){
        //Creating objects
        Counter1 c1=new Counter1();
        Counter1 c2=new Counter1();
        Counter1 c3=new Counter1();

        StaticBlock sb = new StaticBlock();
    }
}
