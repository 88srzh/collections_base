package edu.java.game;

import java.util.*;

import static edu.java.game.Flowers.*;

public class Main {

    public static void main(String[] args) {
        SortedSet<Flowers> flowersSet = new TreeSet<>();
        flowersSet.add(new Flowers("Rose",10,100,50));
        flowersSet.add(new Flowers("Lilia", 3, 80,26));
        flowersSet.add(new Flowers("Lotus",4,90,25));
        flowersSet.add(new Flowers("Orchid",2,75,20));
        flowersSet.add(new Flowers("Chrysanthemum", 7, 60, 28 ));
        flowersSet.add(new Flowers("Sunflower", 6, 65, 55));
        flowersSet.add(new Flowers("Bluebell", 8, 70, 35));
        System.out.println("Сортировка цветов по свежести:");
        System.out.println(flowersSet);

        FlowersAction flowersAction = new FlowersAction();
        flowersAction.differenceStem(flowersSet);

    }
}
