package com.goit.gojavaonline;

public class Main {
    public static void main(String[] args) {
        AudioFile audio = new AudioFile("ololo.mp3");
        audio.setName("Ocean Drive.");
        TextFile text = new TextFile("Текстовый файл");
        text.setName("500 pages");
        ImageFile image = new ImageFile("Файл изображения");
        image.setName("Mona Lisa");
        Directory directory = new Directory("Директория");

        directory.addFile(audio);
        directory.addFile(text);
        directory.addFile(image);

        System.out.println("Название всех классов в данной диаграмме: 1.");
        System.out.println("1." + audio.getName() + ";");
        System.out.println("2." + text.getName() + ";");
        System.out.println("3." + image.getName() + ";");
        System.out.println("4." + directory.getName() + ";");
        System.out.println("5." + directory.getFiles() + ";");

        audio.play();
        audio.setAuthor("Duke Dumont");
        System.out.println(audio);

        text.numberOfPages();
        text.setBook("Harry Potter");
        System.out.println(text);

        image.picture();
        image.setPainter("Mona Lisa");
        System.out.println(image);
    }
}
