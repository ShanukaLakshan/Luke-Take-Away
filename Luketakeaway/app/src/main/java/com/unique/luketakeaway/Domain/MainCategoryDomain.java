package com.unique.luketakeaway.Domain;

public class MainCategoryDomain {

    private String itemName;
    private String itemImageName;

    public MainCategoryDomain(String itemName, String itemImageName) {
        this.itemName = itemName;
        this.itemImageName = itemImageName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemImageName() {
        return itemImageName;
    }

    public void setItemImageName(String itemImageName) {
        this.itemImageName = itemImageName;
    }


}
