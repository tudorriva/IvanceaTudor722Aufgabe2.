package Entities;

import java.util.concurrent.atomic.AtomicInteger;

public class Medikamente {

    int id;
    String name;
    int price;
    String Krankheit;

    private final AtomicInteger idgenerator = new AtomicInteger(0);

    public Medikamente(String name, int price, String krankheit) {
        this.id = idgenerator.incrementAndGet();
        this.name = name;
        this.price = price;
        Krankheit = krankheit;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getKrankheit() {
        return Krankheit;
    }

    public void setKrankheit(String krankheit) {
        Krankheit = krankheit;
    }

    @Override
    public String toString() {
        return "Medikamente{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", Krankheit='" + Krankheit + '\'' +
                ", idgenerator=" + idgenerator +
                '}';
    }
}
