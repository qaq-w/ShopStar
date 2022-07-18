$(function (){
    var colors="";
    var fonts="";
    $("#c_heart").mouseover(function () {
        colors = $(this).css("background-color");
        fonts = $(this).css("color");
        $(this).css("background-color","black");
        $(this).css("color","white")
    }).mouseout(function() {
        $(this).css("background-color","white");
        $(this).css("color","black")
    });
});
$(function (){
    var colors="";
    $(".aa").mouseover(function () {
        colors = $(this).css("color");
        $(this).css("color","#4F4F4F");
    }).mouseout(function() {
        $(this).css("color","black");

    });
});