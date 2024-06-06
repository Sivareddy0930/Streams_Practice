package Streams.Problems;


import java.util.*;
import java.util.stream.Collectors;

public class SumAndAverageOfAllElementsInArray {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(9,1,4,6,0,2,3,5,8);
        int sum = Arrays.stream(list.toArray()).mapToInt(value ->(int)value).sum();
        //Arrays.stream(list.toArray())     returns stream of objects.
        OptionalDouble average = Arrays.stream(list.toArray()).mapToInt(value ->(int)value).average();

        System.out.println("sum:-"+sum);
        System.out.println("average:-"+average.getAsDouble());
//=================================================================================================

        IntSummaryStatistics stats = Arrays.stream(list.toArray()).mapToInt(value ->(int)value).summaryStatistics();
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());

        //========================================================================================================



        Integer[] array = list.toArray(new Integer[0]);

        // Calculate the sum using an array stream
        int sum1 = Arrays.stream(array).mapToInt(Integer::intValue).sum();
        //Arrays.stream(array)     returns stream of Integers.
        //convert Integer to int by using Integer.intValue() method.




    }
}
