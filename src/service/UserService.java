package service;

import pojo.User;

public interface UserService {
    User u(String userPhone,String userPwd);
    User uu(String userPhone);
}
