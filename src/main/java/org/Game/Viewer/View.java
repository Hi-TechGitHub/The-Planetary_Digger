package org.Game.Viewer;

import org.Game.Mechanics.Mechanic;
import org.Game.Resources.EarthRes;
import org.Game.Crafts.Craft;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Mechanic mechanic = new Mechanic();
        EarthRes earthRes = new EarthRes();
        boolean play = true;
        int level = 1;

        System.out.println("write \"stop\" to stop");
        System.out.println("press Enter to dig");
        System.out.printf("Your level is %s - in one click you conduct %s excavation", level, level);
        while (true) {
            while (play) {
                Scanner in = new Scanner(System.in);
                System.out.println(
                        """
                                dig - dig earth
                                shop - in shop
                                exit - exit
                                
                                
                                
                                """);
                String scan = in.nextLine();
                if (scan.equals("dig")) {
                    if (scan.equals("stop")) {
                        break;
                    }
                    System.out.println("stop to stop digging");
                    while (true) {
                        Scanner scanner = new Scanner(System.in);
                        String digging = scanner.nextLine();
                        System.out.println("dig");
                        if (digging.equals("stop")) {
                            break;
                        }
                        for (int i = level; i != 0; i--) {
                            mechanic.randomIncrement(earthRes);
                        }

                    }
                }
                if (scan.equals("exit")) {
                    System.out.println("Пока");
                    break;
                }
                if (scan.equals("shop")) {
                    System.out.println("""
                            start - first element in shop
                            exit - exit from shop
                            buy - buy product
                            "skip" to second product
                            """);
                    Scanner in2 = new Scanner(System.in);
                    ArrayList<String> arrayList = new ArrayList<String>(5);
                    arrayList.add("pickaxe");
                    for (int i = 0; i < arrayList.size(); i++) {
                        System.out.println(arrayList.get(i));
                        String ans = in.nextLine();
                        if (ans == "старт" || ans == "start") {
                            i = 0;
                        }
                        if (ans == "exit") {
                            break;
                        }
                        if (ans == "buy") {
                            Craft.pickaxe(earthRes);
                        }
                    }
                    System.out.println(arrayList);
                }
            }
            System.out.println("the digging is complete");
            System.out.println("Your resources");
            System.out.println(earthRes.toString());

        }
    }
}
