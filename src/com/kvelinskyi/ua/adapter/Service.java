package com.kvelinskyi.ua.adapter;

/**
 * @author Igor Kvelinskyi (igorkvjava@gmail.com)
 */
//Adaptee
public class Service implements AmericanSocket {
    @Override
    public void getPower() {
        System.out.println("Start Service americanSocket. get 110 volt");
    }
}
