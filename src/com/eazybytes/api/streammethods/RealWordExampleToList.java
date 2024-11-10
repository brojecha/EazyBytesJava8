package com.eazybytes.api.streammethods;

import java.util.List;
import java.util.stream.Stream;

/**
 * The Stream.toList() method is used to collect the elements of a stream into an immutable list.
 * This method is particularly useful for converting streams into lists for further processing or manipulation.
 */

public class RealWordExampleToList {
    static class Employee {
        String name;
        double salary;

        Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return name + ": " + salary;
        }
    }

    public static void main(String[] args) {
        Stream<Employee> employeeStream = Stream.of(
                new Employee("John", 10000),
                new Employee("Smith", 20000),
                new Employee("Jane", 30000)
        );

        // Use toList() to collect elements into a list
        List<Employee> empList = employeeStream.toList();

        // Print the elements of the list
        for(Employee emp : empList){
            System.out.println(emp);
        }
    }
}
