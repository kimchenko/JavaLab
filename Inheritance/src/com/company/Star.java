package com.company;

public class Star extends SpaceObject implements IShinable, IAttractble {

    @Override
    public void attract() {
        System.out.println("Star attract you, friend!");
    }

    @Override
    public void shine() {
        System.out.println("Star shine for you, friend!");
    }
}
