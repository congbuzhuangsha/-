package com.yxj.servlet;

import com.yxj.pojo.Address;
import com.yxj.pojo.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
                User user = new User(1,"柳岩","拍电影",new Address("河南","商丘","虞城县"));
                req.setAttribute("user", user);
                //集合类型
                    //list集合
                        //存储普通字符
                        List<String> list = new ArrayList<>();
                        list.add("a");
                        list.add("b");
                        list.add("c");
                        //储存对象
                        User user1 = new User(2,"娜扎","拍电影",new Address("新疆","乌鲁木齐","乌鲁木齐"));
                         List<User> list1 = new ArrayList<>();
                         list1.add(user1);
                         req.setAttribute("list", list);
                         req.setAttribute("list1", list1);

                    //map集合
                        //存储普通对象
                         Map<String, String> map = new HashMap<>();
                         map.put("a", "北京");
                         map.put("b","上海");
                         req.setAttribute("map",map);
                         //存储对象
                        Map<String, User> map1 = new HashMap<>();
                        map1.put("a1", new User(3,"蒂娜","拍电影",new Address("新疆","乌鲁木齐","吐鲁番")));
                        req.setAttribute("map1",map1);

        //直接相应
        //请求转发
        req.getRequestDispatcher("/el.jsp").forward(req, resp);
        return;
        //重定向
    }
}
