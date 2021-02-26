package com.lymboy.designpattern.strategy;

/**
 * @author sairo
 * @version 1.0
 * @date 2021-02-26 20:11:52
 */
public class TrainStrategy implements Strategy{

    @Override
    public void doMethod() {
        System.out.println("坐火车。。。");
    }
}
