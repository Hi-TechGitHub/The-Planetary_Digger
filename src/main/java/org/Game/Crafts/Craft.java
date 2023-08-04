package org.Game.Crafts;

import org.Game.Mechanics.Mechanic;
import org.Game.Resources.EarthRes;

import java.util.Scanner;

public class Craft {
    public static void pickaxe (EarthRes earthRes) {
        System.out.println("price: 250 wood + 150 stone");
        System.out.println("you want buy it?");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        if (in == "да" || in == "yes") {
            if (earthRes.getWood() >= 250 || earthRes.getStone() >= 150) {
                earthRes.setWood(earthRes.getWood() - 250);
                earthRes.setStone(earthRes.getStone() - 150);
                Mechanic mechanic = new Mechanic();
                mechanic.setLevel(mechanic.getLevel() + 1);
            }
            else {
                System.out.println("not enough resources to create");
            }
        }
        else {
            System.out.println("Operation Canceled");
        }
    }
}
