package com.ericjin.javadmin.beans;

import com.ericjin.javadmin.annotation.*;
import lombok.Data;

@Data
@ShowName(name = "用户表")
@EntityTableName(name = "admin_user")
public class User {
    @Id
    private Integer id;

    private String username;

    @Password
    private String password;

    private String email;
    private String isAdmin;
}
