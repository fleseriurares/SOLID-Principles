package com.solid.o.good;

public class GoodServer {
    public void reactToClient(Client_I client) {
        client.waitingToJoin();
        System.out.println("I am doing something good");
    }
}
