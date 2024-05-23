package java8Features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIImportantQuestions {

    public static void main(String[] args) {

        //Question: Write a program to filter out even numbers from a list and collect the result into a new list.
        List<Integer> list = Arrays.asList(1,4,2,6,9,11,7,21,14);
        System.out.println(list.stream().filter(n -> n%2 == 0).collect(Collectors.toList()));

        //Question: Write a program to convert a list of strings to uppercase using streams.
        List<String> list2 = Arrays.asList("Amir", "ADil", "Nahid", "Urmi", "Zakiya");
        System.out.println(list2.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()));
        list2.stream().map(name -> name.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);

        //Question: Write a program to find the sum of all elements in a list using streams.
        List<Integer> list3 = Arrays.asList(1,4,2,6,9,11,7,21,14);
        System.out.println(list3.stream().reduce(0, Integer::sum));

        //Question: Write a program to sort a list of strings in alphabetical order using streams.
        List<String> list4 = Arrays.asList("Amir", "ADil", "Nahid", "Urmi", "Zakiya");
        list4.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

        //Question: Write a program to group a list of strings by their length using streams.
        List<String> list5 = Arrays.asList("Amir", "Adil", "Nahid", "Urmi", "Zakiya");
        list5.stream().collect(Collectors.groupingBy(name -> name.length()))
                .forEach( (count, name) -> System.out.println(count + " -> " + name));

        //Question: Write a program to partition a list of integers into even and odd using streams
        List<Integer> list6 = Arrays.asList(1,4,2,6,9,11,7,21,14);
        list6.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .forEach( (isEven, numbers) -> System.out.println(isEven + " -> " + numbers ));

        list6.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0))
                .forEach( (isEven, numbers) -> {
                    String type = isEven ? "Even" : "Odd";
                    System.out.println(type + " -> " + numbers );
                });



    }
}
