package model;

public class TypeCustomer {
    private int  customerTypeId;
    private String  name;

    public TypeCustomer(int customerTypeId, String name) {
        this.customerTypeId = customerTypeId;
        this.name = name;
    }

    public int getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(int customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
