package Streams.Problems;


import java.util.*;
import java.util.stream.Collectors;

public class ReverseAnIntegerArray {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(9,1,4,6,0,2,3,5,8);

        List outList = Arrays.stream(list.toArray())
                 .collect(Collectors.collectingAndThen(
                         Collectors.toList(),
                         newList->{
                             Collections.reverse(newList);
                             return newList;
                         }
                         ));
        System.out.println(outList);



    }
}
