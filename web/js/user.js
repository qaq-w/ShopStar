function validateName(){
    var name = document.getElementById("phone").value;
    var msg=document.getElementById("nameMsg");
     if(name.length!=11){
        msg.innerHTML="请输入正确手机号！！";
        msg.style.color="#C0C0C0";
        return false;
    }
    msg.innerHTML="您的账号可以使用";
    msg.style.color="green";
    return true;
}
