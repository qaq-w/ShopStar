$(function () {
    $("input[name=user_phone]").blur(function () {
        $.ajax({
            "url":"WeiServlet1",
            "type":"post",
            "data":"user_phone="+$(this).val(),
            "dataType":"text",
            "success":function (result) {
                $("input[name=user_phone]").next().text(result);
            },
            "error":function () {
                null;
            }
        });
    });
});
function f() {
    var pwd = document.getElementById("pwd").value;
    var pwd1 = document.getElementById("pwd1").value;
    var abc = document.getElementById("qwer");
    if (pwd==pwd1){
        abc.innerText="密码正确";
        abc.style.color="green";
    } else{
        abc.innerText="密码不正确";
        abc.style.color="red";
    }
}
