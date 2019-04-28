package com.fykj.jxks.service;

import com.fykj.jxks.entity.User;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public interface IUserService {

    User userLogin(String username, String password) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    User userRegist(String username, String pwd) throws UnsupportedEncodingException, NoSuchAlgorithmException;

    User findUserByUsername(String username);
}
