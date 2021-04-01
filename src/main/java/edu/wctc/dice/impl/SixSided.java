package edu.wctc.dice.impl;

import edu.wctc.dice.iface.Die;

import java.util.Random;

public class SixSided implements Die {

    private int sides = 6;

    @Override
    public int rollDie() {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}
