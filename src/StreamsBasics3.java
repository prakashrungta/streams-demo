import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsBasics3 {

    public static void main(String[] args) {

        //Self practise- Day 2
        System.out.println("Hello world again Day 2");
        List<Integer> list = Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
        Integer integer = list.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(integer);

        long count = list.stream().count();
        System.out.println("count" + count);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list" + sortedList);

        //Sort the list ins ascending then filter even nos and square them up and print
        list.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);

        List<Integer> newSortedSquareList = list.stream().
                sorted()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(newSortedSquareList);
        newSortedSquareList.forEach(System.out::println);

        // Add the above values
        int result = list.stream()
                .sorted()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (c, e) -> c + e);
        System.out.println("sum of the list " + result);


        int resultsum = list.stream()
                .sorted()
                .map(n -> n * n)
                .reduce(0, (x, y) -> x + y);

        System.out.println("resultsum " + resultsum);

    }


}

