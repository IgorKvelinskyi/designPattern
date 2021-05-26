package com.kvelinskyi.ua.adapter;

/**
 * @author Igor Kvelinskyi (igorkvjava@gmail.com)
 */
public class Service implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("Start Service americanSocket");
        System.out.println("get 110 volt");
    }
}
