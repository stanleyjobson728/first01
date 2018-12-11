package com.springboot.config;

import com.springboot.jpa.UserJpa;
import com.springboot.mapper.UserMapper;
import com.springboot.model.Permission;
import com.springboot.model.Role;
import com.springboot.model.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ghost on 2018/12/10.
 */
public class CustomRealm extends AuthorizingRealm {

    @Resource
    private UserMapper userMapper;

    @Resource
    private UserJpa userJpa;

//    @Autowired
//    private void setUserMapper(UserMapper userMapper) {
//        this.userMapper = userMapper;
//    }

    /**
     * 获取身份验证信息
     * Shiro中，最终是通过 Realm 来获取应用程序中的用户、角色及权限信息的。
     *
     * @param authenticationToken 用户身份信息 token
     * @return 返回封装了用户信息的 AuthenticationInfo 实例
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("————身份认证方法————");
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        // 从数据库获取对应用户名密码的用户
//        String password = userMapper.getPassword(token.getUsername());
        User byUserName = userJpa.findByUsername(token.getUsername());
        String password = byUserName.getPassword();
        if (null == password) {
            throw new AccountException("用户名不正确");
        } else if (!password.equals(new String((char[]) token.getCredentials()))) {
            throw new AccountException("密码不正确");
        }
        return new SimpleAuthenticationInfo(token.getPrincipal(), password, getName());
    }

    /**
     * 获取授权信息
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("————权限认证————");
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        //获得该用户角色
//        String role = userMapper.getRole(username);
        User byUserName = userJpa.findByUsername(username);
        List<Role> roles = byUserName.getRoles();
        //需要将 role 封装到 Set 作为 info.setRoles() 的参数
//        Set<String> set = new HashSet<>();
//        set.add(role);
        //设置该用户拥有的角色
//        info.setRoles(set);
        for (Role role:roles) {
            //添加角色
            info.addRole(role.getRoleName());
            for (Permission permission:role.getPermissions()) {
                //添加权限
                info.addStringPermission(permission.getPermission());
            }
        }
        return info;
    }
}