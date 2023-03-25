package com.company;

public class Inheritance {

    public static void main(String[] args) {
        SpaceObject[] list = new SpaceObject[3];

        SpaceObject blackhole = new BlackHole();
        SpaceObject star = new Star();
        SpaceObject ufo = new UFO();

        list[0] = blackhole;
        list[1] = star;
        list[2] = ufo;

        for(SpaceObject object : list)
        {
            if(object instanceof IAttractble)
            {
                ((IAttractble)object).attract();
            }
            if(object instanceof IShinable)
            {
                ((IShinable)object).shine();
            }
        }

        // blackhole.attract();
        // star.attract();
        // star.shine();
        // ufo.shine();

}
}
