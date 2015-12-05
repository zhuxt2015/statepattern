package com.zhuxt.entity;

/**
 * Created by Administrator on 2015/12/5.
 */
public class WinnerState implements State {

    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经投币了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("无法退币");
    }

    @Override
    public void turnCrank() {
        System.out.println("正在出货，别动");
    }

    @Override
    public void dispense() {
        System.out.println("Your a winner! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
