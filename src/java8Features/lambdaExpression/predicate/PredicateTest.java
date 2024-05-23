package java8Features.lambdaExpression.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Virat", "Rohit", "Shubman", "Surya", "Pant", "Sanju", "Dube");

        Predicate<String> morethan4 = name -> name.length() > 4;

        List<String> longNames = names.stream().filter(morethan4).collect(Collectors.toList());

        System.out.println(longNames);

        String str = "Mohd Amir Ahmad";

        // Define an IntPredicate to filter out spaces
        IntPredicate str1 = c -> c != ' ';

        // Filter the spaces and collect the result back to a String
        String str2 = str.chars().filter(str1).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());

        // Print the result
        System.out.println(str2); // Output: MohdAmirAhmad


    }
}
