package com.example.jwtexample;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        /*
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 30, 70000, "HR"),
                new Employee("Bob", 35, 80000, "IT"),
                new Employee("Charlie", 40, 90000, "IT"),
                new Employee("David", 25, 50000, "Finance"),
                new Employee("Eve", 28, 60000, "HR")
        );

        //department wise salary
       Map<String, Optional<Double>> map =  employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.mapping(Employee::getSalary, Collectors.maxBy(Double::compare))));
        System.out.println(map);

        //average salary of the employees older than 30
        double avg = employees.stream().filter(emp -> emp.getAge() > 30 ).mapToDouble(Employee::getSalary).average().orElse(0.0);
        System.out.println("avg = " + avg);

        //list of employees sorted by salary, then by name
        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());
        System.out.println("sortedEmployees = " + sortedEmployees);

        //counting employees in each dept
        Map<String, Long> map1=  employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
        System.out.println("map1 = " + map1);

        //List of employees having salary more than average salary
        double avgSalary =  employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
        List<Employee> empList =  employees.stream().filter(emp -> emp.getSalary() > avgSalary).toList();
        System.out.println("empList = " + empList);
        */
        //reversing each word of the string
        String s = "This is a string of which we want to reverse each word";
        String reversedString = Arrays.stream(s.split("\s+")).map( str -> new StringBuffer(str).reverse()).collect(Collectors.joining(" "));
        System.out.println(reversedString);

        String reverseStr  =Arrays.stream(s.split("")).reduce((a,b) -> b+a).orElse(" ");
        System.out.println("reverseStr = " + reverseStr);

    }
}

