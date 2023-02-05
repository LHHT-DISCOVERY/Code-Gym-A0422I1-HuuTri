package com.example.furama_managerment.model.employee;

import com.example.furama_managerment.model.contract.Contract;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;

    @Column(columnDefinition = "varchar(45)")
    @NotBlank(message = "{notempty}")
    private String employeeName;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date employeeBirthday;

    @NotBlank(message = "Số CMND không được để trống.")
    @Column(columnDefinition = "varchar(45)")
    private String employeeIdCard;

    @NotNull(message = "Lương không được để trống.")
    @Min(value = 1, message = "Lương phải là số dương.")
    private Double employeeSalary;

    @NotBlank(message = "Số điện thoại không được để trống.")
    @Pattern(regexp = "^(0|84)(2(0[3-9]|1[0-6|8|9]|2[0-2|5-9]|3[2-9]|4[0-9]|5[1|2|4-9]|6[0-3|9]|7[0-7]|8[0-9]|9[0-4|6|7|9])|3[2-9]|5[5|6|8|9]|7[0|6-9]|8[0-6|8|9]|9[0-4|6-9])([0-9]{7})$",
            message = "nếu đầu số máy bàn & bắt đầu bằng 84 thì sẽ có 12 ký tự || ")
    @Column(columnDefinition = "varchar(45)")
    private String employeePhone;

    @NotBlank(message = "Email không được để trống.")
    @Pattern(regexp = "^(?:^|\\s)[\\w!#$%&'*+/=?^`{|}~-](\\.?[\\w!#$%&'*+/=?^`{|}~-]+)*@\\w+[.-]?\\w*\\.[a-zA-Z]{2,3}\\b$",
            message = "Email phải đúng định dạng.")
    @Column(columnDefinition = "varchar(45)")
    private String employeeEmail;

    @NotBlank(message = "Địa chỉ ko được để trống")
    @Column(columnDefinition = "varchar(45)")
    private String employeeAddress;


    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "positionId")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "education_degree", referencedColumnName = "educationDegreeId")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "divisionId")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;

    @OneToMany(mappedBy = "employee")
    Set<Contract> contracts;

    public Employee() {
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Date getEmployeeBirthday() {
        return employeeBirthday;
    }

    public void setEmployeeBirthday(Date employeeBirthday) {
        this.employeeBirthday = employeeBirthday;
    }

    public String getEmployeeIdCard() {
        return employeeIdCard;
    }

    public void setEmployeeIdCard(String employeeIdCard) {
        this.employeeIdCard = employeeIdCard;
    }

    public Double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Contract> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contract> contracts) {
        this.contracts = contracts;
    }
}
