package OOPs;

public class Person {
    private String name;
    private int age;

    //Default Constructor
    public Person(){
        System.out.println("Hi, i am the default constructor");// when ever a object is declared it is called automatically
    }
    public Person(int age){
        System.out.println("Hi, I am parameterized constructor with one parameter");
        this.age= age;
    }
    public Person(int age, String name){
        System.out.println("Hi, I am parameterized constructor with two parameter");
        this.age= age;
        this.name= name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
