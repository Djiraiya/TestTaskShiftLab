package org.example.shiftLabTestTask.Model;

import javax.persistence.Entity;

@Entity
public class Computer extends Product {
    private String formFactor;

    public Computer() {
    }

    public Computer(int serialNumber, String manufacturer, double price, int countOfProductInStock, String formFactor) {
        super(serialNumber, manufacturer, price, countOfProductInStock);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }
}
