class MyThread1 extends Thread{
    @Override
    public void run(){
        int i;
        while(true){
            System.out.println("Thread1 is cooking");
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i;
        while(true){
            System.out.println("Thread2 is chatting");
        }
    }
}




public class Cwh_70_MultiThreading {
    public static void main(String[] args) {
        MyThread1 th1 = new MyThread1();
        MyThread2 th2 = new MyThread2();
        th2.start();
        th1.start();
    }
}
