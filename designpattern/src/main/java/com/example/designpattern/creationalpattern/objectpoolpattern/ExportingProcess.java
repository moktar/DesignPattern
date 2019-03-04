package com.example.designpattern.creationalpattern.objectpoolpattern;

import android.util.Log;

public class ExportingProcess {

    private long processNo;

    public ExportingProcess(long processNo)  {
        this.processNo = processNo;
        // do some  expensive calls / tasks here in future
        // .........
        Log.i("Object Pool: ","Object with process no. " + processNo + " was created");
    }

    public long getProcessNo() {
        return processNo;
    }
}
