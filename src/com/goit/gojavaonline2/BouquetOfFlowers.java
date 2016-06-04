package com.goit.gojavaonline2;

import java.util.List;

public class BouquetOfFlowers {
    private List<Flower> flowers;

    public List<Flower> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flower> flowers) {
        this.flowers = flowers;
    }
    String name;

    BouquetOfFlowers(String bouqet) {
        this.name = bouqet;
    }
}
