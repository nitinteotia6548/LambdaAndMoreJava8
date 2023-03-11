import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {

        int [] number1 = {1,2,3,4};
        int key1 = 2;

        process(number1, key1, (v,k) -> System.out.println(v+k));
        process(number1, key1, (v,k) -> System.out.println(v/k));
        process(number1, key1, (v,k) -> System.out.println(v-k));

        //catching exceptions in lambda
        int [] number2 = {1,2,3,4, 5};
        int key2 = 0;

        process(number2, key2, (v,k) -> {
            try{
                System.out.println(v+k);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception " + e.getMessage());
            }
        });
        process(number2, key2, (v,k) -> {
            try{
                System.out.println(v/k);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception " + e.getMessage());
            }
        });
        process(number2, key2, (v,k) -> {
            try{
                System.out.println(v-k);
            }
            catch (ArithmeticException e) {
                System.out.println("Arithmetic Exception " + e.getMessage());
            }
        });

        //catching exceptions using a wrapper lambdaExceptionHandling method
        int [] number3 = {1,2,3};
        int key3 = 0;

        process(number3, key3, wrapperLambdaMethod((v,k) -> System.out.println(v+k)));
        process(number3, key3, wrapperLambdaMethod((v,k) -> System.out.println(v/k)));
        process(number3, key3, wrapperLambdaMethod((v,k) -> System.out.println(v-k)));
    }

    private static BiConsumer<Integer, Integer> wrapperLambdaMethod(BiConsumer<Integer, Integer> consumer) {
        return (v,k) -> {
            try {
                consumer.accept(v,k);
            }
            catch (ArithmeticException e){
                System.out.println("Arithmetic Exception in Lambda Wrapper" + e.getMessage());
            }
        };
    }

    private static void process(int[] number, int key, BiConsumer<Integer, Integer> consumer) {
        for(int i: number) {
            consumer.accept(i, key);
        }
    }
}
