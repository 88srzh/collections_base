package edu.java.game;

public enum Flowers
{
    ROSE(100,5,30),
    LILY(85,1,24),
    TULIP(65,2,20),
    LOTUS(90,4,28),
    ORCHID(75,3,25);

    private int price;
    private int freshness;
    private int stem;


    Flowers(int price, int freshness, int stem) {
        this.price = price;
        this.freshness = freshness;
        this.stem = stem;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getStem() {
        return stem;
    }

    public void setStem(int stem) {
        this.stem = stem;
    }
}
