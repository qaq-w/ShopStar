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
            if(name!=null){
                String regex = "^1([358][0-9]|4[579]|66|7[0135678]|9[89])[0-9]{8}$";
                if(name.matches(regex)){
                    out.println("success");
                }else{
                    out.println("您输入手机号格式错误!!");
                }
            }
        out.flush();
        out.close();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
