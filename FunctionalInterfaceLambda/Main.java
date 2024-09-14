package FunctionalInterfaceLambda;

public class Main {

    public static void main(String[] args) {

        MyFunctionalInterface i1 = new MyFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("My first anonymous class.");
            }
        };

        MyFunctionalInterface i2 = new MyFunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("My Second anonymous class.");
            }
        };

        i1.sayHello();
        i2.sayHello();

        // same task using Lambda expression

        MyFunctionalInterface i3 = () -> {
            System.out.println("My third using lanbda expression.");
        };

        MyFunctionalInterface i4 = () -> {
            System.out.println("My fourth using lambda expression.");
        };

        i3.sayHello();
        i4.sayHello();

        // lambda expression in MultiThread

        Runnable thread1 = () -> {

            try {
                for (int i = 0; i<=10; i++) {
                    System.out.println(i);
                }
                Thread.sleep(1000);
                } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable thread2 = () -> {
            try {
                for (int i = 0; i<=10; i++) {
                    System.out.println(i * 3);
                }
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        thread1.run();
        thread2.run();

    }

}
