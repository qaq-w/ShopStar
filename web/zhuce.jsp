<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/15
  Time: 11:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
    <script type="text/javascript" src="js/Wei.js"></script>
    <meta charset="utf-8">
    <title></title>
    <link href="Static/css/zhuce.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id="nav_header">
    <p id="font_size">选购促销系列</p>
</div>
<div id="nav_body">
    <img src="Static\img\home\QWE.png" id="nav_img" >
    <ul>
        <li><a href="" class="nav_li">女士</a></li>
        <li><a href="" class="nav_li">男士</a></li>
        <li><a href="" class="nav_li">家具装饰</a></li>
        <li><a href="" class="nav_li">儿童</a></li>
        <li><a href="" class="nav_li">JEANS COUTURE</a></li>
        <li><a href="" class="nav_li">精选折扣</a></li>
        <li><a href="" class="nav_li">幕后精彩</a></li>
    </ul>
    <a href="assd.html"><img src="Static\img\home\1.png" id="nav_img1"></a>
    <img src="Static\img\home\2.png" id="nav_img2">
    <img src="Static\img\home\3.png" id="nav_img3">
    <img src="Static\img\home\4.png" id="nav_img4">
</div >
<div class="ni">
    <div class="a">
        <h3 class="zhuce">注册</h3>
        <span class="b">*</span>表示必填字段<br>
        <span id="zifu6">称谓<span class="b">*</span></span>
        <form>
            <select class="chengwei">
                <option>请选择</option>
                <option>先生</option>
                <option>女士</option>
                <option>夫人</option>
            </select>
        </form>
        <form action="WeiServlet" method="post">
            <span id="zifu">姓氏<span class="b">*</span></span></br>
            <input type="text" placeholder="请输入你的姓氏" class="xing"><br>
            <span id="zifu1">名字<span class="b">*</span></span><br>
            <input type="text" placeholder="请输入你的名字" class="xing"/><br>
            <span id="zifu2">出生日期<span class="b">*</span></span><br><input type="date" value="2022/11/11" class="chengwei"><br>
            <span id="zifu3">请输入有效的手机号码<span class="b">*</span></span><br>
            <input type="text" placeholder="请输入长度为11位的手机号" name="user_phone" class="xing" required="required"><span id="nameAsg" ></span><br>
            <span id="zifu4">密码<span class="b">*</span></span><br>
            <input type="password" placeholder="请输入8~16位的新密码" name="user_pwd" class="xing" required="required" id="pwd"><span></span><br>
            <span id="zifu5">请再次输入密码<span class="b">*</span></span><br>
            <input type="password" placeholder="请再次输入您的新密码" name="user_pwd1" class="xing" required="required" onblur="f()" id="pwd1"><span id="qwer"></span><br>
            <span class="wo"><input type="checkbox" checked="checked">我同意根据<a href="https://www.versace.cn/zh-cn/legal/privacy-policy.html" class="yinsi">Versace隐私政策</a>进行Versace相关商业推广活动.</span><br>
            <br>
            <span class="wo1">继续操作即表示您确认阅读并理解<a href="https://www.versace.cn/zh-cn/legal/privacy-policy.html" class="yinsi">Versace隐私政策</a></span><br>
            <input type="submit" value="注册" id="tijiao">
        </form>
    </div>
</div>
<img src="Static\img\home\0809.png" class="jsp"/>
</body>
</html>

