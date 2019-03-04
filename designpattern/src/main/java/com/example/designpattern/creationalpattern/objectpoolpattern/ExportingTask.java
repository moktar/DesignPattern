package com.example.designpattern.creationalpattern.objectpoolpattern;

import android.util.Log;

public class ExportingTask implements Runnable {

    private ObjectPool<ExportingProcess> pool;
    private int threadNo;
    public ExportingTask(ObjectPool<ExportingProcess> pool, int threadNo){
        this.pool = pool;
        this.threadNo = threadNo;
    }

    @Override
    public void run() {
        // get an object from the pool
        ExportingProcess exportingProcess = pool.borrowObject();
        Log.i("Object Pool: ","Thread " + threadNo + ": Object with process no. " + exportingProcess.getProcessNo() + " was borrowed");

        //you can  do something here in future
        // .........

        // return ExportingProcess instance back to the pool
        pool.returnObject(exportingProcess);

        Log.i("Object Pool: ","Thread " + threadNo +": Object with process no. " + exportingProcess.getProcessNo() + " was returned");
    }
}
