package com.example.a00885912.myapplication;

/**
 * Created by Mick on 11/29/2015.
 */
public class Minion extends Card {
    private int attack;
    private int health;
    private Race race;

    protected Minion(String cardName, int cardImgSrc, Rarity rarity, int manaCost, Set set,
                     boolean collectable,  Class classes, String description, Trait trait, String flavorText,
                     int attack, int health, Race race) {
        super(cardName, cardImgSrc, description, flavorText, manaCost, collectable, rarity, classes, trait, set);
        this.attack = attack;
        this.health = health;
        this.race = race;
    }

    public int getAttack() {
        return attack;
    }

    public int getHealth() {
        return health;
    }

    public String getRace() {
        switch(race) {
            case MECH: return "Mech";
            case MURLOC: return "Murloc";
            case TOTEM: return "Totem";
            case BEAST: return "Beast";
            case DEMON: return "Demon";
            case DRAGON: return "Dragon";
            case PIRATE: return "Pirate";
        }
        return "";
    }

}
