package org.Game.Tests;
import org.Game.Mechanics.Mechanic;
import org.Game.Resources.EarthRes;
import org.Game.Crafts.Craft;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EarthRes earthRes = new EarthRes();
        Craft.pickaxe(earthRes);
    }
}
