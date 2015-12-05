package com.zhuxt.entity;

/**
 * Created by Administrator on 2015/12/5.
 */
public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("no gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("no quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("pay first");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }

    @Override
    public String toString() {
        return "Sold Out State";
    }
}
