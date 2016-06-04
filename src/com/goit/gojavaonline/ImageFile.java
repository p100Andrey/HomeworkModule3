package com.goit.gojavaonline;


public class ImageFile extends File {
    private String image;

    public ImageFile(String imagePreview) {
        super(imagePreview);
        this.image = imagePreview;
    }
}
