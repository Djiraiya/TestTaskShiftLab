package org.example.shiftLabTestTask.Model;

import javax.persistence.Entity;

@Entity
public class Monitor extends Product {

    private String diagonal;

    public Monitor() {
    }

    public Monitor(int serialNumber, String manufacturer, double price, int countOfProductInStock, String diagonal) {
        super(serialNumber, manufacturer, price, countOfProductInStock);
        this.diagonal = diagonal;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }
}
