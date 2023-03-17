/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author sofiya.mammadova
 */
public class Student extends Person{
    private String schoolName;
    private double scholarship;

    public Student() {
    }    
    
    public Student(String name, String surname, int age, String schoolName, double scholarship) {
        super(name, surname, age);
        this.schoolName = schoolName;
        this.scholarship = scholarship;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getScholarship() {
        return scholarship;
    }

    public void setScholarship(double scholarship) {
        this.scholarship = scholarship;
    }
    
       @Override
    public String toString() {
        return "name = " + getName() + ", surname = " + getSurname() + ", age = " + getAge() + ", schoolName = " + schoolName + ", scholarship = " + scholarship;
        //getName, getSurname, getAge t.k. ih mi vzali iz toString()-a classa Person
    }
}
