package com.goit.gojavaonline;


public class ReadDiagram {
    public static void main(String[] args){
        AudioFile nameAudioFile = new AudioFile("Аудио файл");
        TextFile nameTextFile = new TextFile("Текстовый файл");
        ImageFile nameImageFile = new ImageFile("Файл изображения");
        Directory nameDirectory = new Directory("Директория");
        File nameFile = new File();

        System.out.print("Название всех классов в данной диаграмме: 1." + nameAudioFile.nameAudioFile + ";"
                + " 2." + nameTextFile.nameTextFile + ";"
                + " 3." + nameImageFile.nameImageFile + ";"
                + " 4." + nameDirectory.nameDirectory + ";"
                + " 5." + nameFile.nameFile + ".");
}
}
