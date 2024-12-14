package com.mesbah.javacoreconcepts.inversionOfControl;

public class Robi implements Sim{
    @Override
    public void calling() {
        System.out.println("Robi calling");
    }

    @Override
    public void data() {
        System.out.println("Robi Data");
    }
}
