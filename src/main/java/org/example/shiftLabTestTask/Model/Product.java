package org.example.shiftLabTestTask.Model;

import javax.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private int serialNumber;
    private String manufacturer;
    private double price;
    private int countOfProductInStock;

    public Product() {
    }

    public Product(int serialNumber, String manufacturer, double price, int countOfProductInStock) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.price = price;
        this.countOfProductInStock = countOfProductInStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountOfProductInStock() {
        return countOfProductInStock;
    }

    public void setCountOfProductInStock(int countOfProductInStock) {
        this.countOfProductInStock = countOfProductInStock;
    }
}
