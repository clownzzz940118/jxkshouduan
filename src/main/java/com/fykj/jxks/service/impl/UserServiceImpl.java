package com.fykj.jxks.service.impl;



import com.fykj.jxks.entity.User;
import com.fykj.jxks.mapper.UserDao;
import com.fykj.jxks.service.IUserService;
import com.fykj.jxks.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao ;

    @Override
    public User userLogin(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        String md5pwd = MD5Utils.encodeByMd5(password);
        return userDao.userLogin(username,md5pwd);
    }

    @Override
    public User userRegist(String username, String pwd) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        User user = findUserByUsername(username);
        if(null!=user){
            return null;
        }else{
            String md5pwd = MD5Utils.encodeByMd5(pwd);
            userDao.userRegist(username,md5pwd);
            return userDao.userLogin(username,md5pwd);
        }
    }

    @Override
    public User findUserByUsername(String username) {
        return userDao.findUserByUsername(username);
    }
}
