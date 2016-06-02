package com.goit.gojavaonline;

import java.util.List;

/**
 * Created by Andrey.Masuk on 28.05.2016.
 */
public class Directory {
    private List<File> files;

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }
    String nameFile4;

    Directory (){
        nameFile4 = "Directory";
    }
}
