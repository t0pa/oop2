package org.example.week13.vjezba2.task4;

public class DeviceAdapter implements NewDevice{
    OldDeviceImpl oldDevice ;

    public DeviceAdapter(OldDeviceImpl oldDevice){
        this.oldDevice=oldDevice;
    }

    @Override
    public void operateNewFunction() {
            oldDevice.operateOldFunction();
    }


}
