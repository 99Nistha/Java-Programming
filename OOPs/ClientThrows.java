package OOPs;

public class ClientThrows {
    public static void main(String[] args) throws Exception {
        PersonThrows s= new PersonThrows();
        s.setAge(10);
        System.out.println("Age is = "+ s.getAge());
    }
}
