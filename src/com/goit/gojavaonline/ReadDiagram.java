package com.goit.gojavaonline;


public class ReadDiagram {
    public static void main(String[] args) {
        AudioFile audio = new AudioFile("ololo.mp3");
        TextFile text = new TextFile("Текстовый файл");
        ImageFile image = new ImageFile("Файл изображения");
        Directory name = new Directory("Директория");
        File nameFile = new File("Файл");

        System.out.println("Название всех классов в данной диаграмме: 1.");
        System.out.println("1." + audio.name + ";");
        System.out.println("2." + text.name + ";");
        System.out.println("3." + image.name + ";");
        System.out.println("4." + name.name + ";");
        System.out.println("5." + nameFile.getName() + ".");

        audio.play();

        audio.setAuthor("Dima Bilan");
        System.out.println(audio);
    }
}
