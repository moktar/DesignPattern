package com.example.designpattern.structuralpattern.proxypattern;

import android.util.Log;

public class RealInternetAccess implements OfficeInternetAccess {


    private String employeeName;

    public RealInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    public void grantInternetAccess() {
        Log.i("Proxy: ","Internet Access granted for employee: "+ employeeName);
    }
}
