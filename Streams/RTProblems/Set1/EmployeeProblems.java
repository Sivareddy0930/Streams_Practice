package Streams.RTProblems.Set1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeProblems {
    public static void main(String[] args) {
        List<Employee> empList =new ArrayList<>();
        empList.add(new Employee("Firoz","IT",123456789l,30000.00));
        empList.add(new Employee("Appy","cse",126789l,10000.00));
        empList.add(new Employee("spy","mech",456789l,20000.00));
        empList.add(new Employee("snap","electric",1234l,50000.00));
        empList.add(new Employee("tppy","robotic",123456l,35000.00));
        empList.add(new Employee("hppy","mecatronics",6789l,40000.00));
        empList.add(new Employee("sppy","IT",12789l,45000.00));
        empList.add(new Employee("jppy","cse",12389l,30000.00));

       List<Employee> result1= empList.stream().filter((empObj)->empObj.getDept().startsWith("c")).collect(Collectors.toList());
        System.out.println(result1);
        List<Double> result2 = empList.stream().map((empObj)->empObj.getSalary()).collect(Collectors.toList());
        System.out.println(result2);

        List<Double> result3= empList.stream().filter((empObj)->empObj.getDept().startsWith("c")).map((empObj)->empObj.getSalary()).collect(Collectors.toList());
        System.out.println(result3);
    }


}
