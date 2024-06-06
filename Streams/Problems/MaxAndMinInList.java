package Streams.Problems;


import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MaxAndMinInList {
    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(9,1,4,6,0,2,3,5,8);
       IntSummaryStatistics s=list.stream().collect(Collectors.summarizingInt(Integer::valueOf));
        System.out.println("max:-"+s.getMax());
        System.out.println("min:-"+s.getMin());
        //=====================================================================================

        IntSummaryStatistics instSummary=list.stream().mapToInt(Integer::intValue).summaryStatistics();
        System.out.println("max:-"+instSummary.getMax());
        System.out.println("min:-"+instSummary.getMin());



    }
}
