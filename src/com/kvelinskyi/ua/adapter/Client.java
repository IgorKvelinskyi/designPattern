package com.kvelinskyi.ua.adapter;

/**
 * @author Igor Kvelinskyi (igorkvjava@gmail.com)
 */
//Client
public class Client {
    public void start() {
        System.out.println("Start");
        AmericanSocket  americanSocket= new Service();
        ClientInterface clientInterface  = new Adapter(americanSocket);
        Radio radio = new Radio();
        radio.listenMusic(clientInterface);
    }
}
