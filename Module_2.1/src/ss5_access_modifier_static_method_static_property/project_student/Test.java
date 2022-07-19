package ss5_access_modifier_static_method_static_property.project_student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);

        Student student1 = new Student();
        student1.setName("TRI");
        student1.setClasses("A0422I1");
        student1.display();
        System.out.println(student1);

    }
}
