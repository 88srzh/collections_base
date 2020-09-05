package edu.java.game;

import java.util.*;

import static edu.java.game.Flowers.*;

public class Main {

    public static void main(String[] args) {
        TreeSet<Flowers> flowersSet = new TreeSet<>();
        flowersSet.add(new Flowers("Rose",5,100,30));
        flowersSet.add(new Flowers("Lilia", 3, 80,20));
        flowersSet.add(new Flowers("Lotus",4,90,28));
        flowersSet.add(new Flowers("Orchid",2,75,25));
        System.out.println(flowersSet);

        SortedSet<Flowers> stems = flowersSet.subSet(new Flowers("Orchid", 2, 75, 25), new Flowers("Rose", 5, 100, 30));
        System.out.println(stems);



    }
}
