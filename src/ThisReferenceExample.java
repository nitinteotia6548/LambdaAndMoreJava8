public class ThisReferenceExample {

    private void doProcess(int i, Process p) {
        p.process(i);
    }

    public static void main(String[] args) {

        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {

                System.out.println("Value of i "+i);
                System.out.println(this); // gives the instance of the class - thisReferenceExample
            }

            @Override
            public String toString() {
                return "This is anonymous inner class";
            }
        });
    }
}
