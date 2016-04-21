/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.Webscrapper.entity;

/**
 *
 * @author Navin
 */
public class Jobs {
    private String title,company,address,position_type,experience;
    private int openings;

    public Jobs() {
    }

    public Jobs(String title, String company, String address, String position_type, String experience, int openings) {
        this.title = title;
        this.company = company;
        this.address = address;
        this.position_type = position_type;
        this.experience = experience;
        this.openings = openings;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition_type() {
        return position_type;
    }

    public void setPosition_type(String position_type) {
        this.position_type = position_type;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getOpenings() {
        return openings;
    }

    public void setOpenings(int openings) {
        this.openings = openings;
    }

    @Override
    public String toString() {
        return "Jobs{" + "title=" + title + ", company=" + company + ", address=" + address + ", position_type=" + position_type + ", experience=" + experience + ", openings=" + openings + '}';
    }
     public String toCSV() {
        return title + "," + company + ", " + address + "," + position_type + ", " + experience + "," + openings + "\r\n";
    }
    
}
