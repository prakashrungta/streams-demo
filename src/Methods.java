import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args){

        //filter(Predicate ) // predicate is true then only filter
        //boolean value function
        //recommended is lambda
        //e-> true
        //e->{
            // return true}



        //map element pai kaam hoga
        /* each element you perform operation*/
        // if you want to return the same element then use it

        //map(function)


        List<String> names = List.of("Aman","Ankit","Abhinav", "Durgesh");
        List<String> newNames = names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        System.out.println("args = " + newNames);

        names.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );

        newNames.stream().forEach(System.out::println);



        //using map
        List<Integer> integerList = List.of(7,1, 2, 3, 4, 5, 6);
        List<Integer> integerSquaredList = integerList.stream().map(i -> i * i).collect(Collectors.toList());
        System.out.println(integerSquaredList);


        //sort
        integerList.stream().sorted().forEach(System.out::println);
        List<Integer> collect = integerList.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);

        //min Element
        Integer minElement = integerList.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println(minElement);

        //Max Element
        Integer maxElement = integerList.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println(maxElement);
    }

}
