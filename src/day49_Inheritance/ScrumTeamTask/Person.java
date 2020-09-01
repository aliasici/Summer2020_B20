package day49_Inheritance.ScrumTeamTask;
/*
  create a class called Person
                attributes:  name, age, gender
                methods: eat, walk, sleep, setPersonInfo
 */

public class Person {
    public String name;
    public int age;
    public char gender;

    private long ssn; // we don't want this to be inherited to the sub clases

    public long getSsn(){ // read ssn only
        return ssn;
    }
    public void setName(long ssn){ // set ssn only
        this.ssn = ssn;
    }

    private void eat(){ // we don't want this to be inherited to the sub clases
        System.out.println(name+ "is eating");
    }
    private void talk(){ // we don't want this to be inherited to the sub clases
        System.out.println(name+" is walkin");
    }
    public void sleep(){
        System.out.println(name +" is sleeping");
    }
    public void setInfo(String name, int age,char gender){ // only sets name, Age, Gender
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

}
