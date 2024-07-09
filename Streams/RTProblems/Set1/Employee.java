package Streams.RTProblems.Set1;

public class Employee {
    private String name;

    private String dept;
    private long mobile;

    public Employee(String name, String dept, long mobile, double salary) {
        this.name = name;
        this.dept = dept;
        this.mobile = mobile;
        this.salary = salary;
    }

    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", mobile=" + mobile +
                ", salary=" + salary +
                '}';
    }
}
