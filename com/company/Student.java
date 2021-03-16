package com.company;

public class Student {

    private int stuID;
    int credits;
    int points;
    double gpa;

    public void setID(double ID)
    {
        ID = stuID;
    }
    public int getID()
    {
        return stuID;
    }

    public void setCredits(int credit)
    {
        credit = credits;
    }
    public int getCredits()
    {
        return credits;
    }

    public void setPoints(int point)
    {

        point = points;
    }
    public double getPoints()
    {
        return points;
    }

    public double calculateGPA(double gpa)
    {
        gpa = points/credits;
        return gpa;
    }

    public void printMessage()
    {
        System.out.println("The student ID number is: " + stuID);
        System.out.println("The number of credits is: " + credits);
        System.out.println("The number of points is: " + points);
        System.out.println("The GPA is: " + gpa);
    }
}
