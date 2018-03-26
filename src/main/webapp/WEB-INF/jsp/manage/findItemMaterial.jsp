<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>

<div class="col-md-10">
	<div class="pull-right">
		<button class="btn btn-success" data-toggle="modal"
			data-target="#addOne">
			<span class="glyphicon glyphicon-plus"></span> 新添加一行
		</button>
	</div>
	<table class="table table-striped">
		<caption>原料列表</caption>
		<thead>
			<tr>
				<th>原料编号</th>
				<th>名称</th>
				<th>库存</th>
				<th>单位</th>
				<th>单价（元）</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${itemMaterials}" var="itemMaterial">
				<tr>
					<td>${itemMaterial.id}</td>
					<td>${itemMaterial.name }</td>
					<td>${itemMaterial.stock }</td>
					<td>${itemMaterial.unit }</td>
					<td>${itemMaterial.price }</td>
					<td><a href="/manage/editItemMaterial/${itemMaterial.id}"
						class="btn btn-success">修改</a>
						<button class="btn btn-danger"
							onclick="show_confirm('/manage/deleteItemMaterial/${itemMaterial.id}')">删除</button></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<div class="modal fade" id="addOne" tabindex="-1" role="dialog"
	aria-labelledby="body" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-body">
				<form role="form" class="form-horizontal"
					action="/manage/addItemMaterialCommit" method="post">
					<div class="form-group">
						<div class="text-center">
							<h3>添加原料</h3>
						</div>
					</div>
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
							<input type="text" class="form-control" id="stock" name="stock"
								placeholder="请输入库存量" required="required">
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
							<input type="text" class="form-control" id="price" name="price"
								placeholder="请输入单价" required="required">
						</div>
					</div>
					<div class="form-group">
						<div class="col-md-offset-8 col-md-4">
							<button type="submit" class="btn btn-success">提交</button>
							<button class="btn btn-danger" data-dismiss="modal">取消</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</div>
<%@ include file="footer.jsp"%>