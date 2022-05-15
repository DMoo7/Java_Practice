class MyThreadRunnable1 implements Runnable{
    @Override
    public void run() {
        if(true){
            System.out.println("MyThread1");
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    @Override
    public void run() {
        if(true){
            System.out.println("MyThread2 is running");
        }
    }
}

public class Cwh_71_MultiThreading_Runnable_interface {

    public static void main(String[] args) {
        MyThreadRunnable2 th2 = new MyThreadRunnable2();
        MyThreadRunnable1 th1 = new MyThreadRunnable1();
        Thread gun1 = new Thread(th1);
        Thread gun2 = new Thread(th2);
        gun1.start();
        gun2.start();
    }
}
