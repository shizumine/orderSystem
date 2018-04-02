/**
 * 
 */
$(function() {
	$('#btn-login').on('click', function() {
		var username = $('#username').val();
		var password = $('#password').val();
		$.ajax({
			type : "POST",
			url : '/admin/loginCommit',
			data : {
				username:username,
				password:password
			},
			success : function(data) {
				if(data==-1){
					layer.msg("您的账号或者密码为空");
					return ;
				}
				if(data==-2){
					layer.msg("请输入正确的账号或密码");
					return ;
				}	
				
				layer.msg("登录成功!");
				window.location.href="/manage/index";
			},
			error : function(request) {
				layer.msg("服务器正忙，请稍后再试！");
			}
		});
	});
});
