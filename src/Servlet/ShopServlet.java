package Servlet;

import Service.ShopService;
import Service.impl.ShopServiceImpl;
import pojo.Shop;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ShopServlet",urlPatterns ={"/ShopServlet"} )
public class ShopServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("ShopServlet/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        ShopServiceImpl shopService = new ShopServiceImpl();
        List<Shop> select = shopService.select();
        PrintWriter out =response.getWriter();
        out.println(select.get(0).getShopImg());
        HttpSession session =request.getSession();
        session.setAttribute("poto",select);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
