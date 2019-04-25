package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet路径配置
 */
//@WebServlet({"/d4","/dd4","/ddd4"})
//@WebServlet("/user/demo4")
//@WebServlet("/user/*")
//@WebServlet("/*")
    /*
        服务程序：
            用户模块：
                add;
                    /user/add
                    UserAddServlet
                delete;
                    /user/delete
                     UserDeleteServlet
                update:
                get:

            订单：
                add;
                    /order/add
                    OrderAddServlet
                delete;
                    /order/delete
                    OrderDeleteServlet
                update:
                get:


     */

@WebServlet("*.do")
public class ServletDemo4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo4...");
        System.out.println(req);
    }
}
