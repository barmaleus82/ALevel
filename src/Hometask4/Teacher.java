package Hometask4;

import Hometask4.Person;

/**
 * Created by Admin on 25.08.2017.
 */
public class Teacher extends Person {
    private double salary;
    private String subject;

    Teacher(String name, int age, String gender, String subject, double salary){
        super(name,age,gender);
        setSalary(salary);
        setSubject(subject);
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public String getSubject(){
        return subject;
    }

    public String toString(){
        return super.toString()+", subject: "+getSubject()+", salary : "+getSalary();
    }

}
