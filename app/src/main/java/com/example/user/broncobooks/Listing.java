package com.example.user.broncobooks;

public class Listing {
    public Textbook textbook;
    public User seller;
    public double price;
    public String paymentMethod;
    public int epochTimePosted;	// this is the epoch time (in seconds!) that the listing was posted

    public User buyer;
    public boolean onSale;

    public String id;

    public Listing() {
        // default constructor needed for calls to DataSnapshot.getValue(Listing.class)
    }

    public Listing(Textbook textbook, User seller, double price, String paymentMethod, int epochTimePosted) {
        this.textbook = textbook;
        this.seller = seller;
        this.price = price;
        this.paymentMethod = paymentMethod;
        this.epochTimePosted = epochTimePosted;
    }
}