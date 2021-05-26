package com.kvelinskyi.ua.adapter;

/**
 * @author Igor Kvelinskyi (igorkvjava@gmail.com)
 */
public class Radio {
    public void listenMusic(ClientInterface clientInterface) {
        System.out.println("Start Radio listenMusic. Connect clientInterface");
        clientInterface.getPower();
    }
}
