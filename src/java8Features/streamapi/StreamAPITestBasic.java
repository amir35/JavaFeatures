package java8Features.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPITestBasic {

    public static void main(String[] args) {

        List<String> morethan4 =
                Stream.of("Amir", "Adil", "Zakiya", "Nahid", "Urmi").filter(name -> name.length() > 4).
                        map(name -> name.toUpperCase()).collect(Collectors.toList());

        System.out.println(morethan4);
    }
}
