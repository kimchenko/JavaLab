package com.company;

public class UFO extends SpaceObject implements IShinable{
    @Override
    public void shine() {
        System.out.println("UFO shine for you, friend!");
    }
}
