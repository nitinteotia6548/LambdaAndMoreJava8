package basics;

public class RunnableExample {

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() { //anonymous class
            @Override
            public void run() {
                System.out.println("Printed inside runnable");
            }
        });

        myThread.run();

        Thread lambdaThread = new Thread(() -> System.out.println("Printed inside Lambda runnable"));
        lambdaThread.run();
    }
}
