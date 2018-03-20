$(function(){

});

//删除确认
function show_confirm(href){
	var r = confirm("确定要删除吗？");
	if(r){
		window.location.href = href;
	}else{
		return;
	}
	
}