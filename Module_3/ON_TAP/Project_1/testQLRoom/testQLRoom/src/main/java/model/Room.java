package model;

public class Room {
    private int idRoom;
    private String nameCustomer;
    private int numberPhone;
    private String ngayBatDau;
    private int idPayment_room;

    public Room(String nameCustomer, int numberPhone, String ngayBatDau, int idPayment_room) {
        this.nameCustomer = nameCustomer;
        this.numberPhone = numberPhone;
        this.ngayBatDau = ngayBatDau;
        this.idPayment_room = idPayment_room;
    }

    public Room(int idRoom, String nameCustomer, int numberPhone, String ngayBatDau, int idPayment_room) {
        this.idRoom = idRoom;
        this.nameCustomer = nameCustomer;
        this.numberPhone = numberPhone;
        this.ngayBatDau = ngayBatDau;
        this.idPayment_room = idPayment_room;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public int getIdPayment_room() {
        return idPayment_room;
    }

    public void setIdPayment_room(int idPayment_room) {
        this.idPayment_room = idPayment_room;
    }
}
