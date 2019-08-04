package com.musicShop;

import java.util.Date;

public class CD extends MusicItem {

    public CD() {
    }

    @Override
    public String getItemID() {
        return super.getItemID();
    }

    @Override
    public void setItemID(String itemID) {
        super.setItemID(itemID);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public String getGenre() {
        return super.getGenre();
    }

    @Override
    public void setGenre(String genre) {
        super.setGenre(genre);
    }

    @Override
    public Date getReleaseDate() {
        return super.getReleaseDate();
    }

    @Override
    public void setReleaseDate(Date releaseDate) {
        super.setReleaseDate(releaseDate);
    }

    @Override
    public String getArtist() {
        return super.getArtist();
    }

    @Override
    public void setArtist(String artist) {
        super.setArtist(artist);
    }

    @Override
    public Double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price);
    }
}
