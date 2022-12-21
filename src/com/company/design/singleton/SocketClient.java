package com.company.design.singleton;

import java.net.Socket;

public class SocketClient {

    private static SocketClient socketClient;

    private SocketClient(){

    }

    public static SocketClient getInstance(){

        if (this.socketClient == null){

        }
    }
}
