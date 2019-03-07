package com.example.sathyajith.calm;

import android.widget.EditText;

public class Complaintmodel {
    String name,complaint,details,loc,station;

    public Complaintmodel(String name, String complaint, String details, String loc, String station) {
        this.name = name;
        this.complaint = complaint;
        this.details = details;
        this.loc = loc;
        this.station = station;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComplaint() {
        return complaint;
    }

    public void setComplaint(String complaint) {
        this.complaint = complaint;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }
}
