$(document).ready(function(){

    $("#request-link").click(function(e){
        e.preventDefault();
        $.post(ctx + "/servlet01/project/request/", $("form").serialize(), function(data){
            alert(data);
        });
        return false;
    });
});