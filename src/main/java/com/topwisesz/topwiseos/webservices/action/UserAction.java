package com.topwisesz.topwiseos.webservices.action;

import com.topwisesz.topwiseos.webservices.bean.Device;
import com.topwisesz.topwiseos.webservices.bean.impl.DeviceImpl;

public class UserAction extends BaseAction {
    private DeviceImpl deviceService;

    public DeviceImpl getDeviceService() {
        return deviceService;
    }

    public void setDeviceService(DeviceImpl deviceService) {
        this.deviceService = deviceService;
    }

    public String login() throws Exception{
        Device device = deviceService.getDevice("100008441");
        if (device != null) {
            getWriter().write(device.toString());
            return null;
        } else {
            getWriter().write("code not right!!!!");
            return null;
        }
    }
}
