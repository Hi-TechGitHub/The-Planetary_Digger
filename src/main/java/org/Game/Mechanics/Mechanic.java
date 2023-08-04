package org.Game.Mechanics;

import org.Game.Resources.EarthRes;

import java.util.Random;

public class Mechanic {
    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void randomIncrement(EarthRes earthRes) {

        Random random = new Random();

        // dirt с 20% шансом
        if (random.nextInt(100) < 20) {
            earthRes.setDirt(earthRes.getDirt() + 1);
        }

        // wood с 10% шансом
        if (random.nextInt(100) < 10) {
            earthRes.setWood(earthRes.getWood() + 1);
        }

        // preciousStones с 5% шансом
        if (random.nextInt(100) < 5) {
            earthRes.setPreciousStones(earthRes.getPreciousStones() + 1);
        }

        // oil с 15% шансом
        if (random.nextInt(100) < 15) {
            earthRes.setOil(earthRes.getOil() + 1);
        }

        // water с 20% шансом
        if (random.nextInt(100) < 20) {
            earthRes.setWater(earthRes.getWater() + 1);
        }

        // stone с 20% шансом
        if (random.nextInt(100) < 20) {
            earthRes.setStone(earthRes.getStone() + 1);
        }

        // gases с 10% шансом
        if (random.nextInt(100) < 10) {
            earthRes.setGases(earthRes.getGases() + 1);
        }
    }
}
