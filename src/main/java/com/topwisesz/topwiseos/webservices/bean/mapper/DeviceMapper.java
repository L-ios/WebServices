package com.topwisesz.topwiseos.webservices.bean.mapper;

import com.topwisesz.topwiseos.webservices.bean.Device;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface DeviceMapper {
    @Select("SELECT * FROM users WHERE id = #{deviceId}")
    Device getUser(@Param("deviceId") String deviceId);
}