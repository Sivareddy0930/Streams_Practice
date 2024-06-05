package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamObjectArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
//        List al = Arrays.stream(arr).collect(ArrayList::new, (list,value)->list.add(value),(list1,list2)->list1.addAll(list2));
        List al = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(al);


        String[] array = {"a", "b", "c"};
        List<String> l=Arrays.stream(array,1,3).collect(Collectors.toList());
        System.out.println(l);

    }
}
