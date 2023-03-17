/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package az.perfect.bean;

/**
 *
 * @author sofiya.mammadova
 */
public abstract class Person {  //t.k. mi nikoqda ne budem sozdavat ego object (mi ne budem qovorit o Persone), amma Personun constructoru publicdi
    private String name;
    private String surname;
    private int age;
    private double salary;

    //public Person() {//constructor Persona-public, t.e. personun constructoruna new deyib chagira bilerik i t.k class abstract, to tam sozdastsa class (nenuzhnaya vesh)
    protected Person(){    //chtob izbezhat etoqo sdelaem constructor ne public, a protected, chtob ne moqli egovizivat
    }
    
    
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

     
}
