package java8Features.lambdaExpression.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Virat", "Rohit", "Shubman", "Surya", "Pant", "Sanju", "Dube");

        Function<String, Integer> nameLength = name -> name.length();

        List<Integer> nameLengths = names.stream().map(nameLength).collect(Collectors.toList());

        System.out.println(nameLengths);
    }
}
