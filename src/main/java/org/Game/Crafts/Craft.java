package org.Game.Crafts;

import org.Game.Mechanics.Mechanic;
import org.Game.Resources.EarthRes;

import java.util.Scanner;

public class Craft {
    public static void pickaxe (EarthRes earthRes, Mechanic mechanic) {
        System.out.println("price: 250 wood + 150 stone");
        System.out.println("you want buy it?");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        if (mechanic.getLevel() >= 2) {
            System.out.println("you already have level 2 and above");
            return;
        }
        if (in.equals("да") || in.equals("yes")) {
            if (earthRes.getWood() >= 250 & earthRes.getStone() >= 150) {
                earthRes.setWood(earthRes.getWood() - 250);
                earthRes.setStone(earthRes.getStone() - 150);
                mechanic.setLevel(2);
                System.out.println("Operation be do");
                System.out.println("Your level is 2");
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
