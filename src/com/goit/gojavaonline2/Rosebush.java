package com.goit.gojavaonline2;

import java.util.List;

public class Rosebush {
    private List<Rose> roses;

    private String bushage;

    public String getBushage() {
        return bushage;
    }

    public void setBushage(String bushage) {
        this.bushage = bushage;
    }

    public List<Rose> getRoses() {
        return roses;
    }

    public void setRoses(List<Rose> roses) {
        this.roses = roses;
    }
    String namesbush;

    Rosebush(String rosesbush) {
        this.namesbush = rosesbush;
    }
    public void bushBrand() {
        System.out.println(namesbush + " - сорт данного куста");
    }
    @Override
    public String toString() {
        return namesbush + ", возраст куста: " + bushage;
    }
}
