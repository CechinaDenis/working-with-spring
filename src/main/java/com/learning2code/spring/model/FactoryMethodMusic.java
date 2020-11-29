package com.learning2code.spring.model;

/**
 * Created on 11/27/2020
 * Author Cechina Denis
 */
public class FactoryMethodMusic implements Music {
    private FactoryMethodMusic() {
    }

    public static FactoryMethodMusic getFactoryMethod() {
        return new FactoryMethodMusic();
    }

    @Override
    public String getSong() {
        return "FactoryMethodMusic";
    }
}
