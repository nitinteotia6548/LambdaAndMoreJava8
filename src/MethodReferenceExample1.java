public class MethodReferenceExample1 {

    public static void main(String[] args) {
        Thread t1 = new Thread(()-> printMessage()); // this one is doing method execution (Lambda expression). it works like this, () -> method()
        Thread t2 = new Thread(MethodReferenceExample1::printMessage); // this one is doing method execution (Method reference)
        t1.start();
        t2.start();
    }

    public static void printMessage() {
        System.out.println("Hello");
    }
}
