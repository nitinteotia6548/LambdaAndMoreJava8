package basics;

public class OopsGreeter {

    public static void main(String[] args) {
        OopsGreeter oopsGreeter = new OopsGreeter();

        //instance of class greeting
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        oopsGreeter.greet(helloWorldGreeting);
        oopsGreeter.greet(() -> System.out.println("Print"));

        //lambda greeting
        Greeting lambda = () -> System.out.println("Print");

        PrintLambda printLambda = () -> System.out.println("Print");

        //inner class, anonymous class greeeting
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };

        oopsGreeter.greet(lambda);
        oopsGreeter.greet(innerClassGreeting);

//        doubleNumberFunction = (int a) -> a * 2;

        AddFunctionLambda addFunction = (int a, int b) -> a + b;

//        safeDivideFunction = (int a, int b) -> {
//          if (b==0) return 0;
//          return a/b;
//        };

//        stringLengthCountFunction = (String s) -> s.length();
    }

    private void greet(Greeting greeting) {
        greeting.perform();
    }

    interface PrintLambda {
        void print();
    }

    interface AddFunctionLambda {
        int add(int a, int b);
    }
}
