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
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Delhi", 324),
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
        System.out.println("-----------------------------------------------------");
        //7- Find the list of students whose age is less than 30
        List<Student> stud=list.stream().filter(Obj->Obj.getAge()<30).collect(Collectors.toList());
        System.out.println(stud);

        //8- Find the list of students whose rank is in between 50 and 100
        List<Student> studRank= list.stream().filter(Obj->Obj.getRank()>50 && Obj.getRank()<100).collect(Collectors.toList());
        System.out.println(studRank);

        //9- Find the average age of male and female students
        OptionalDouble avgAgeOfMale = list.stream().filter(Obj->Obj.getGender().toLowerCase().equals("male")).mapToInt(Obj-> Obj.getAge()).average();
        System.out.println(avgAgeOfMale.getAsDouble());
        OptionalDouble avgAgeOfFeMale = list.stream().filter(Obj->Obj.getGender().toLowerCase().equals("female")).mapToInt(Obj-> Obj.getAge()).average();
        System.out.println(avgAgeOfFeMale.getAsDouble());
        //-------------------------------------------------

        Map<String,Double> avgAge = list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingDouble(Student::getAge)));
        System.out.println(avgAge);

        //----------------------------------------------------
        //10- Find the department who is having maximum number of students
        Map<String, Long> map4 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));
        Optional<Long> result = map4.values().stream().max(Comparator.comparing(val->val));
        System.out.println(map4);
        System.out.println("maximum number of students:-"+result.get());
        //-----------------------------------------------------------------------
        Optional<Long> result1 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting())).values().stream().max(Comparator.comparing(value->value));

        System.out.println("maximum number of students:-"+result1.get());
        //-------------------------------------------------------------------
        Map.Entry<String, Long> result2 = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("maximum number of students:-"+result2);

        //========================================================================================

        //11- Find the Students who stays in Delhi and sort them by their names

        List<Student> list3 = list.stream().filter(Obj->Obj.getCity().toLowerCase().equals("delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
        System.out.println(list3);


        System.out.println("============================================================================");
        //12- Find the average rank in all departments

       Map<String,Double> avgRankInAllDept =  list.stream().collect(Collectors.groupingBy(Obj->Obj.getDepartmantName(),Collectors.averagingDouble(Student::getRank)));
        System.out.println(avgRankInAllDept);

        //13- Find the highest rank in each department

        Map<String, Optional<Student>> highRankInDep = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.maxBy(Comparator.comparing(value-> value.getRank()))));
        System.out.println(highRankInDep);

        //14- Find the list of students and sort them by their rank

        List<Student> sortBasedOnRank = list.stream().sorted(Comparator.comparing(Obj->Obj.getRank())).collect(Collectors.toList());
        System.out.println(sortBasedOnRank);

        //15- Find the student who has second rank
        List<Student> studentWithSecondRank =list.stream().sorted(Comparator.comparing(Obj->Obj.getRank())).skip(1).limit(1).collect(Collectors.toList());
        System.out.println(studentWithSecondRank);
    }
}
