package Hometask4;

import Hometask4.Person;

/**
 * Created by Admin on 25.08.2017.
 */
public class Student extends Person {
    private String idNumber;
    private double gpa;

    Student(String name, int age, String gender, String idNumber, double gpa){
        super(name,age,gender);
        setIdNamber(idNumber);
        setGpa(gpa);
    }

    public void setIdNamber(String idNumber){
        this.idNumber = idNumber;
    }

    public String getIdNamber(){
        return idNumber;
    }

    public void setGpa(double gpa){
        this.gpa = gpa;
    }

    public double getGpa(){
        return gpa;
    }

    public String toString(){
        return super.toString()+", student id: "+getIdNamber()+" gpa: "+getGpa();
    }

}
