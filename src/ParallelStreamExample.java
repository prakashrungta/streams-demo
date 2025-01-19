import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        // A list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Process the list using a parallel stream
        int sum = numbers.parallelStream()
                         .mapToInt(Integer::intValue) // Convert Integer to int
                         .sum(); // Sum the integers

        System.out.println("Sum using parallel stream: " + sum);

        // Demonstrating parallel processing
        numbers.parallelStream().forEach(num ->
            System.out.println(Thread.currentThread().getName() + " processing " + num)
        );
    }
}
