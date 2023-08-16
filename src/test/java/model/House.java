package model;

import java.math.BigDecimal;

public class House {
    private String address;
    private String condition;
    private String material;
    private String serviceFirm;
    private BigDecimal price;
    private int size;
    private int numberOfRooms;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getServiceFirm() {
        return serviceFirm;
    }

    public void setServiceFirm(String serviceFirm) {
        this.serviceFirm = serviceFirm;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
}
