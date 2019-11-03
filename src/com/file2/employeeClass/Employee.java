package com.file2.employeeClass;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return getFirstName()+" "+getLastName();
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return getSalary()*12;
    }

    public int raiseSalary(int percent){
        return getSalary()+getSalary()*percent/100;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name="+getName()+
                ", salary=" + salary +
                '}';
    }
}