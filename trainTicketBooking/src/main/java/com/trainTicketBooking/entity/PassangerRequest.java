package com.trainTicketBooking.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PassangerRequest {
    private  String name;
    private String email;
    private Long phone;
    private String from;
    private String to;
    private String jDate;
    private String trainNUmber;

    public PassangerRequest(String name, String email, Long phone, String from, String to, String jDate, String trainNUmber) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.from = from;
        this.to = to;
        this.jDate = jDate;
        this.trainNUmber = trainNUmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getjDate() {
        return jDate;
    }

    public void setjDate(String jDate) {
        this.jDate = jDate;
    }

    public String getTrainNUmber() {
        return trainNUmber;
    }

    public void setTrainNUmber(String trainNUmber) {
        this.trainNUmber = trainNUmber;
    }
}
