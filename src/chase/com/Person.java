package chase.com;

public class Person {
    static String name; // instance variable
    static int age; // instance variable

    public Person() {
        this.name = name;
        this.age = age;
    }
    public void person1(int age){
     this.age=age+1;
    }

    public static void main(String args[])
    {
        Person p=new Person();
        p.name="vinod";
        p.age=25;
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}



