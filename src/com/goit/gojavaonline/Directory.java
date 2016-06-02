package com.goit.gojavaonline;

import java.util.List;


public class Directory {
    private List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    String nameDirectory;

    Directory (String directory){
        this.nameDirectory = directory;
    }
}
