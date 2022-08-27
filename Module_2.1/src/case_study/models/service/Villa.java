package case_study.models.service;

public class Villa extends Facility{
    private String standardRoom;
    private String areaSwimming;
    private int numberFloor;

    public Villa() {
    }

    public Villa(String standardRoom, String areaSwimming, int numberFloor) {
        this.standardRoom = standardRoom;
        this.areaSwimming = areaSwimming;
        this.numberFloor = numberFloor;
    }

    public Villa(String nameService, double usedArea, double priceHire, int maximumHuman, String typeHire, String standardRoom, String areaSwimming, int numberFloor) {
        super(nameService, usedArea, priceHire, maximumHuman, typeHire);
        this.standardRoom = standardRoom;
        this.areaSwimming = areaSwimming;
        this.numberFloor = numberFloor;
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

    public int getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(int numberFloor) {
        this.numberFloor = numberFloor;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "standardRoom='" + standardRoom + '\'' +
                ", areaSwimming='" + areaSwimming + '\'' +
                ", numberFloor=" + numberFloor +
                '}';
    }
}
