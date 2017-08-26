package Hometask4;

/**
 * Created by Admin on 25.08.2017.
 */
public class ColledgeStudent extends Student {
    private int year;
    private String major;

    ColledgeStudent(String name, int age, String gender, String idNumber, double gpa, int year, String major){
        super(name,age,gender,idNumber,gpa);
        setYear(year);
        setMajor(major);
    }

    public void setYear(int year){
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getMajor(){
        return major;
    }

    public String toString(){
        return super.toString()+", major: "+ getMajor()+ " , year : "+getYear();
    }

}
