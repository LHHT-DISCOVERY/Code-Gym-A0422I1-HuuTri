package case_study.models.service;

public class Room extends Facility{
    private String serviceFree;

    public Room() {
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String nameService, double usedArea, double priceHire, int maximumHuman, String typeHire, String serviceFree) {
        super(nameService, usedArea, priceHire, maximumHuman, typeHire);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "serviceFree='" + serviceFree + '\'' +
                '}';
    }
}
