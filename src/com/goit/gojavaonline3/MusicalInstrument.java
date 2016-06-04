package com.goit.gojavaonline3;


public class MusicalInstrument {

    private String brend;

    public String getBrend() {
        return brend;
    }

    public void setBrend(String brend) {
        this.brend = brend;
    }

    protected String nameinstrument;

    public String getNameinstrument() {
        return nameinstrument;
    }

    public void setNameinstrument(String nameinstrument) {
        this.nameinstrument = nameinstrument;
    }

    public MusicalInstrument(String name) {
        this.nameinstrument = name;
    }

    public void price() {
        System.out.println(nameinstrument + ": MUSIC");
    }

    @Override
    public String toString() {
        return nameinstrument + ", Open: " + brend;
    }
}