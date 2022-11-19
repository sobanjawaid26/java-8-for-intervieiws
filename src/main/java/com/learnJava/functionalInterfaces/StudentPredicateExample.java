package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class StudentPredicateExample {

    static Predicate<Student> p1 = s -> s.getGradeLevel()>=3;
    static Predicate<Student> p2 = s -> s.getGpa()>=3.9;

    static void filterByGPA(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s ->{
            if(p2.test(s))
                System.out.println(s.getName() + " -> " + s.getGpa());
        });
    }

    static void filterByGradeLevel(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s ->{
            if(p1.test(s))
                System.out.println(s.getName() + " -> " +s.getGradeLevel());
        });
    }

    public static void filterBoth(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(s -> {
            if(p1.and(p2).test(s)){ //.or .negate
                System.out.println(s.getName() + " -> " +s.getGradeLevel() + " and " + s.getGpa());
            }
        });
    }

    public static void main(String[] args) {
        filterByGPA();
        System.out.println("--------------------");
        filterByGradeLevel();
        System.out.println("--------------------");
        filterBoth();
    }
}
