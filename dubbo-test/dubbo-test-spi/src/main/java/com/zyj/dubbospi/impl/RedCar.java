package com.zyj.dubbospi.impl;

import com.zyj.dubbospi.ICar;

public class RedCar implements ICar {
    @Override
    public void getColor() {
        System.out.println("red");
    }
}
