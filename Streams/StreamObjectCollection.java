package Streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamObjectCollection {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);

        List<Integer> el=l.stream().filter(a-> a%2 == 0).collect(Collectors.toList());
        System.out.println(el);

        Set<String> s=new HashSet(Arrays.asList("okay","appy","buppy","cuppy","duppy"));
        List<String> ns=s.stream().collect(Collectors.toList());
        System.out.println(ns);

        Map<Integer,String> m=new HashMap();
        m.put(1,"apple");
        m.put(2,"banana");
       Map<Integer,String> nm= m.entrySet().stream().collect(Collectors.toMap((entry)->entry.getKey()*2,(entry)->entry.getValue()));
        System.out.println(nm);
    }
}
