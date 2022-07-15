function validatePwd(){
    var name = document.getElementById("pwd").value;
    var msg=document.getElementById("pwdMsg");
    if(name.length>=8 && name.length<=16 ){
        msg.innerHTML="";
        msg.style.color="red";
        return true;
    }
    msg.innerHTML="请输入正确密码！！";
    msg.style.color="red";
    return false;
}
$(function () {
    $("input[name=phone]").blur(function () {
        $.ajax({
            "url":"Test1",
            "type":"post",
            "data":"phone="+$(this).val(),
            "dataType":"text",
            "success":function (result) {
                $("input[name=phone]").next().text(result);
            },
            "error":function () {
                null;
            }
        });
    });
});
$(function (){
    var colors="";
    $("#d").mouseover(function () {
        colors = $(this).css("background-color");
        $(this).css("background-color","#363636");
    }).mouseout(function() {
        $(this).css("background-color","black");
    });
});