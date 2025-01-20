package org.example.week13.vjezba2.buildertask;

import com.mysql.cj.log.Log;
import org.example.week13.vjezba2.task5.TrafficLightContext;
import org.example.week5.Main;

import javax.naming.TimeLimitExceededException;


interface OldDevice{
    void operateOldFunction();
}
interface NewDevice{
    void    operateNewFunction();
}

class OldDeviceImpl implements OldDevice{


    @Override
    public void operateOldFunction() {
        System.out.println("old");
    }
}

class NewDeviceImpl implements NewDevice{

    @Override
    public void operateNewFunction() {
        System.out.println("new");
    }
}

class OldDeviceAdapter implements NewDevice{

    OldDevice device;

    public OldDeviceAdapter(OldDevice device){
        this.device=device;
    }


    @Override
    public void operateNewFunction() {
        device.operateOldFunction();
    }
}

public class Logger{

    private static Logger instance;

    private Logger(){};

    public synchronized Logger getInstance(){
        if (instance==null){
            return new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("logging : "+ message);
    }


}

class aain{
    public static void main(String[] args) {
       OldDeviceImpl d1= new OldDeviceImpl();
       NewDeviceImpl d2 = new NewDeviceImpl();
       OldDeviceAdapter adapter1= new OldDeviceAdapter(d1);
       adapter1.operateNewFunction();


    }
}