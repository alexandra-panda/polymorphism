package com.company;

public class GuitarElectric extends com.company.MusicalInstrument {
    private float price;
    private String color;

    GuitarElectric(int age, String nameOfInstrument, String music, float price, String color) {
        super(age,nameOfInstrument, music);
        this.price = price;
        this.color = color;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float Price) {
        this.price = price;
    }

    public String getcolor() {
        return this.color;
    }

    public void setColor(String Color) {
        this.color =color;   }
    @Override
    public void brands() {
        System.out.println("GuitarElectric Delson");
    }
    @Override
    public String toString(){
        return "Age = " + age+
                "\nName of Instrument = " + nameOfInstrument +
                "\nMusic = " + music + "\n";
    }
}
