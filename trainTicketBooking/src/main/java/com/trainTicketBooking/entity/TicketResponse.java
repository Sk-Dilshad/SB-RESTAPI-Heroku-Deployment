package com.trainTicketBooking.entity;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TicketResponse {
    private Integer ticketId;
    private String status;
    private Double cost;
    private String from;
    private String to;
    private String pnr;
    private String jDate;
    private String name;

    public TicketResponse(Integer ticketId, String status, Double cost, String from, String to, String pnr, String jDate, String name) {
        this.ticketId = ticketId;
        this.status = status;
        this.cost = cost;
        this.from = from;
        this.to = to;
        this.pnr = pnr;
        this.jDate = jDate;
        this.name = name;
    }

    public TicketResponse() {

    }

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getjDate() {
        return jDate;
    }

    public void setjDate(String jDate) {
        this.jDate = jDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
