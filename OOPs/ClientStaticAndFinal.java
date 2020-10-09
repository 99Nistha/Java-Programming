package OOPs;

public class ClientStaticAndFinal {
    public static void main(String[] args) throws Exception {
        // only array created, no student created yet.
        studentStaticAndFinal[] students = new studentStaticAndFinal[1000];

        for (int i = 0; i < students.length; i++) {
            students[i] = new studentStaticAndFinal(i + "th");
            System.out.println(studentStaticAndFinal.GeNumOfStudents());

        }

        // Able to access static field but cant change the value
        // Student.MAX_STUDENTS=2000;

        // students[250].rollNo = 10;
        System.out.println(students[250].rollNo);

        System.out.println(students[250].getName());
        students[250].setName("ABC"); // safe here because of exception.
        System.out.println(students[250].getName());

        students[250].ANonStaticFunction();
        students[250].AStaticFunction();
        studentStaticAndFinal.AStaticFunction();

        students[250].setUniformColor("Blue");
        System.out.println(students[350].getUniformColor());
    }
}
