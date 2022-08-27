package case_study.models.service;

public abstract class Facility {
    private String nameService;
    private double usedArea;
    private double priceHire;
    private int maximumHuman;
    private String typeHire;

    public Facility() {
    }

    public Facility(String nameService, double usedArea, double priceHire, int maximumHuman, String typeHire) {
        this.nameService = nameService;
        this.usedArea = usedArea;
        this.priceHire = priceHire;
        this.maximumHuman = maximumHuman;
        this.typeHire = typeHire;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getUsedArea() {
        return usedArea;
    }

    public void setUsedArea(double usedArea) {
        this.usedArea = usedArea;
    }

    public double getPriceHire() {
        return priceHire;
    }

    public void setPriceHire(double priceHire) {
        this.priceHire = priceHire;
    }

    public int getMaximumHuman() {
        return maximumHuman;
    }

    public void setMaximumHuman(int maximumHuman) {
        this.maximumHuman = maximumHuman;
    }

    public String getTypeHire() {
        return typeHire;
    }

    public void setTypeHire(String typeHire) {
        this.typeHire = typeHire;
    }

    @Override
    public String toString() {
        return
                " nameService='" + nameService + '\'' +
                ", usedArea=" + usedArea +
                ", priceHire=" + priceHire +
                ", maximumHuman=" + maximumHuman +
                ", typeHire='" + typeHire + " " ;
    }
}
