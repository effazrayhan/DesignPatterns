// Exercise 5: Real-world Use Case: Student Grading System
// Goal: Mix all core OOP principles

// Requirements:

// Class Student: ID, name, list of courses

// Class Course: course name, credit, grade

// Method to calculate GPA using the course list

// Use encapsulation for all fields

// Allow creating multiple students and calculating their GPA
import java.util.List;
import java.util.ArrayList;
class Course{
    String name;
    double credit;
    double grade;
}

class Student{
    private int ID;
    private String name;
    List<Course> courses = new ArrayList<Course>();
    double CalculateGpa(){
        int courseCount = 0;
        double cgpa = 0;
        for(Course course : courses){
            courseCount++;
            cgpa += course.credit * course.grade;
        }
        cgpa /= courseCount*1.0;
        return cgpa;
    }
    public int getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
}