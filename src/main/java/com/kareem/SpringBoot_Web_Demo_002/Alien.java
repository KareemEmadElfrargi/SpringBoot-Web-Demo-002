package com.kareem.SpringBoot_Web_Demo_002;

import org.springframework.web.bind.annotation.RequestParam;

public class Alien {

    private int aid;
    private String aname;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }


    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", name='" + aname + '\'' +
                '}';
    }
}
