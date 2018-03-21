/**
 * 
 */
$(function() {
	$(".swiper-container").swiper({
		loop : true,
		autoplay : 3000
	});

});

function add_material_line() {
	$.ajax({
		url : '/manage/getItemMaterials',
		dataType : "json",
		type:"POST",
		success : function(data) {
			var option = "";
			for (var i = 0; i < data.length; i++) {
				var str = "<option value='" + data[i].id
						+ "'>" + data[i].name
						+ "</option>";
				option = option + str;
			}
			var html = "<div class='form-group'>"
					+ "<label class='col-md-2 control-label'>菜品原料及数量</label>"
					+ "<div class='col-md-2'>"
					+ "<select name='materialId' class='form-control'>"
					+ "<option>---请选择原料---</option>"
					+ option
					+ "</select>"
					+ "</div>"
					+ "<div class='col-md-2'>"
					+ "<input type='text' name='materialNum'"
					+ "class='form-control pull-left' style='width: 50%;'>"
					+ "</div>" + "</div>";
			$("#material-line").append(html);
		},
		error : function() {
			
		}
	});
}