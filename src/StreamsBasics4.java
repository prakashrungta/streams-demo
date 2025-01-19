import java.util.function.Predicate;

public class StreamsBasics4 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello form Thread");
        });
        t1.start();

        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subtractOperation = (a, b) -> a - b;

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(3));


    }

    // lambda experession doesnot have public modifier , return type and name
    // Functional  interface  is an interface which has only one abstact method and can be used for holding lambda

    interface MathOperation {
        int operate(int a, int b);
    }

}



