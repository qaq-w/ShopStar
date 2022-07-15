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

@WebServlet(name = "TestServlet1" ,urlPatterns = {"/Test1"})
public class TestServlet1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        UserServiceImpl user = new UserServiceImpl();
        String phone = request.getParameter("phone");
        User u = user.uu(phone);
        if(phone.equals(u.getUserPhone())){
            out.println("");
        }else{
            out.println("您账号输入有误!!");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
