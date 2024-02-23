package com.beta.miniactiongame.util;

import lombok.experimental.UtilityClass;

import java.util.Random;

@UtilityClass
public final class UtilityMethods {
    private final Random random = new Random();

    public static int getRandomInt(int maxInt) {
        return random.nextInt(maxInt);
    }
}