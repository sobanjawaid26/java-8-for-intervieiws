package com.learnJava.functionalInterfaces;

import com.learnJava.data.Student;
import com.learnJava.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer2 = student -> System.out.println(student);
    static Consumer<Student> consumer3 = student -> System.out.println(student.getName());
    static Consumer<Student> consumer4 = student -> System.out.println(student.getActivities());
    static Consumer<Student> consumer5 = student -> System.out.println(student.getGradeLevel());


    public static void printStudent(){
        List<Student> listOfStudent = StudentDataBase.getAllStudents();
        //listOfStudent.forEach(consumer2);
        listOfStudent.forEach(consumer3.andThen(consumer4)); // Consumer chaining
    }

    public static void printStudentUsingCondition(){
        List<Student> listOfStudent = StudentDataBase.getAllStudents();
        //listOfStudent.forEach(consumer2);
        listOfStudent.forEach((student -> {
            if(student.getGradeLevel()>=3 && student.getGpa()>=3.9){
                consumer3.andThen(consumer4).andThen(consumer5).accept(student);
            }
        })); // Consumer chaining
    }

    public static void main(String[] args) {

        Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
        consumer1.accept("java8");

        System.out.println("Printing all students!");
        //printStudent();
        printStudentUsingCondition();
    }
}
