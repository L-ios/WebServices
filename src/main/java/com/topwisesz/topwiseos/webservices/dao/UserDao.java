package com.topwisesz.topwiseos.webservices.dao;

import com.topwisesz.topwiseos.webservices.bean.User;
import com.topwisesz.topwiseos.webservices.bean.mapper.UserMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDao {
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<User> getUser(String name, String password) {

        StringBuilder sql = new StringBuilder(" select `id`, `rid`, `imei`, `swversion` from DeviceInfo");
//        sql.append(" where `name` = ? and `password` = ?");
        sql.append(" where `id` = ?");

        return jdbcTemplate.query(sql.toString(), new String[] { name }, new UserMapper());
    }
}
