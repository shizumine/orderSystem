<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>

<div class="col-md-offset-2 col-md-10">
	<div class="pull-right">
		<button class="btn btn-success" data-toggle="modal"
			data-target="#addOne">
			<span class="glyphicon glyphicon-plus"></span> 新添加一行
		</button>
	</div>
	<table class="table table-striped">
		<caption>菜品种类列表</caption>
		<thead>
			<tr>
				<th>菜品种类编号</th>
				<th>名称</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${itemTypes}" var="itemType">
				<tr>
					<td>${itemType.id}</td>
					<td>${itemType.name }</td>
					<td><a href="/manage/editItemType/${itemType.id}"
						class="btn btn-success">修改</a>
						<button class="btn btn-danger"
							onclick="show_confirm('/manage/deleteItemType/${itemType.id}')">删除</button></td>
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
					action="/manage/addItemTypeCommit" method="post">
					<div class="form-group">
						<label for="name" class="col-md-3 control-label">菜品种类名称</label>
						<div class="col-md-9">
							<input type="text" class="form-control" id="name" name="name"
								placeholder="请输入菜品种类名称" maxlength="20" required="required">
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