package com.qust.decorator;
//抽象Coffee
public class Coffee extends Drink{
    @Override
    public float cost() {
        return getPrice();
    }
}
