package model;

public class Student {
    private int Id;
    private String name;
    private boolean gender;
    private String birthday;
    private float point;
    private String account;
    private int classID;
    private String email;

    public Student() {
    }

    public Student(int id, String name, boolean gender, String birthday, float point, String account, int classID, String email) {
        Id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.point = point;
        this.account = account;
        this.classID = classID;
        this.email = email;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
