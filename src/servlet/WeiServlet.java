package Servlet;

import pojo.User;
import Service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "WeiServlet",urlPatterns ={"/WeiServlet"})
public class WeiServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html:charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("user_phone");
        String pwd=request.getParameter("user_pwd");
        User user=new User();
        user.setUserPhone(name);
        user.setUserPwd(pwd);
        UserServiceImpl userServer = new UserServiceImpl();
        Boolean aBoolean = userServer.InsertUser(user);
        if(aBoolean==true){
           response.sendRedirect("login.jsp");
        }else if(aBoolean==false){
            out.print("您信息输入有误请核实后输入!");
        }
        out.flush();
        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
