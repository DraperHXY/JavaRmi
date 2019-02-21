package com.draper;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloService extends Remote {

    String getMsg(String msg) throws RemoteException;

}
