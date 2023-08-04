package org.Game.Resources;

import java.util.Random;

public class EarthRes {
    private int wood;
    private int oil;
    private int water;
    private int stone;
    private int dirt;
    private int gases;
    private int preciousStones;

    @Override
    public String toString() {
        return "Wood - " + wood + "\n"
                + "Oil - " + oil + "\n"
                + "Water - " + water + "\n"
                + "Stone - " + stone + "\n"
                + "Dirt - " + dirt + "\n"
                + "Gases - " + gases + "\n"
                + "Precious stones - " + preciousStones + "\n";
    }
    public void randomIncrement() {
        Random random = new Random();

        // dirt с 20% шансом
        if (random.nextInt(100) < 20) {
            dirt++;
        }

        // wood с 10% шансом
        if (random.nextInt(100) < 10) {
            wood++;
        }

        // preciousStones с 5% шансом
        if (random.nextInt(100) < 5) {
            preciousStones++;
        }

        // oil с 15% шансом
        if (random.nextInt(100) < 15) {
            oil++;
        }

        // water с 20% шансом
        if (random.nextInt(100) < 20) {
            water++;
        }

        // stone с 20% шансом
        if (random.nextInt(100) < 20) {
            stone++;
        }

        // gases с 10% шансом
        if (random.nextInt(100) < 10) {
            gases++;
        }
    }

    public int getPreciousStones() {
        return preciousStones;
    }

    public void setPreciousStones(int preciousStones) {
        this.preciousStones = preciousStones;
    }

    public int getWood() {
        return wood;
    }

    public void setWood(int wood) {
        this.wood = wood;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getStone() {
        return stone;
    }

    public void setStone(int stone) {
        this.stone = stone;
    }

    public int getDirt() {
        return dirt;
    }

    public void setDirt(int dirt) {
        this.dirt = dirt;
    }

    public int getGases() {
        return gases;
    }

    public void setGases(int gases) {
        this.gases = gases;
    }
}
