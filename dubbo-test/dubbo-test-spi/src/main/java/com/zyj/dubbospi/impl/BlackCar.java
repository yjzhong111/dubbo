package com.zyj.dubbospi.impl;

import com.zyj.dubbospi.ICar;

public class BlackCar implements ICar {
    @Override
    public void getColor() {
        System.out.println("black");
    }
}
