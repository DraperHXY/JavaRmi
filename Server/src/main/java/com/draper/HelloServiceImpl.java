package com.draper;


import java.io.Serializable;
import java.rmi.RemoteException;

public class HelloServiceImpl implements HelloService, Serializable {

    private static final long serialVersionUID = 1961558474342609777L;

    public HelloServiceImpl() throws RemoteException {
        super();
    }

    public String getMsg(String msg) {
        return "Hello World!" + msg;
    }

}
