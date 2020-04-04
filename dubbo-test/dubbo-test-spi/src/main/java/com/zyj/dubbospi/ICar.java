package com.zyj.dubbospi;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface ICar {
    void getSize();

    @Adaptive("car")
    void getColor(URL url);
}
