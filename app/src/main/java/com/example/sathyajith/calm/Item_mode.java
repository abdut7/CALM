package com.example.sathyajith.calm;

public class Item_mode {
    String iname;
    String price;
    String imgurl;

    public Item_mode(String iname, String price, String imgurl) {
        this.iname = iname;
        this.price = price;
        this.imgurl = imgurl;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
}
