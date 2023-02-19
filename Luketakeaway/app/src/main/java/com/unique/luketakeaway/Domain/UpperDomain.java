package com.unique.luketakeaway.Domain;

public class UpperDomain {

    private String imageName;
    private String title;
    private String description;

    public UpperDomain(String imageName, String title, String description) {
        this.imageName = imageName;
        this.title = title;
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
