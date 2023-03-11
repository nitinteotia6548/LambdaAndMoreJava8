public class Closures {

    public static void main(String[] args) {
        int a = 10;
        int b=20; // this value is final by default
        doProcess(a, new Process() {
            @Override
            public void process(int i) { //this method is executed in doProcess method
                System.out.println(i+b); // the value of b is stored in java runtime and used when method gets executed
            }
        });
    }

    public static void doProcess(int i, Process p){ //here
        p.process(i);
    }
}

interface Process {
    void process(int i);
}
