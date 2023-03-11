package basics;

public class TypeInferenceExample {

    public static void main(String[] args) {

        //one way to do the functinality to print
        StringLengthLambda stringLengthWay1 = (s) -> s.length();
        StringLengthLambda stringLengthWay2 = s -> s.length(); // for 1 input argument
        StringLengthLambda stringLengthWay3 = (String s) -> s.length();
        System.out.println(stringLengthWay1.getLength("Hello Lambda"));
        System.out.println(stringLengthWay2.getLength("Hello Lambda"));
        System.out.println(stringLengthWay3.getLength("Hello Lambda"));

        //another way
        printLambda(s-> s.length());
        printLambda((s) -> s.length());
        printLambda((String s) -> s.length());
    }

    public static void printLambda(StringLengthLambda lambda) {
        System.out.println(lambda.getLength("Hello World"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
