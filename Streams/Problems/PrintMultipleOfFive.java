package Streams.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintMultipleOfFive {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,9,10,5,6,7,8);
       l.stream().filter(value->value%5==0).forEach(System.out::println);
    }
}
