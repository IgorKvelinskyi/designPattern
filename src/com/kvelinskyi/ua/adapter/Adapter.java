package com.kvelinskyi.ua.adapter;

/**
 * @author Igor Kvelinskyi (igorkvjava@gmail.com)
 */
public class Adapter implements ClientInterface {
    AmericanSocket americanSocket;

    public Adapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        System.out.println("Start Adapter connect americanSocket with ClientInterface getPower()");
        americanSocket.getPower();
    }
}
