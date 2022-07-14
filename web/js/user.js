function validateName(){
    var name = document.getElementById("phone").value;
    var msg=document.getElementById("nameMsg");
     if(name.length!=11){
        msg.innerHTML="您账号输入有误";
        msg.style.color="#C0C0C0";
        return false;
    }
    msg.innerHTML="您账号输入正确";
    msg.style.color="green";
    return true;
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