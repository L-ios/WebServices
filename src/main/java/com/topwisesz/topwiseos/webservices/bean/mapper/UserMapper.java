package com.topwisesz.topwiseos.webservices.bean.mapper;

import com.topwisesz.topwiseos.webservices.bean.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User obj = new User();
        obj.setId(rs.getInt("id"));
        obj.setRid(rs.getString("rid"));
        obj.setImei(rs.getString("imei"));
        obj.setSwVersion(rs.getString("swversion"));
        return obj;
    }
}
