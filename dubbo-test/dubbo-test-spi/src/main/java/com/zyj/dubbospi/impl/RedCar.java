package com.zyj.dubbospi.impl;

import com.alibaba.dubbo.common.URL;
import com.zyj.dubbospi.ICar;

public class RedCar implements ICar {
    @Override
    public void getSize() {

    }

    @Override
    public void getColor(URL url) {
        System.out.println("red");
    }
}
