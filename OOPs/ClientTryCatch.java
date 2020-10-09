package OOPs;

public class ClientTryCatch {
    public static void main(String[] args) {
        PersonTryCatch s= new PersonTryCatch();
        System.out.println("Hello");
        try{
            s.setAge(30);
            System.out.println("I will not get printed if age is negative");
        }
        catch(Exception e) {
            System.out.println("age cant be negative");
        }
        System.out.println("Bye");
        System.out.println(s.getAge());
    }
}
