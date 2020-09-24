package org.example.shiftLabTestTask.Model;


import javax.persistence.Entity;

@Entity
public class Notebook extends Product {
    private int size;

    public Notebook() {
    }

    public Notebook(int serialNumber, String manufacturer, double price, int countOfProductInStock, int size) {
        super(serialNumber, manufacturer, price, countOfProductInStock);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
