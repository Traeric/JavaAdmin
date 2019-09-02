package com.ericjin.javadmin.shiro.token;

import com.ericjin.javadmin.shiro.enumerate.RoleType;
import lombok.Getter;
import org.apache.shiro.authc.UsernamePasswordToken;

@Getter
public class UserToken extends UsernamePasswordToken {
    private RoleType roleType;

    public UserToken() {
    }

    public UserToken(String email, String password, RoleType roleType) {
        super(email, password);
        this.roleType = roleType;
    }
}
