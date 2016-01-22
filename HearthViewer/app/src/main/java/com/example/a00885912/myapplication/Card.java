package com.example.a00885912.myapplication;

/**
 * Created by a00885912 on 11/12/2015.
 */
public abstract class Card {
    private String cardName,description,flavorText;
    private int manaCost,cardImgSrc;
    private boolean collectable;
    private Rarity rarity;
    private Class classes;
    private Trait trait;
    private Set set;
    protected Card(String cardName, int cardImgSrc, String description,
                String flavorText, int manaCost, boolean collectable,
                   Rarity rarity, Class classes, Trait trait, Set set) {
        this.cardName = cardName;
        this.cardImgSrc = cardImgSrc;
        this.description = description;
        this.flavorText = flavorText;
        this.manaCost = manaCost;
        this.collectable = collectable;
        this.rarity = rarity;
        this.classes = classes;
        this.set = set;
        this.trait = trait;
    }

    public String getName() {
        return cardName;
    }

    public int getImgSrc() {
        return cardImgSrc;
    }

    public String getDescription() {
        return description;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public int getManaCost() {
        return manaCost;
    }

    public boolean getCollectable() {
        return collectable;
    }

    public String getRarity() {
        switch(rarity) {
            case BASIC : return "BASIC";
            case COMMON : return "COMMON";
            case RARE : return "RARE";
            case EPIC : return "EPIC";
            case LEGENDARY : return "LEGENDARY";
        }
        return "ERROR";
    }

    public String getClasses() {
        switch(classes) {
            case MAGE:  return "Mage";
            case HUNTER:  return "Hunter";
            case DRUID:  return "Druid";
            case SHAMAN:  return "Shaman";
            case WARLOCK:  return "Warlock";
            case WARRIOR: return "Warrior";
            case PRIEST: return "Priest";
            case PALADIN: return "Paladin";
            case ROGUE: return "Rogue";
            case NEUTRAL: return "ERROR, spell cannot be neutral";
        }
        return "ERROR";
    }

    public String getTrait() {
        switch(trait) {
            case BATTLECRY:  return "Mage";
            case DEATHRATTLE:  return "Hunter";
            case DSHIELD:  return "Druid";
            case SECRET:  return "Shaman";
            case INSPIRE:  return "Warlock";
            case AURA: return "Warrior";
            case CHARGE: return "Priest";
            case TAUNT: return "Paladin";
            case ENRAGE: return "Warrior";
            case NONE: return "";
        }
        return "";
    }

    public String getSet() {
        switch(set) {
            case VAN:  return "Vanilla";
            case NAX:  return "Naxxramas";
            case GVG:  return "Goblins VS Gnomes";
            case TGT:  return "The Grand Tournament";
            case LOE:  return "League of Explorers";
            case BRM: return "Black Rock Mountain";
        }
        return "ERROR";
    }

    public int getDust() {
        return rarity.getDust();
    }
}
