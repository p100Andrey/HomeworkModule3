package com.goit.gojavaonline3;


public class Main {

    public static void main(String[] args) {
        Guitar guitar = new Guitar("Гитара");
        Piano piano = new Piano("Пианино");
        Trumpet trumpet = new Trumpet("Труба");
        MusicShop shop = new MusicShop("Музыкальный магазин");
        MusicalInstrument musicalinstrument = new MusicalInstrument("Магазин");

        shop.addMusicalInstrument(guitar);
        shop.addMusicalInstrument(piano);
        shop.addMusicalInstrument(trumpet);

        System.out.println("Название всех классов в данной диаграмме:");
        System.out.println("1." + guitar.getNameinstrument() + ";");
        System.out.println("2." + piano.getNameinstrument() + ";");
        System.out.println("3." + trumpet.getNameinstrument() + ";");
        System.out.println("4." + shop.getName() + ";");
        System.out.println("5." + musicalinstrument.getNameinstrument() + ".");

        musicalinstrument.price();

        musicalinstrument.setBrend("8:00-18:00");
        System.out.println(musicalinstrument);
    }
}