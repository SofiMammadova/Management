/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author sofiya.mammadova
 */
public class Teacher extends Person {//sdelali extend, chtobi oz superclassinin constructorunu tanisin, chtob Teacher obyekti yarananda Person-den name, surname goture bilek
    private String schoolName;
    private double salary;

    public Teacher(String name, String surname, int age, String schoolName, double salary) {//zapolnenniy constructor superclassa
        super(name, surname, age); //(idet v superclass person, beret infu:name, surname, age i vozvrashaet)
        this.schoolName = schoolName;
        this.salary = salary;
    }
 
    
    @Override
    public String toString() {
        return "name = " + getName() + ", surname = " + getSurname() + ", age = " + getAge() + ", schoolName = " + schoolName + ", salary = " + salary;
        //getName, getSurname, getAge t.k. ih mi vzali iz toString()-a classa Person
    }
    
    public Teacher() { //pustoy constructor samoqo classa
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    
    
    
}
