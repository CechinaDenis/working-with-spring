package com.learning2code.spring.model;

/**
 * Created on 11/27/2020
 * Author Cechina Denis
 */
public class InitialMusic implements Music {
    @Override
    public String getSong() {
        return "Playing initial music";
    }

    public void doInitMethod() {
        System.out.println("Doing initialization");
    }

    public void doDestroyMethod() {
        System.out.println("Doing cleaning before bean destroy");
    }
}
