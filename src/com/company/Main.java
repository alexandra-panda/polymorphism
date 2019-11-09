package com.company;

        import java.util.ArrayList;
        import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<MusicalInstrument> musicalInstrument = new ArrayList<MusicalInstrument>();
        musicalInstrument.add(new GuitarElectric(5, "Pango", "Rock", 3500, "red" ));
        musicalInstrument.add(new GuitarElectric(2, "Spruce", "Rock", 4500, "black"));
        musicalInstrument.add(new Violin(1, "Cecilio", "classical" ));

        for(MusicalInstrument m:musicalInstrument) {
            System.out.println(m.toString());
            m.brands();
        }
    }
}
