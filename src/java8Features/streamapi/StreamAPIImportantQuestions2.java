package java8Features.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAPIImportantQuestions2 {

    public static void main(String[] args) {

        //Question: Write a program to find the maximum value in a list of integers using streams.
        List<Integer> list = Arrays.asList(1,4,2,6,9,11,7,21,14);
        Optional<Integer> reduce = list.stream().reduce(Integer::max);
        reduce.ifPresent(System.out::println);

        //Question: Write a program to find the distinct characters in a list of strings using streams.
        List<String> list2 = Arrays.asList("Amir", "Adil", "Nahid", "Urmi", "Zakiya");
        list2.stream().flatMap(name -> name.chars().mapToObj(c -> (char) c)).collect(Collectors.toSet())
                .forEach(System.out::println);

        //Question: Write a program to count the number of strings that start with a vowel in a list of strings using streams.
        List<String> list3 = Arrays.asList("Amir", "Adil", "Nahid", "Urmi", "Zakiya");
        long count = list3.stream().filter(name -> "aeiou".contains(name.substring(0, 1).toLowerCase())).count();
        System.out.println(count);

    }
}
