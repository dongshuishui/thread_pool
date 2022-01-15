package com.dongshuishui.demo;

public class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"running");
    }
}
