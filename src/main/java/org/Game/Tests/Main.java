package org.Game.Tests;
import org.Game.Mechanics.Mechanic;
import org.Game.Resources.EarthRes;
import org.Game.Crafts.Craft;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        EarthRes earthRes = new EarthRes();
        earthRes.setWood(350);
        earthRes.setStone(350);
        Craft.pickaxe(earthRes, mechanic);
        System.out.println(mechanic.getLevel());
    }
}
