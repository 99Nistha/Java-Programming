package OOPs;

public class studentStaticAndFinal {
    // private is for data-hiding
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws Exception {
        // business rules checked
        if (name.equals("") || name == null) {
            throw new Exception("Names can't be null or empty.");
        }
        this.name = name;
    }

    // final means value can be set only once. Can be public.
    public final int rollNo;

    // static means, it belongs to the class (it is not copied in each object)
    private static int NumOfStudents = 0;

    public static int GeNumOfStudents() {
        return studentStaticAndFinal.NumOfStudents;
    }

    private static String UniformColor = "White";

    public static String getUniformColor() {
        return studentStaticAndFinal.UniformColor;
    }

    public static void setUniformColor(String uniformColor) {
        studentStaticAndFinal.UniformColor = uniformColor;
    }

    // nothing more than the effects of both static and final
    public static final int MAX_STUDENTS = 1000;

    public studentStaticAndFinal(String name) throws Exception {
        if (studentStaticAndFinal.NumOfStudents == studentStaticAndFinal.MAX_STUDENTS) {
            throw new Exception("Max limit reached");
        }

        this.setName(name);

        studentStaticAndFinal.NumOfStudents++;
        this.rollNo = studentStaticAndFinal.NumOfStudents;
    }

    // can access both static and non-static data members
    public void ANonStaticFunction() {
        System.out.println(this.name + " says hello to " + studentStaticAndFinal.NumOfStudents + " students.");
    }

    // can access only static data members
    // can't use this
    // can't use non-static data member
    // No need to create object, can be called directly via class name.
    public static void AStaticFunction() {
        System.out.println(studentStaticAndFinal.NumOfStudents + " out of possible " + studentStaticAndFinal.MAX_STUDENTS);
    }
}
