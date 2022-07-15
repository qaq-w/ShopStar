package servlet;

import pojo.User;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WeiServlet1",urlPatterns = {"/WeiServlet1"})
public class WeiServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html:charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("user_phone");
        User user=new User();
        user.setUserPhone(name);
        UserServiceImpl userServer = new UserServiceImpl();
        Boolean aBoolean = userServer.SelectUser(user);
            if(aBoolean==true){
                out.println("您的手机号码可以使用");
            }else{
                out.println("您的手机号码已被注册");
            }
        out.flush();
        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
