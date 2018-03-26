<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="header.jsp"%>

<div class="col-md-10">
	<table class="table table-striped">
		<caption>菜品信息</caption>
		<thead>
			<tr>
				<th>菜品编号</th>
				<th>名称</th>
				<th>折扣</th>
				<th>价格</th>
				<th>会员价</th>
				<th>成本</th>
				<th>销售量</th>
				<th>菜品种类</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${items }" var="item">
				<tr>
					<td>${item.id }</td>
					<td>${item.name }</td>
					<td>${item.discount }</td>
					<td>${item.price }</td>
					<td>${item.vipprice }</td>
					<td>${item.cost }</td>
					<td>${item.sale }</td>
					<td>${item.typeName}</td>
					<td>
						<a href="/manage/editItem/${item.id}" class="btn btn-success">修改</a>
						<button class="btn btn-danger" onclick="show_confirm('/manage/deleteItem/${item.id}')">删除</button>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="footer.jsp"%>