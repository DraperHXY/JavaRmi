package com.draper;

import java.rmi.Remote;

public interface HelloService extends Remote {

    String getMsg(String msg);

}
