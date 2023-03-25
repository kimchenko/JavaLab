package com.company;

public class BlackHole extends SpaceObject implements IAttractble{
    @Override
    public void attract() {
        System.out.println("Black Hole attract you, friend!");
}
}
