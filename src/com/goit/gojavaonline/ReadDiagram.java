package com.goit.gojavaonline;

/**
 * Created by Andrey.Masuk on 02.06.2016.
 */
public class ReadDiagram {
    public static void main(String[] args){
        AudioFile nameFile1 = new AudioFile();
        TextFile nameFile2 = new TextFile();
        ImageFile nameFile3 = new ImageFile();
        Directory nameFile4 = new Directory();
        File nameFile5 = new File();

        System.out.print("Название всех файлов в данной диаграмме: 1." + nameFile1.nameFile1 + ";"
                + " 2." + nameFile2.nameFile2 + ";"
                + " 3." + nameFile3.nameFile3 + ";"
                + " 4." + nameFile4.nameFile4 + ";"
                + " 5." + nameFile5.nameFile5 + ".");
    }
}
