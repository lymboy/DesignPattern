package com.lymboy.designpattern.strategy;

/**
 * @author sairo
 * @version 1.0
 * @date 2021-02-26 20:10:25
 */
public class TaxiStrategy implements Strategy{

    @Override
    public void doMethod() {
        System.out.println("骑摩托车。。。");
    }
}
