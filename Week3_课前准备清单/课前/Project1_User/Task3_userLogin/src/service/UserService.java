package service;

import db.UserDao;
import domain.User;

public class UserService
{
    private UserDao userDao = new UserDao();

    // 添加一个用户
    void addUser(User user)
    {
        //TODO:
    }


    // 获取所有用户列表
    public User getUser(String userName, String passwd)
    {
        return userDao.getUser(userName,passwd);
    }

}
