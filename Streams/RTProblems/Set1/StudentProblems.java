package Streams.RTProblems.Set1;

import java.util.*;
import java.util.stream.Collectors;

public class StudentProblems {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));



        //1- Find list of students whose first name starts with alphabet A

        List<Student> list1 =list.stream().filter(Obj->Obj.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println(list1);

        //2- Group The Student By Department Names

        Map<String,List<Student>> map2= list.stream().collect(Collectors.groupingBy(Obj->Obj.getDepartmantName()));
        System.out.println(map2);
//        Map<String,List<Student>> map1= list.stream().collect(Collectors.groupingBy(Obj->Obj.getDepartmantName(),Collectors.toList()));
//        System.out.println(map1);

        //3- Find the total count of student using stream

        Long count =list.stream().count();
        System.out.println("count:-"+count);

        //4- Find the max age of student

        list.stream().map(Obj->Obj.getAge()).sorted(Comparator.reverseOrder()).limit(1).forEach(value->System.out.println("MaxAge:-"+value));
        //---------------------
        OptionalInt maxAge= list.stream().mapToInt(Obj->Obj.getAge()).max();
        System.out.println("MaxAge:-"+maxAge.getAsInt());

        OptionalInt maxAge1= list.stream().mapToInt(Student::getAge).max();
        System.out.println("MaxAge:-"+maxAge1.getAsInt());

        //5- Find all departments names
        List<String> allDep = list.stream().map(Student::getDepartmantName).distinct().collect(Collectors.toList());
        //Obj->Obj.getDepartmantName() ======>  Student::getDepartmantName
        System.out.println(allDep);

        //6- Find the count of student in each department

        Map<String,Long> map3=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));
        //Obj->Obj.getDepartmantName()   ===> Student::getDepartmantName

        System.out.println(map3);
    }
}
