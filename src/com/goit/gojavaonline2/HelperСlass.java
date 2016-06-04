package com.goit.gojavaonline2;


public class HelperСlass {
    public static void main(String[] args) {
        Aster aster = new Aster("Цветок астра");
        Chamomile chamomile = new Chamomile("Цветок ромашка");
        Tulip tulip = new Tulip("Цветок тюльпан");
        Rose rose = new Rose("Цветок роза");
        Rosebush rosesbush = new Rosebush("Куст чайной розы");
        BouquetOfFlowers name = new BouquetOfFlowers("Букет цветов");
        Flower nameFlower = new Flower("Цветы");

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + aster.nameFlower + ";");
        System.out.println("2." + chamomile.nameFlower + ";");
        System.out.println("3." + tulip.nameFlower + ";");
        System.out.println("4." + rose.nameFlower + ";");
        System.out.println("5." + rosesbush.namesbush + ";");
        System.out.println("6." + name.name + ";");
        System.out.println("7." + nameFlower.getNameFlower() + ".");

        rosesbush.bushBrand();
        rosesbush.setBushage("10 лет");
        System.out.println(rosesbush);
    }
}
