package com.lymboy.designpattern.strategy;

/**
 * @author sairo
 * @version 1.0
 * @date 2021-02-26 20:09:32
 */
public class BikeStrategy implements Strategy{

    @Override
    public void doMethod() {
        System.out.println("骑自行车。。。");
    }
}
