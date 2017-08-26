package Hometask4;
import java.util.*;

/**
 * Created by Admin on 25.08.2017.
 */
public class TestPerson {
    private final static String [] subjectsArr = {"Computer Science", "Chemistry", "English", "History", "Biology"};
    private final static String [] majorsArr =   {"Electrical Engineering", "Communications", "Undeclared", "History teacher"};
    private final static String [] firstNamesArr =   {"Mike", "Bob", "Tailor", "Djon", "Linda", "Anna", "Sara"};
    private final static String [] lastNamesArr =   {"Jameson", "Smith", "Kazisky", "Petrov", "Kazyarikin", "Winfry"};
    private final static String [] idNumberArr =   {"UUFG00251", "0025WER45", "12SDF357DF984", "54DFWER9U44HH", "224ASDQWEAD", "5546ASD687"};
    private final static String [] genderArr =   {"M", "F"};

    public static String randomStrArr(String [] strArr){
        Random random = new Random();
        return strArr[random.nextInt(strArr.length)];
    }

    public static Person randomPerson(){
        Random random = new Random();

        String  randName    =   randomStrArr(firstNamesArr);
        String  randLastName=   randomStrArr(lastNamesArr);
        String  randSubject =   randomStrArr(subjectsArr);
        String  randMajor   =   randomStrArr(majorsArr);
        String  randGender  =   randomStrArr(genderArr);
        String  randId      =   randomStrArr(idNumberArr);
        int     randAge     =   random.nextInt(33)+17;
        double  randGpa     =   random.nextInt(5)+(double) random.nextInt(10)/10 ;

//        System.out.println(random.nextInt(5));
//        System.out.println((double) random.nextInt(10)/10);



        int     randSallary =   random.nextInt(30)*1000+40000; //40 - 70.000
        int     year        =   random.nextInt(7);

        int tipePerson = random.nextInt(4);
        //System.out.println(tipePerson);
        switch(tipePerson) {
            case 0:
                return new Person(randName+" "+randLastName, randAge, randGender);
            case 1:
                return new Teacher(randName+" "+randLastName, randAge+6, randGender, randSubject, randSallary);
            case 2:
                return new Student(randName+" "+randLastName, randAge, randGender, randId, randGpa);
            case 3:
                return new ColledgeStudent(randName+" "+randLastName, randAge, randGender, randId, randGpa, year, randMajor);
            default:
                return null;
        }
    }

    public static void main(String[] args) {

        Person [] personArr = new Person[10];

        for (int i=0; i<personArr.length; i++) {
            personArr[i] = randomPerson();
        }

        for (Person curPerson : personArr){
            System.out.println(curPerson);
        }
    }
}
