<%--
  Created by IntelliJ IDEA.
  User: yangxiaojie
  Date: 2020/2/21
  Time: 22:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ page import="com.yxj.pojo.User" %>
<%--使用传统方式获取作用域对象的数据--%>
<h3>EL表达式学习：传统方式学习</h3>
<b><%=request.getParameter("uname")%></b>
<b><%=request.getAttribute("str")%></b>
<b><%=((User)request.getAttribute("user")).getAddress().getTown()%></b>
<b><%=((ArrayList)request.getAttribute("list")).get(2)%></b>
<b><%=((User)((ArrayList)request.getAttribute("list1")).get(0)).getAddress().getPre()%></b>
<b><%=(((ArrayList<User>)request.getAttribute("list1")).get(0)).getAddress().getPre()%></b>
<b><%=((Map<String,String>)request.getAttribute("map")).get("b")%></b>
<b><%=((Map<String,User>)request.getAttribute("map1")).get("a1").getAddress().getCity()%></b>
<%--
传统方式获取作用域数据：
    缺点一：导入包
    缺点二：需要强转
    缺点三：获取数据的代码过于麻烦
使用El表达式获取作用域数据：
--%>
<%--使用传El表达式获取作用域对象的数据--%>
<b>${param.uname}</b>
<b>${str}</b>
<b>${user.address.town}</b>
<b>${list[2]}</b>
<b>${list1[0].address.pre}</b>
<b>${map.c}</b>
<b>${map.c}</b>
<b>${map1.a1.address.city}</b>