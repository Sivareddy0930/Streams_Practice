package Streams.Problems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumbers {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> even = l.stream().filter(val->val%2==0).collect(Collectors.toList());
        List<Integer> odd = l.stream().filter(val->val%2 !=0).collect(Collectors.toList());
        System.out.println(even);
        System.out.println(odd);
    }
}
