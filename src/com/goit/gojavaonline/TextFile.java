package com.goit.gojavaonline;


public class TextFile extends File {
    private String text;

    public TextFile(String textFile) {
        super(textFile);
        this.text = textFile;
    }
}
