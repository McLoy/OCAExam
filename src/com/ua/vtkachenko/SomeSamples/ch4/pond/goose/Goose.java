package com.ua.vtkachenko.SomeSamples.ch4.pond.goose;

import com.ua.vtkachenko.SomeSamples.ch4.pond.shore.Bird;

public class Goose extends Bird {

    public void helpGooseSwim(){
        Goose other = new Goose();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim(){
        Bird other = new Bird();
        //other.floatInWater();
        //System.out.println(other.text);
    }
}
