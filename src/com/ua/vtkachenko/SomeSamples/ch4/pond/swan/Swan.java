package com.ua.vtkachenko.SomeSamples.ch4.pond.swan;

import com.ua.vtkachenko.SomeSamples.ch4.pond.shore.Bird;

public class Swan extends Bird {

    public void swim(){
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanSwim(){
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdSwim(){
        Bird other = new Bird();
        //other.floatInWater();
        //System.out.println(other.text);
    }
}
