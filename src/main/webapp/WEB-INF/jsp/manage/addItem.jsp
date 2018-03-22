<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<div class="col-md-offset-2 col-md-10">
	<form role="form" class="form-horizontal"
		action="/manage/addItemCommit" method="post"
		enctype="multipart/form-data">
		<div class="form-group"><h2 class="col-md-offset-2 col-md-2">添加菜品</h2></div>
		<div class="form-group">
			<label for="name" class="col-md-2 control-label">菜品名称</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入菜品名称" maxlength="20" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="discount" class="col-md-2 control-label">折扣</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="discount"
					name="discount" placeholder="折扣(1-9)折，0为不打折" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="price" class="col-md-2 control-label">价格</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="price" name="price"
					placeholder="请输入价格" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="vipprice" class="col-md-2 control-label">会员价</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="vipprice"
					name="vipprice" placeholder="请输入会员价" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="cost" class="col-md-2 control-label">成本</label>
			<div class="col-md-4">
				<input type="text" class="form-control" id="cost" name="cost"
					placeholder="请输入成本" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="item-type" class="col-md-2 control-label">菜品种类</label>
			<div class="col-md-4">
				<select class="form-control" name="itemTypeId">
					<option>---请选择菜品种类---</option>
					<c:forEach items="${itemTypes}" var="itemType">
						<option value="${itemType.id }">${itemType.name }</option>
					</c:forEach>
				</select>
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-4 col-md-offset-2">
				<a class="btn btn-primary btn-block" onclick="add_material_line()">点我添加原料</a>
			</div>
		</div>
		<div id="material-line"></div>
		<input type="hidden" name="sale" value="0" />
		<div class="form-group">
			<div class="col-md-offset-2">
				<label for="inputfile">上传图片</label> <input type="file"
					id="inputfile" name="inputfile">
			</div>
		</div>
		<div class="form-group">
			<div class="col-md-offset-2">
				<button type="submit" class="btn btn-success">提交</button>
			</div>
		</div>
	</form>

</div>
<%@ include file="footer.jsp"%>