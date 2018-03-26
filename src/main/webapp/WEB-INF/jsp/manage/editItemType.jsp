<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>
<div class="col-md-10">
	<form role="form" action="/manage/editItemTypeCommit" method="post">
		<input type="hidden" value="${itemType.id}" name="id" />
		<div class="form-group">
			<label for="name">修改名称</label> <input type="text"
				class="form-control" id="name" name="name" placeholder="请输入菜品种类名称"
				value="${itemType.name}" maxlength="20" required="required">
		</div>
		<button type="submit" class="btn btn-success">提交</button>
	</form>
</div>
<%@ include file="footer.jsp"%>