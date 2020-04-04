package com.zyj.dubbospi;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface ICar {
    void getColor();
}
