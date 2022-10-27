package ru.netology.domain;

public class Ticket implements Comparable<Ticket> {

    private int id;
    private long price;
    private String fromAP;

    private String toAP;
    private int travelTime;

    public Ticket(int id, long price, String fromAP, String toAP, int travelTime) {
        this.id = id;
        this.price = price;
        this.fromAP = fromAP;
        this.toAP = toAP;
        this.travelTime = travelTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getFromAP() {
        return fromAP;
    }

    public void setFromAP(String fromAP) {
        this.fromAP = fromAP;
    }

    public String getToAP() {
        return toAP;
    }

    public void setToAP(String toAP) {
        this.toAP = toAP;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int compareTo(Ticket otherTicket) {
        if (price < otherTicket.price) {
            return -1;
        }
        if (price > otherTicket.price) {
            return 1;
        }
        return 0;
    }
}
