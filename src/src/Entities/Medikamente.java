package Entities;

public class Medikamente {

    int id;
    String name;
    int price;
    String Krankheit;

    public Medikamente(int id, String name, int price, String krankheit) {
        this.id = id;
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
}
