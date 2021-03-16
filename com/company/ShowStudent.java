package com.company;

public class ShowStudent {

    public static void main(String[] args) {

        Student stu1 = new Student();

        stu1.setCredits(3);
        stu1.setID(1920593);
        stu1.setPoints(12);

        double gpa = stu1.getPoints()/stu1.getCredits();

        System.out.println("The student ID number is: " + stu1.getID());
        System.out.println("The number of credits: " + stu1.getCredits());
        System.out.println("The number of points: " + stu1.getPoints());
        System.out.println("The GPA is: " + gpa);

    }
}
