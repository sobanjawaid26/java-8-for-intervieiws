package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> nameAndActivitiesConsumer = (name, activity) -> {
            System.out.println("name : " + name + ", activity : " + activity);
        };
        List<Student> listOfStudent = StudentDataBase.getAllStudents();
        listOfStudent.forEach(student -> nameAndActivitiesConsumer.accept(student.getName(),student.getActivities()));
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b) ->{
            System.out.println("a : " + a + ", b : " + b);
        };
        BiConsumer<Integer, Integer> multiply = (a,b) -> {
            System.out.println("Multiply : " + a*b);
        };
        BiConsumer<Integer,Integer> division = (a,b) -> {
            System.out.println("Division : " + a/b);
        };

        multiply.andThen(division).accept(10,5);
        biConsumer.accept("java7", "java8");

        nameAndActivities();
    }
}
