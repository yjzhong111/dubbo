package com.zyj.dubbospi.impl;

import com.alibaba.dubbo.common.URL;
import com.zyj.dubbospi.ICar;

public class BenzCar implements ICar {

    private ICar iCar;

    public void setiCar(ICar iCar) {
        this.iCar = iCar;
    }

    @Override
    public void getSize() {

    }

    @Override
    public void getColor(URL url) {
        System.out.println("benz");
    }
}
