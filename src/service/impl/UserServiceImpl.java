package service.impl;

import Dao.impl.UserDao1Impl;
import pojo.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User u(String userPhone,String userPwd) {
        UserDao1Impl ud = new UserDao1Impl();
        User u = new User();
        u.setUserPhone(userPhone);
        u.setUserPwd(userPwd);
        User uu = ud.all(u);
        return uu;
    }

    @Override
    public User uu(String userPhone) {
        UserDao1Impl ud = new UserDao1Impl();
        User u = new User();
        u.setUserPhone(userPhone);
        User uu = ud.allByPhone(u);
        return uu;
    }
}
