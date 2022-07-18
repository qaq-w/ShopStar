<%--
  Created by IntelliJ IDEA.
  User: 001
  Date: 2022/7/15
  Time: 17:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="Static/css/heart.css"/>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>s
    <script type="text/javascript" src="js/heart.js"></script>
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
    <img src="Static\img\home\heart.png" id="heart"><span class="heart_order"><b>心愿单</b></span>
    <div class="a_heart">
        <span class="b_heart">你的愿望清单是空的。 单击所需产品上的心形图标，将其添加到您的愿望清单中。</span>
        <form action="index.jsp" method="post">
            <input type="submit" id="c_heart" value="继续浏览" />
        </form>
    </div>
    <span class="d_heart" >您可能会喜欢</span><br/>
    <span class="e_heart">---------</span><br/>
    <ul class="aul">
        <li class="ali"><img src="Static\img\projectPhoto\Men\Men13.jpg" width="420px" height="500px">
            <br/>
            <span><a href="" class="aa">刺绣Logo卫衣</a>
                <br/>CN¥ 9,800.00
            </span>
        </li>
        <li class="ali"><img src="Static\img\projectPhoto\Men\Men26.jpg" width="420px" height="500px">
            <br/>
            <span><a href="" class="aa">SILVER BAROQUE格纹羊毛大衣</a>
            <br/>CN¥ 88,800.00
            </span>
        </li>
        <li class="ali"><img src="Static\img\projectPhoto\Ms\Ms17.jpg" width="420px" height="500px">
            <br/>
            <span><a href="" class="aa">LA MEDUSA斜挎包</a>
            <br/>CN¥ 7,800.00
            </span>
        </li>
        <li class="ali"><img src="Static\img\projectPhoto\Ms\Ms42.jpg" width="420px" height="500px">
            <br/>
            <span><a href="" class="aa">SILVER BAROQUE连衣裙</a>
            <br/>CN¥ 10,800.00
            </span>
        </li>
    </ul>
</body>
</html>
