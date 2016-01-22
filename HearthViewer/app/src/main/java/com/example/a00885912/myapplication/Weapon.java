package com.example.a00885912.myapplication;

/**
 * Created by Mick on 11/29/2015.
 */
public class Weapon extends Card {
    private int durability;
    private int damage;

    protected Weapon(String cardName, int cardImgSrc, Rarity rarity, int manaCost, Set set,
                     boolean collectable,  Class classes, String description, Trait trait, String flavorText,
                     int durability, int damage) {
        super(cardName, cardImgSrc, description, flavorText, manaCost, collectable, rarity, classes, trait, set);
        this.damage = damage;
        this.durability = durability;
    }

    public int getDur() {
        return durability;
    }

    public int getDamage() {
        return damage;
    }

    public int getType() {
        return 2;
    }
}
