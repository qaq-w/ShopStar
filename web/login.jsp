<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/13
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="Static/css/home.css"/>
</head>
<body>
<div id="nav_header">
    <p id="font_size">选购促销系列</p>
</div>
<div id="nav_body">
    <img src="Static\img\home\QWE.png" id="nav_img" >
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
    <img src="Static\img\home\2.png" id="nav_img2">
    <a href="login.jsp"><img src="Static\img\home\3.png" id="nav_img3"></a>
    <img src="Static\img\home\4.png" id="nav_img4">
</div>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/user.js"></script>
    <div class="color">
    <form action="Test" method="post">
        <h3 style="text-align:center">登录</h3>
        <div class="bian">
            <h5 class="guke">老顾客</h5>
            <div class="denglu">
                <span class="phone">手机号码<sup>*</sup></span>
                <br/>
                <input type="tel" name="phone" placeholder="请输入手机号" id="phone" required="required" onblur="validateName()" ><br/>
                <span id="nameMsg"></span>
                <br/>
                <span class="pwd">密码<sup>*</sup></span>
                <br/>
                <input type="password" name="pwd" placeholder="请输入密码" id="pwd" required="required" onblur="validatePwd()"><br/>
                <span id="pwdMsg"></span>
                <br/>
                <input type="checkbox" class="anniu" name="anniu"><span class="anniu1">下一次记住我</span>
            </div>
            <input type="submit" value="登录" id="d">
        </div>
    </form>
<div class="bian1">
    <h5 class="guke1">创建账户</h5>
    <span class="ziti">注册 Versace 在线商城，悦享多重账户权益：</span>
    <ul class="ziti1">
        <li>最新动态和独家特惠</li>
        <li>订单历史和地址簿</li>
        <li>将商品保存至心愿单</li>
    </ul>
    <input type="submit" value="创建账户" id="dd">
</div>
    </div>
</body>
</html>

