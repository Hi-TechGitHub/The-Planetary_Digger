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
        mechanic.setLevel(1);


        while (true) {
            Scanner exitScan = new Scanner(System.in);
            System.out.printf
                    ("Your level is %s - in one click you conduct %s excavation", mechanic.getLevel(), mechanic.getLevel());
            while (play) {
                Scanner in = new Scanner(System.in);

                System.out.println(
                        """
                                dig - dig earth
                                shop - in shop
                                stop - exit from menu
                                print - print your resources 
                                                                
                                                                
                                """);
                String scan = in.nextLine();
                if (scan.equals("print")) {
                    System.out.println(earthRes.toString());
                }
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
                        for (int i = mechanic.getLevel(); i != 0; i--) {
                            mechanic.randomIncrement(earthRes);
                        }

                    }
                }
                if (scan.equals("stop")) {
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
                        String ans = in2.nextLine();
                        if (ans.equals("старт") || ans.equals("start")) {
                            i = 0;
                        }
                        if (ans.equals("exit")) {
                            break;
                        }
                        if (ans.equals("buy")) {
                            Craft.pickaxe(earthRes, mechanic);
                        }
                    }
                    System.out.println(arrayList);
                }
            }
            System.out.println("exit or continue");
            String exit = exitScan.nextLine();
            if (exit.equals("exit")) {
                break;
            }
            System.out.println("Your resources");
            System.out.println(earthRes.toString());

        }
    }
}
