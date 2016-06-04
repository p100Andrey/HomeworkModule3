package com.goit.gojavaonline3;


public class UtilityClass {

    public static void main(String[] args) {
        Guitar guitar = new Guitar("Гитара");
        Piano piano = new Piano("Пианино");
        Trumpet trampet = new Trumpet("Труба");
        MusicShop shop = new MusicShop("Музыкальный магазин");
        MusicalInstrument name = new MusicalInstrument("Магазин");

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + guitar.nameinstrument + ";");
        System.out.println("2." + piano.nameinstrument + ";");
        System.out.println("3." + trampet.nameinstrument + ";");
        System.out.println("4." + shop.name + ";");
        System.out.println("5." + name.getNameinstrument() + ".");

        name.price();

        name.setBrend("8:00-18:00");
        System.out.println(name);
    }
}