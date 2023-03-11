public class ThisReferenceExampleJava8 {

    private void doProcess(int i, Process p) {
        p.process(i);
    }

    public void execute() {
        doProcess(10, i-> {
            System.out.println("value of i "+i);
            System.out.println(this); //this refers to the instance of the object on which this is being called - thisReferenceExample
        });
    }

    public static void main(String[] args) {

        ThisReferenceExampleJava8 thisReferenceExample = new ThisReferenceExampleJava8();
        thisReferenceExample.doProcess(10, i -> {
            System.out.println("value of i "+i);
//            System.out.println(this); -> does not work
        });

        thisReferenceExample.execute();
    }

    @Override
    public String toString() {
        return "This is main ThisReferenceExampleJava8 class instance";
    }
}
