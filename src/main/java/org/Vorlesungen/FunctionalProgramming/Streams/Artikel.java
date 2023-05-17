package org.Vorlesungen.FunctionalProgramming.Streams;

public class Artikel {
    private String artikelNumber, group;
    private double price;
    private int storage;

    public String getArtikelNumber() {
        return artikelNumber;
    }

    public void setArtikelNumber(String artikelNumber) {
        this.artikelNumber = artikelNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Artikel(String artikelNumber, String group, double price, int storage) {
        this.artikelNumber = artikelNumber;
        this.group = group;
        this.price = price;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "artikelNumber='" + artikelNumber + '\'' +
                ", group='" + group + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                '}';
    }
}
