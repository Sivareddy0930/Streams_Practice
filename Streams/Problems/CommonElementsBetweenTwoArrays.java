package Streams.Problems;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoArrays {
    public static void main(String[] args) {
        int arr1[] ={9,1,4,6,0,2,3,1004};
        int arr2[] ={9,4000,4,6,2};

        List<Integer> list= Arrays.stream(arr2).boxed().collect(Collectors.toList());

        Arrays.stream(arr1).filter(value->list.contains(value)).forEach(System.out::println);

    }
}
