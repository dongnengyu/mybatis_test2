/* Credit: http://www.templatemo.com */
    
$(document).ready( function() {        

	// sidebar menu click
	$('.templatemo-sidebar-menu li.sub a').click(function(){
		if($(this).parent().hasClass('open')) {
			$(this).parent().removeClass('open');
		} else {
			$(this).parent().addClass('open');
		}
	});  // sidebar menu click
    $.ajax({
        //提交方式
        type: "get",
        //提交的Action
        url: 'http://127.0.0.1:8080/selectAllUser',
        //返回数据类型
        dataType: "json",
        data:{
            userInfo:null
        },
        success:function (data) {
            var example1 = new Vue({
                el: '#user-table',
                data: {
                    userInfo:data
                }
            })
        }
        });
}); // document.ready
