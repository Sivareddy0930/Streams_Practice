package Streams.Problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FrequencyOfEachElementInArray {
    public static void main(String[] args) {
        int arr[] ={9,1,4,6,0,2,3,5,4000,4,9,1,4,5,4000,4,9,1,4,6,0,2,4};
//       Map<Object,Long> freq= Arrays.stream(arr).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//       The arr array is of type int[], which is a primitive type. The Arrays.stream(arr) call for a primitive int array returns an IntStream, which does not directly support Collectors.groupingBy and Function.identity().
//You need to convert the IntStream to a Stream<Integer> before collecting the elements.

//        Map<Integer,Long> freq= Arrays.stream(arr).mapToObj(val->val).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //same as below
        Map<Integer,Long> freq= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(freq);

    }
}
