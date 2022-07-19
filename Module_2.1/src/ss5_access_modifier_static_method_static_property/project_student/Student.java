package ss5_access_modifier_static_method_static_property.project_student;

public class Student {
    private String name;
    private String classes;
    private boolean on;

    Student() {
        name = "John ";
        classes = "CO2";
        on = true;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public void display() {
        this.on = true;
    }

    // Public --> ok
//    public void setName(String name) {
//        this.name = name;
//    }


    // Private -- > not ok
//    private void setName(String name) {
//        this.name = name;
//    }


    // Defaul --> ok
//     void setName(String name) {
//        this.name = name;
//    }

    // Protected --> ok
    protected void setName(String name) {
        this.name = name;
    }


    // Public --> ok
    public void setClasses(String classes) {
        this.classes = classes;
    }


    public String toString() {
        if (on) return " Name is : " + getName() + "\n Class is : " + getClasses();
        return " ";
    }
}
