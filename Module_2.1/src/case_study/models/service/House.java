package case_study.models.service;

public class House extends Facility{
    private String standardRoom;
    private String areaSwimming;

    public House() {
    }

    public House(String standardRoom, String areaSwimming) {
        this.standardRoom = standardRoom;
        this.areaSwimming = areaSwimming;
    }

    public House(String nameService, double usedArea, double priceHire, int maximumHuman, String typeHire, String standardRoom, String areaSwimming) {
        super(nameService, usedArea, priceHire, maximumHuman, typeHire);
        this.standardRoom = standardRoom;
        this.areaSwimming = areaSwimming;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getAreaSwimming() {
        return areaSwimming;
    }

    public void setAreaSwimming(String areaSwimming) {
        this.areaSwimming = areaSwimming;
    }

    @Override
    public String toString() {
        return "House{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", areaSwimming='" + areaSwimming + '\'' +
                '}';
    }
}
