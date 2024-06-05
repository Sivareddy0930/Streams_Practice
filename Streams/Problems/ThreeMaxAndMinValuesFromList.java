package Streams.Problems;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ThreeMaxAndMinValuesFromList {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(9,1,4,6,0,2,3,5,8);

        List<Integer> min = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(min);

        List<Integer> max = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(max);

    }
}
