package com.example.a00885912.myapplication;

/**
 * Created by Mick on 11/29/2015.
 */
public class Spell extends Card {

    protected Spell(String cardName, int cardImgSrc, Rarity rarity, int manaCost, Set set,
                    boolean collectable,  Class classes, String description, Trait trait, String flavorText) {
        super(cardName, cardImgSrc, description, flavorText, manaCost, collectable, rarity, classes, trait, set);
    }

    public int getType() {
        return 1;
    }
}
