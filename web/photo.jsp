<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/13
  Time: 12:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
    <body>
    <script type="text/javascript" src="statics/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">

        $(function(){
            $("input[name=uname]").blur(function(){
                $.ajax({
                    "url" : "ShopServlet",
                    "type" : "get",
                    "data" : "uname=" + $(this).val(),
                    "dataType" : "text",
                    "success" : function(result){
                        $("#aaa").attr().text(result);
                    },
                    "error":function () {
                    }
                });
            });
        });
    </script>
    <span></span>
    </body>
</html>
