package Dao;

import java.sql.*;

public class BaseDao {
       private String Driver="com.mysql.jdbc.Driver";
       private String url="jdbc:mysql://localhost:3306/abdc";
       private String ursename="root";
       private String pwd="root";
       Connection connection=null;//数据库连接对象
       public Connection getConnection(){
              try {
                     Class.forName(Driver);
                     connection= DriverManager.getConnection(url,ursename,pwd);
              } catch (ClassNotFoundException e) {
                     e.printStackTrace();
              } catch (SQLException e) {
                     e.printStackTrace();
              }
              return connection;
       }
       public void closeALL(Connection connection,PreparedStatement sta,ResultSet re){
              if (re!=null) {
                     try {
                            re.close();
                            if (sta!=null)
                                   sta.close();
                            if (connection!=null)
                                   connection.close();
                     } catch (SQLException e) {
                            e.printStackTrace();
                     }
              }
       }
       //增删改
       public int executeUpdate(String preparedsql,Object[]a){
              PreparedStatement sta =null;
              int count=0;
              connection=getConnection();//
              try{
                     sta=connection.prepareStatement(preparedsql);
                     if (a!=null){
                            for (int i =0;i<a.length;i++)
                                   sta.setObject(i+1,a[i]);
                     }
                     count=sta.executeUpdate();
              } catch (SQLException e) {
                     e.printStackTrace();
              }
              finally{
                     closeALL(connection,sta,null);
              }
              return count;
       }
}
