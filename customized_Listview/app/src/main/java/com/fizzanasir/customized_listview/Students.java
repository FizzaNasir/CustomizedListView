package com.fizzanasir.customized_listview;

public class Students {
private String name;
private String rollNumber;
private String section;
private int imageId;

    public String getRollNumber() {
        return rollNumber;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Students(String name, String rollnum, String sec, int imgid) {
        this.name = name;
        this.rollNumber=rollnum;
        this.section=sec;
        this.imageId=imgid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
