package com.draper;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class ClientApp {

    public static void main(String[] args) throws InterruptedException, RemoteException, NotBoundException, MalformedURLException {


        HelloService helloService = (HelloService) Naming.lookup("rmi://127.0.0.1:8888/hello");
        System.out.println(helloService.getMsg("Hello"));
    }

}
