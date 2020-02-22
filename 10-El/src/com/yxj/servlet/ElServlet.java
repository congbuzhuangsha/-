package com.yxj.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: yangxiaojie
 * @Date: 2020/2/21
 * @version: 1.0
 */

@WebServlet(name = "es",urlPatterns = "/es")
public class ElServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        String uname=req.getParameter("uname");
        String pwd=req.getParameter("pwd");
        //处理请求信息
        System.out.println(uname+":"+pwd);
        //响应处理结果
            //使用request作用域进行数据流转
                //字符串
                req.setAttribute("str", "今天天气真好！");
                //对象类型

            //直接相应
            //请求转发
            req.getRequestDispatcher("/el.jsp").forward(req, resp);
            return;
            //重定向
    }
}
