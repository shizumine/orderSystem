<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<form role="form" action="/manage/addItemTypeCommit" method="post">
	<div class="form-group">
		<label for="name">菜品种类名称</label> <input type="text"
			class="form-control" id="name" name="name" placeholder="请输入菜品种类名称"
			maxlength="20" required="required">
	</div>
	<button type="submit" class="btn btn-success">提交</button>
</form>

<%@ include file="footer.jsp"%>