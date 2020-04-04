package com.zyj.dubbospi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

public class CarDemo {
    public static void main(String[] args) {
        ExtensionLoader<ICar> extensionLoader = ExtensionLoader.getExtensionLoader(ICar.class);

        Map<String, String> map = new HashMap<String, String>();
        map.put("car", "black");
        URL url = new URL("", "", 1, map);
        ICar iCar = extensionLoader.getExtension("benz");
        iCar.getColor(url);
    }
}
