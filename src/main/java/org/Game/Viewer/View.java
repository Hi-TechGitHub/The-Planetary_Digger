package org.Game.Viewer;

import org.Game.Resources.EarthRes;

import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        EarthRes earthRes = new EarthRes();
        boolean play = true;
        int level = 15;

        System.out.println("write \"stop\" to stop");
        System.out.println("press Enter to dig");
        System.out.printf("Your level is %s - in one click you conduct %s excavation", level, level);


        while (true) {
            Scanner in = new Scanner(System.in);
            String scan = in.nextLine();
            if (scan.equals("stop")) {
                break;
            }
            System.out.println("dig");
            for (int i = level; i != 0; i--) {
                earthRes.randomIncrement();
            }
        }


        System.out.println("the digging is complete");
        System.out.println("Your resources");
        System.out.println(earthRes.toString());


    }
}
