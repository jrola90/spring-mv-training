$(document).ready(function(){

    $("#request-link").click(function(e){
        e.preventDefault();

        //$("form").serialize()
        $.post(ctx + "/servlet01/permission/request/", '01-01-2016', function(data){
            alert(data);
        });
        return false;
    });
});