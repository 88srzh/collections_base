package edu.java.game;

import java.util.Iterator;
import java.util.Scanner;
import java.util.SortedSet;

public class FlowersAction {
    public void differenceStem(SortedSet<Flowers> flowers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Показать длину стебля от: ");
        int fromStem = scanner.nextInt();
        System.out.print("Показать длину стебля до: ");
        int toStem = scanner.nextInt();
        System.out.println("Найти цветок в букете, соответствующий заданному диапозону длин стеблей: " + fromStem + " - " + toStem);
        Iterator<Flowers> iterator = flowers.iterator();
        while (iterator.hasNext()) {
            Flowers flower = iterator.next();
            if ((flower.getStem() > fromStem) && (flower.getStem() < toStem)) {
                System.out.println(flower.getName() + " " + flower.getStem());
            }
        }
    }
}
