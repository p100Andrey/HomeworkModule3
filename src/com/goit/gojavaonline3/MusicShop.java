package com.goit.gojavaonline3;

import java.util.List;

public class MusicShop {
    private List<MusicalInstrument> musicalInstruments;

    public List<MusicalInstrument> getMusicalInstruments() {
        return musicalInstruments;
    }

    public void setMusicalInstruments(List<MusicalInstrument> musicalInstruments) {
        this.musicalInstruments = musicalInstruments;
    }
    String name;

    MusicShop(String musicshop) {
        this.name = musicshop;
    }
}
