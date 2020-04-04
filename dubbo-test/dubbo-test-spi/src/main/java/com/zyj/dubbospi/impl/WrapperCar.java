package com.zyj.dubbospi.impl;

import com.zyj.dubbospi.ICar;

public class WrapperCar implements ICar {
    private ICar iCar;

    public WrapperCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void getColor() {
        System.out.println("before");
        iCar.getColor();
        System.out.println("after");
    }
}
