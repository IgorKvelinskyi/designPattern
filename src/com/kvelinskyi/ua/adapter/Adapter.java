package com.kvelinskyi.ua.adapter;

/**
 * @author Igor Kvelinskyi (igorkvjava@gmail.com)
 */
//Adapter
public class Adapter implements ClientInterface {
    AmericanSocket americanSocket;

    public Adapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void getPower() {
        americanSocket.getPower();
        System.out.println("Adapter connect americanSocket with ClientInterface getPower()");
    }




}
