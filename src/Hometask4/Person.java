package Hometask4;

/**
 * Created by Admin on 25.08.2017.
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public String toString(){
        return getName()+", age: "+getAge()+", gender : "+getGender();
    }



}
