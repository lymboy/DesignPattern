package com.lymboy.designpattern.strategy;

/**
 * @author sairo
 * @version 1.0
 * @date 2021-02-26 20:11:12
 */
public class FlyStrategy implements Strategy{

    @Override
    public void doMethod() {
        System.out.println("坐飞机。。。");
    }
}
