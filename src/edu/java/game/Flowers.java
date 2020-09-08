package edu.java.game;

import java.util.Iterator;
import java.util.Objects;

public class Flowers implements Comparable<Flowers> {
    private String name;
    private int freshness;
    private int price;
    private int stem;


    public Flowers(String name, int freshness, int price, int stem) {
        this.name = name;
        this.freshness = freshness;
        this.price = price;
        this.stem = stem;
    }

    public int getFreshness() {
        return freshness;
    }

    public void setFreshness(int freshness) {
        this.freshness = freshness;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStem() {
        return stem;
    }

    public void setStem(int stem) {
        this.stem = stem;
    }


    @Override
    public int compareTo(Flowers o) {
        int result = freshness - o.freshness;
        int value = 0;

        if (result > 0) {
            value = 1;
        } else if (result < 0) {
            value = -1;
        }
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flowers flowers = (Flowers) o;
        return freshness == flowers.freshness &&
                price == flowers.price &&
                stem == flowers.stem &&
                Objects.equals(name, flowers.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, freshness, price, stem);
    }

    @Override
    public String toString() {
        return "Flowers{" +
                "name='" + name + '\'' +
                ", freshness=" + freshness +
                ", price=" + price +
                ", stem=" + stem +
                '}';
    }


}

