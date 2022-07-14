package Dao.impl;


import Dao.BaseDao1;
import Dao.UserDao;
import pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao1Impl extends BaseDao1 implements UserDao {
    @Override
    public int insertUser() {
        return 0;
    }

    @Override
    public int updateUser() {
        return 0;
    }

    @Override
    public User all(User u) {
        Connection co = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        User user = new User();
        try {
            pst =co.prepareStatement("select * from user where user_phone=? and user_pwd=?");
            Object [] a ={u.getUserPhone(),u.getUserPwd()};
            pst.setObject(1,a[0]);
            pst.setObject(2,a[1]);
            rs=pst.executeQuery();
            while (rs.next()){
                user.setUserId(rs.getInt("user_id"));
                user.setUserPhone(rs.getString("user_phone"));
                user.setUserPwd(rs.getString("user_pwd"));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeALL(co, pst, rs);
        }
        return null;
    }
}
