package com.lymboy.designpattern.strategy;

/**
 * @author sairo
 * @version 1.0
 * @date 2021-02-26 20:14:31
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        Strategy strategy = new TrainStrategy();
        context.setStrategy(strategy);

        context.doMethod();
    }
}
