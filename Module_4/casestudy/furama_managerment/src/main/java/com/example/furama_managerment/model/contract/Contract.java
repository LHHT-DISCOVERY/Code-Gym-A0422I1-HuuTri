package com.example.furama_managerment.model.contract;

import com.example.furama_managerment.model.customer.Customer;
import com.example.furama_managerment.model.employee.Employee;
import com.example.furama_managerment.model.service.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contractId;
    private Date contractStartDate;
    private Date contractEndDate;
    private Double contractDeposit;
    private Double contractTotalMoney;

    @ManyToOne
    @JoinColumn(name = "employee_id" , referencedColumnName = "employeeId")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "customer_id" , referencedColumnName = "customerId")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "service_id" , referencedColumnName = "serviceId")
    private Service service;


    @OneToMany(mappedBy = "contract")
    Set<ContractDetail> contractDetails;

    public Contract() {
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public Double getContractDeposit() {
        return contractDeposit;
    }

    public void setContractDeposit(Double contractDeposit) {
        this.contractDeposit = contractDeposit;
    }

    public Double getContractTotalMoney() {
        return contractTotalMoney;
    }

    public void setContractTotalMoney(Double contractTotalMoney) {
        this.contractTotalMoney = contractTotalMoney;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Set<ContractDetail> getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(Set<ContractDetail> contractDetails) {
        this.contractDetails = contractDetails;
    }
}
