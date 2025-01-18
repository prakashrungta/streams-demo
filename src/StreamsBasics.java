import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StreamsBasics {
        public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//      List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7); //new java Feature
//      List<Integer> list = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);



         List<Integer> listEven = new ArrayList<>();

        for(Integer i:arrayList)
        {
            if(i%2 == 0)
                listEven.add(i);

        }
        System.out.println(listEven);
        //Using Stream


        List<Integer> newList2 = arrayList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("newList2 " +  newList2);

        List<Integer> collect = arrayList.stream().filter(i -> i > 3).collect(Collectors.toList());
        System.out.println("collect " +  collect);

            Stream<Object> emptyStream = Stream.empty();


            String names[] = {"Durgesh", "Uttam", "Ankit, Divya"};

            Stream<String> streams1 = Stream.of(names);
             streams1.forEach(e->{
                 System.out.println(e);
             });
            ;
            Stream<Object> streamBuilder = Stream.builder().build();

            IntStream stream = Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7});
            stream.forEach(e->{
                System.out.println(e);
            });


            List<Integer> list2 = new ArrayList<>();
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
            list2.add(5);

            Stream<Integer> stream1 = list2.stream();
            stream1.forEach(e->{
                System.out.println(e);
            });
        }
}
