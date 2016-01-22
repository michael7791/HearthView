package com.example.a00885912.myapplication;

/**
 * Created by a00885912 on 11/26/2015.
 */
public enum Rarity {
    BASIC(0),COMMON(40),RARE(100),EPIC(400),LEGENDARY(1600);
    private final int dust;
    Rarity(int dust) {
        this.dust = dust;
    }

    int getDust() {
        return dust;
    }
}
