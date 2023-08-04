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
