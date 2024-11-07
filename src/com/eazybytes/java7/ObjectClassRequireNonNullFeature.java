package com.eazybytes.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectClassRequireNonNullFeature {
    public static void main(String[] args) {
        Person person = null;
        processPersonData(person);
    }

    /**
     * @param person
     *
     * To Handel the null check in java 7 we can use Objects.requireNonNull.
     * It will help gracefully to handel Null Pointer Exception in case of null values.
     */
    private static void processPersonData(Person person) {
        Objects.requireNonNull(person,"person cannot be null");
        Objects.requireNonNull(person.getFirstName(),"firstName cannot be null");
        Objects.requireNonNull(person.getLastName(),"lastName cannot be null");
        Objects.requireNonNull(person.getAge(),"age cannot be null");
        List<Person> personList = new ArrayList<>();
        Person person1 = new Person();
        person1.setFirstName("John");
        person1.setLastName("Doe");
        person1.setAge(30);
        personList.add(person1);
        personList.stream().filter(p -> Boolean.parseBoolean(p.getFirstName().toLowerCase())).forEach(System.out::println);
    }
}

class Person{
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
