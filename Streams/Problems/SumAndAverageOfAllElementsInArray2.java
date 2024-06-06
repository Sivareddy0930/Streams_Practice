package Streams.Problems;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;

public class SumAndAverageOfAllElementsInArray2 {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(9,1,4,6,0,2,3,5,8);


        //========================================================================================================



        Integer[] array = list.toArray(new Integer[0]);

        // Calculate the sum using an array stream
        int sum = Arrays.stream(array).mapToInt(Integer::intValue).sum();
        //Arrays.stream(array)     returns stream of Integers.
        //convert Integer to int by using Integer.intValue() method.
        OptionalDouble average = Arrays.stream(array).mapToInt(Integer::intValue).average();

        System.out.println("sum:-"+sum);
        System.out.println("average:-"+average.getAsDouble());


//=================================================================================================

        IntSummaryStatistics stats = Arrays.stream(array).mapToInt(Integer::intValue).summaryStatistics();
        System.out.println(stats.getSum());
        System.out.println(stats.getAverage());





    }
}
