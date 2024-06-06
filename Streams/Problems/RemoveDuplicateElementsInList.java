package Streams.Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElementsInList {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,9,10,5,6100,12,40,99,9,10,5,6,7,8);
        List<Integer> dist = l.stream().distinct().collect(Collectors.toList());
        System.out.println(l);
        System.out.println(dist);


        //====================================================================
        Set<Integer> dist1 = l.stream().collect(Collectors.toSet());
        System.out.println(dist1);


    }
}
