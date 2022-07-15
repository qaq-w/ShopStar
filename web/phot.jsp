<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/14
  Time: 16:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" ></script>
</head>
    <body>
    <c:forEach items="${sessionScope.poto}" var="i">
    <img src="${i.shopImg}" alt="加载失败"/>
    </c:forEach>
    </body>
</html>
