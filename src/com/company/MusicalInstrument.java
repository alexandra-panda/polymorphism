package com.company;
public abstract class MusicalInstrument {
    protected int age;
    protected String nameOfInstrument;
    protected String music;


    MusicalInstrument(int age, String nameOfInstrument ,String music) {
        this.age=age;
        this.nameOfInstrument=nameOfInstrument;
        this.music=music;
    }

    public int getAge(){return this.age;}

    public String getNameOfInstrument(){return this.nameOfInstrument; }

    public String   getMusic(){return this.music;}

    public void setAge(int age){this.age=age; }

    public void setNameOfInstrument(String nameOfInstrument){this.nameOfInstrument=nameOfInstrument;}

    public void setMusic(String music){this.music=music;}

    abstract public void brands();

}