package Service;

import pojo.User;

public interface UserService {
    User u(String userPhone,String userPwd);
    User uu(String userPhone);
    Boolean InsertUser(User user);
    Boolean SelectUser(User user);

}
