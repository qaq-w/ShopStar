package Servlet;

import Service.impl.UserServiceImpl;
import pojo.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TestServlet",urlPatterns = {"/Test"})
public class TestServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        UserServiceImpl user = new UserServiceImpl();
        String phone = request.getParameter("phone");
        String pwd = request.getParameter("pwd");
        String[] annius = request.getParameterValues("anniu");
        User u = user.u(phone,pwd);
        if(u.getUserPhone()!=null){
            request.getRequestDispatcher("twoHome.jsp").forward(request,response);
            HttpSession session = request.getSession();
            session.setAttribute("phone",phone);
            session.setAttribute("pwd",pwd);
            session.setAttribute("anniu",annius[0]);
        }else{
           out.print("<script>alert('您信息输入有误请核实后输入!');window.location.href='login.jsp'</script>");
        }
        out.flush();
        out.close();
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }
}
