package case_study.models.human;

public abstract class Person {
    private String name;
    private String date;
    private String sex;
    private int CMND;
    private int phone;
    private String email;

    public Person() {
    }

    public Person(String name, String date, String sex, int CMND, int phone, String email) {
        this.name = name;
        this.date = date;
        this.sex = sex;
        this.CMND = CMND;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getCMND() {
        return CMND;
    }

    public void setCMND(int CMND) {
        this.CMND = CMND;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return " name ='" + name + '\'' +
                ", date='" + date + '\'' +
                ", sex='" + sex + '\'' +
                ", CMND=" + CMND +
                ", phone=" + phone +
                ", email='" + email;
    }
}
