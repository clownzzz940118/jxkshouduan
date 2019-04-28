package com.fykj.jxks.mapper;

import com.fykj.jxks.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    User userLogin(@Param("username")String username,@Param("password")String password);

    int userRegist(@Param("username")String username,@Param("password") String pwd);

    User findUserByUsername(String username);
}
