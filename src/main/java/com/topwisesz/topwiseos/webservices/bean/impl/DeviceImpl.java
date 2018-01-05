package com.topwisesz.topwiseos.webservices.bean.impl;

import com.topwisesz.topwiseos.webservices.bean.Device;
import com.topwisesz.topwiseos.webservices.bean.mapper.DeviceMapper;

public class DeviceImpl {
    private DeviceMapper deviceMapper;

    public void setUserMapper(DeviceMapper deviceMapper) {
        this.deviceMapper = deviceMapper;
    }

    public Device getDevice(String deviceId) {
        return this.deviceMapper.getUser(deviceId);
    }
}
