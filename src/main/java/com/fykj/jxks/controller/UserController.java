package com.fykj.jxks.controller;

import com.alibaba.fastjson.JSON;
import com.fykj.jxks.entity.User;
import com.fykj.jxks.service.ITreeListService;
import com.fykj.jxks.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

@RestController
@ResponseBody
public class UserController {

    @Autowired
    private IUserService userService;
    @PostMapping("/userLogin")
    public String userLogin(String username,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        Map map  = new HashMap<>();
        if(null==userService.userLogin(username,password)){
            User user = userService.findUserByUsername(username);
            if(user==null){
                map.put("msg","用户不存在");
            }else{
                map.put("msg","用户名或密码错误");
            }
            return JSON.toJSONString(map);
        }
        return JSON.toJSONString(userService.userLogin(username,password));
    }

    @PostMapping("/userRegist")
    public String userRegist(String username,String password) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        return JSON.toJSONString(userService.userRegist(username,password)) ;
    }


}
