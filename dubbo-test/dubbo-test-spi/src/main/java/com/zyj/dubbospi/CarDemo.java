package com.zyj.dubbospi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class CarDemo {
    public static void main(String[] args) {
        ExtensionLoader<ICar> extensionLoader = ExtensionLoader.getExtensionLoader(ICar.class);
        ICar iCar = extensionLoader.getExtension("red");
        iCar.getColor();
    }
}
