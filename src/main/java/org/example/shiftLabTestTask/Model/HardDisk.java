package org.example.shiftLabTestTask.Model;


import javax.persistence.Entity;

@Entity
public class HardDisk extends Product {

    private int capacity;

    public HardDisk() {
    }

    public HardDisk(int serialNumber, String manufacturer, double price, int countOfProductInStock, int capacity) {
        super(serialNumber, manufacturer, price, countOfProductInStock);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
