package com.draper;


import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class ServerApp {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException, MalformedURLException, InterruptedException {

        HelloService helloService = new HelloServiceImpl();
        LocateRegistry.createRegistry(8888);
        Naming.bind("rmi://127.0.0.1:8888/hello", helloService);
        System.out.println("绑定成功");
        Thread.sleep(5000000);

    }

}
