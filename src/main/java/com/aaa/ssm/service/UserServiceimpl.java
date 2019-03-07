package com.aaa.ssm.service;

import com.aaa.ssm.dao.UserDao;
import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserServiceimpl
 * description:
 * author:zyj
 * createTime:2019/3/2 16:42
 */
@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private JedisUtil jedisUtil;
    @Override
    public List<Map> getUserList()
    {
        Object userList =jedisUtil.getObject("userlist");
        if (userList!=null){
            System.out.println("从redis缓存中取!!!");
            return (List<Map>) userList;
        }else{
            System.out.println("从数据库中取!!!");
            List<Map> userList1=userDao.getUserList();
            jedisUtil.putObject("userlist",userList1);
            return null;      }

    }
}
