package Streams.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListINReverseOrder {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,9,10,5,6,7,8);
        List<Integer> way1 = l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(way1);
    }
}
