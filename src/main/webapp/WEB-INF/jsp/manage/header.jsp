<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>彭彭网上餐馆</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width; initial-scale=1.0">
<link rel="stylesheet" type="text/css"
	href="/plugins/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/plugins/jquery-weui/css/jquery-weui.min.css" />
</head>
<body>

	<div class="col-md-2">
		<button type="button" class="btn btn-primary btn-block"
			data-toggle="collapse" data-target="#menu-manage">菜品管理</button>
		<div id="menu-manage" class="collapse in">
			<ul class="nav nav-pills nav-stacked">
				<li><a href="/manage/findAllItemType">查询菜品种类(提供修改)</a></li>
				<li><a href="/manage/addItem">添加菜品</a></li>
				<li><a href="/manage/findItem">查询菜品(提供修改)</a></li>
				<li><a href="/manage/findAllItemMaterial">查询原料</a></li>
			</ul>
		</div>
	</div>