package com.javarush.task.task29.task2909.human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class University {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        Student student = new Student(name, age, averageGrade);
        for (int i = 0; i < students.size(); i ++) {
            if (students.get(i).getAverageGrade()==averageGrade) {
                student = students.get(i);
            }
        }
        return student;
    }
    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        int maxAverage = 0;
        for (int i = 1; i < students.size(); i ++) {
            if (students.get(i).getAverageGrade()> students.get(maxAverage).getAverageGrade()) {
                maxAverage = i;
            }
        }
        return students.size()==0? null : students.get(maxAverage);
    }
    public Student getStudentWithMinAverageGrade() {
        int minAverage = 0;
        for (int i = 1; i < students.size(); i ++) {
            if (students.get(i).getAverageGrade()< students.get(minAverage).getAverageGrade()) {
                minAverage = i;
            }
        }
        return students.size()==0? null : students.get(minAverage);
    }

    public void expel(Student student) {
        //TODO:
        students.remove(student);
    }
}