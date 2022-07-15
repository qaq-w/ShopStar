package Dao.impl;


import Dao.BaseDao1;
import Dao.UserDao;
import pojo.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDao1Impl extends BaseDao1 implements UserDao {
    public int insertUser() {
        return 0;
    }

    @Override
    public int updateUser() {
        return 0;
    }

    /**
     * 登录查询用户密码是否正确
     * @param u
     * @return
     */
    @Override
    public User all(User u) {
        Connection co = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        User user = new User();
        try {
            pst = co.prepareStatement("select * from user where user_phone=? and user_pwd=?");
            Object[] a = {u.getUserPhone(), u.getUserPwd()};
            pst.setObject(1, a[0]);
            pst.setObject(2, a[1]);
            rs = pst.executeQuery();
            while (rs.next()) {
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

    /**
     * 查询账号是否存在
     * @param uu
     * @return
     */
    @Override
    public User allByPhone(User uu) {
        Connection co = getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        User user = new User();
        try {
            pst = co.prepareStatement("select * from user where user_phone=? ");
            Object[] a = {uu.getUserPhone()};
            pst.setObject(1, a[0]);
            rs = pst.executeQuery();
            while (rs.next()) {
                user.setUserPhone(rs.getString("user_phone"));
            }
            return user;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeALL(co, pst, rs);
        }
        return null;
    }

    /**
     * 注册账号密码
     * @param user
     * @return
     */
    public int insertUser(User user){
        Connection connection=getConnection();
        PreparedStatement ps=null;
        String sql="insert into user (user_id,user_phone,user_pwd) values (0,?,?)";
        Object[]objects={user.getUserPhone(),user.getUserPwd()};
        int count=executeUpdate(sql,objects);
        return count;
    }
}
