package com.jindb.service;

import com.jindb.dao.BasDutyInfoMapper;
import com.jindb.dao.PubUserInfoMapper;
import com.jindb.dao.UserMapper;
import com.jindb.model.BasDutyInfo;
import com.jindb.model.PubUserInfo;
import com.jindb.model.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * Created by jindb on 2017/5/23.
 */
@Service
public class UserService {
    @Autowired
    private PubUserInfoMapper userDao;
    @Autowired
    private BasDutyInfoMapper dutyDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
//    public boolean addUser(String username, String password){
//        return userDao.insertUser(username, password)==1?true:false;
//    }
//
//    public User addUserWithBackId(String username, String password){
//        User user = new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        userDao.insertUserWithBackId(user);//该方法后，主键已经设置到user中了
//        return user;
//    }

    public PubUserInfo GetUserInfo(){
        PubUserInfo user= userDao.selectAll().get(0);
       // dutyDao.selectAll();
        LOGGER.info("测试");
        return user;
    }

}
