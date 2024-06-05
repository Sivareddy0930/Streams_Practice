package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfMethod {
    public static void main(String[] args) {
       Stream<Integer> s= Stream.of(6,7,8,9,1,2,3,4,5,10);
       List<Integer> l = s.sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(l);
    }
}
