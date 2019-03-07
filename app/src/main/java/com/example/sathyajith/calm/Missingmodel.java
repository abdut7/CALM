package com.example.sathyajith.calm;

public class Missingmodel {
    String name,age,loc,info,imagelink;
    int id;

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Missingmodel(String name, String age, String loc, String info, String imagelink, int id) {
        this.name = name;
        this.age = age;
        this.loc = loc;
        this.info = info;
        this.imagelink = imagelink;
        this.id = id;
    }

    public Missingmodel(String name, String age, String loc, String info) {
        this.name = name;
        this.age = age;
        this.loc = loc;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
