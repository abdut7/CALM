package com.example.sathyajith.calm;

public class Lookoutmodel {
    String name,address,district,description,uploadedby;

    public Lookoutmodel(String name, String address, String district, String description, String uploadedby) {
        this.name = name;
        this.address = address;
        this.district = district;
        this.description = description;
        this.uploadedby = uploadedby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUploadedby() {
        return uploadedby;
    }

    public void setUploadedby(String uploadedby) {
        this.uploadedby = uploadedby;
    }
}
