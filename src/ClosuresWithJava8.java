public class ClosuresWithJava8 {

    public static void main(String[] args) {
        int a = 10;
        int b=20; // this value is final by default
        doProcess(a, p -> System.out.println(p+b)); // this lambda expression freezes the value of b and take it
            // changing value of variables inside the lambda when passed is not allowed
    }

    public static void doProcess(int i, Process p){ //here Process carries it
        p.process(i);
    }
}
