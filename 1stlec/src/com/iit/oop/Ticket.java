package com.iit.oop;

public class Ticket {
    private static int numTicketSold;
    private int numTicket;

    Ticket() {
        this.numTicketSold++;
        this.numTicket = numTicketSold;
    }
    public static int getNumTicketSold() {
        return numTicketSold;

    }
    public String getInfo(){
        return "Ticket Sold: " + numTicketSold + " Ticket: " + numTicket;
    }
}
