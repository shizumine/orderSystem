<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>

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
				<td><a href="/manage/editItemType/${itemType.id}" class="btn btn-success">修改</a>
				<button class="btn btn-danger" onclick="show_confirm('/manage/deleteItemType/${itemType.id}')">删除</button></td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@ include file="footer.jsp"%>