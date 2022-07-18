<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="Static/css/home.css"/>
    <script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
    <script src="js/Home.js" type="text/javascript"></script>
</head>
<body>
<div id="nav_html">
<div id="nav_header">
    <p id="font_size">选购促销系列</p>
</div>
<div id="nav_body">
    <img src="Static/img/home/QWE.png" id="nav_img" >
    <ul>
        <li class="ali"><a href="" class="nav_li">女士</a></li>
        <li class="ali"><a href="" class="nav_li">男士</a></li>
        <li class="ali"><a href="" class="nav_li">家具装饰</a></li>
        <li class="ali"><a href="" class="nav_li">儿童</a></li>
        <li class="ali"><a href="" class="nav_li">JEANS COUTURE</a></li>
        <li class="ali"><a href="" class="nav_li">精选折扣</a></li>
        <li class="ali"><a href="" class="nav_li">幕后精彩</a></li>
    </ul>
    <img src="Static\img\home\1.png" id="nav_img1">
    <a href="heart.jsp"><img src="Static\img\home\2.png" id="nav_img2"></a>
    <a href="login.jsp"><img src="Static\img\home\3.png" id="nav_img3"></a>
    <img src="Static\img\home\4.png" id="nav_img4">
</div>
</div>
<video  autoplay loop muted id="nav_mp4" >
    <source src="Static\img\home\la-vacanza-2022-video-01062022-desk-final.mp4">
</video>
<c:forEach items="${sessionScope.poto}" var="i">
    <img src="${i.shopImg}" alt="加载失败" class="img" id="${i.shopId}"/>
</c:forEach>
</body>
