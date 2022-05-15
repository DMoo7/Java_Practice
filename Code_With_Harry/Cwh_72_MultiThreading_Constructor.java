class MyThreadWithConstructor1 extends Thread{
    public MyThreadWithConstructor1 (String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread1 is running");
    }
}

class MyThradWithConstructor2 extends Thread{
    public MyThradWithConstructor2(String name){
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Thread2 is running");
    }
}

public class Cwh_72_MultiThreading_Constructor {
    public static void main(String[] args) {
        MyThreadWithConstructor1 th1 = new MyThreadWithConstructor1("Harry");
        MyThradWithConstructor2 th2 = new MyThradWithConstructor2("Dishant");
        System.out.println(th1.getId() + th1.getName());
        System.out.println(th2.getId() + th2.getName());
        th1.start();
        th2.start();

    }
}
