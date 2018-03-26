<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<div class="col-md-10">
	<form role="form" class="form-horizontal" action="/manage/addItemMaterialCommit" method="post">
		<div class="form-group">
			<label for="name" class="col-md-3 control-label">原料名称</label>
			<div class="col-md-9">
				<input type="text" class="form-control" id="name" name="name"
					placeholder="请输入原料名称" maxlength="20" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="stock" class="col-md-3 control-label">库存</label>
			<div class="col-md-9">
				<input type="text" class="form-control" id="stock"
					name="stock" placeholder="请输入库存量" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="unit" class="col-md-3 control-label">单位</label>
			<div class="col-md-9">
				<input type="text" class="form-control" id="unit" name="unit"
					placeholder="请输入单位" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="price" class="col-md-3 control-label">单价</label>
			<div class="col-md-9">
				<input type="text" class="form-control" id="price"
					name="price" placeholder="请输入单价" required="required">
			</div>
		</div>
		<button type="submit" class="btn btn-success">提交</button>
	</form>
</div>
<%@ include file="footer.jsp"%>