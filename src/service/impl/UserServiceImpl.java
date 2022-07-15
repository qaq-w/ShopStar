package service.impl;

import Dao.impl.UserDao1Impl;
import pojo.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    /**
     * 登录查询用户密码是否正确
     * @param userPhone
     * @param userPwd
     * @return
     */
    @Override
    public User u(String userPhone,String userPwd) {
        UserDao1Impl ud = new UserDao1Impl();
        User u = new User();
        u.setUserPhone(userPhone);
        u.setUserPwd(userPwd);
        User uu = ud.all(u);
        return uu;
    }

    /**
     *查询账号是否存在
     * @param userPhone
     * @return
     */
    @Override
    public User uu(String userPhone) {
        UserDao1Impl ud = new UserDao1Impl();
        User u = new User();
        u.setUserPhone(userPhone);
        User uu = ud.allByPhone(u);
        return uu;
    }

    /**
     * 检查账号密码是否合乎规范
     * @param user
     * @return
     */
    public Boolean InsertUser(User user) {
        UserDao1Impl userD = new UserDao1Impl();
        if (user.getUserPhone().length() == 11) {
            if (userD.all(user).getUserPhone() == null) {
                if (user.getUserPwd().length() <= 16 && user.getUserPwd().length() >= 8) {
                    userD.insertUser(user);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
    /**
     *连接数据库查询账号是否存在
     * @param user
     * @return
     */
    public Boolean SelectUser(User user) {
        UserDao1Impl usera = new UserDao1Impl();
        if (usera.allByPhone(user).getUserPhone() == null) {
            return true;
        } else {
            return false;
        }
    }
}
