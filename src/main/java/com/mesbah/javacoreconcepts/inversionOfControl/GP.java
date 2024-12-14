package com.mesbah.javacoreconcepts.inversionOfControl;

public class GP implements Sim{
    @Override
    public void calling() {
        System.out.println("GP Calling");
    }

    @Override
    public void data() {
        System.out.println("GP Data");
    }
}
