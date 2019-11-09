package com.company;

public class Violin extends com.company.MusicalInstrument {
    public Violin(int age,String nameOfInstrument, String music) {
        super(age,nameOfInstrument,music);
    }

    @Override
    public void brands() {
        System.out.println("Violin Stentor");
    }

    @Override
    public String toString() {
        return "Age = " + age +
                "\nName of Instrumen = " + nameOfInstrument +
                "\nMusic = " + music+ "\n";

    }
}