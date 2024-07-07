import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams_practice {
    public static void main(String[] args) {
        List<String> al= Arrays.asList("apple","cat","mango","banana");

        List<String> naturalOrder =al.stream().sorted().collect(Collectors.toList());
        List<String> descOrder =al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        List<String> revOrder =al.stream().collect(Collectors.collectingAndThen(
                Collectors.toList(),
                newList -> {
                    Collections.reverse(newList);
                    return newList;
                }
        ));

        System.out.println(naturalOrder);
        System.out.println(descOrder);
        System.out.println(revOrder);
    }
}
