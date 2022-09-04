package case_study.models.human;

public class Customer extends Person {
    private String customerId;
    private String typeCustomer;
    private String address;

    public Customer() {

    }

    public Customer(String name, String date, String sex, int CMND, int phone, String email, String customerId, String typeCustomer, String address) {
        super(name, date, sex, CMND, phone, email);
        this.customerId = customerId;
        this.typeCustomer = typeCustomer;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer | " +  " customerId='" + customerId + '\''
                + super.toString() +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'';
    }
}
