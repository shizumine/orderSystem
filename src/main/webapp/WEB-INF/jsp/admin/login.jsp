<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="/plugins/bootstrap/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="/plugins/jquery-weui/css/jquery-weui.min.css" />
<link rel="stylesheet" type="text/css"
	href="/plugins/layer/theme/default/layer.css" />
<link rel="stylesheet" type="text/css" href="/css/login.css" />
<title>登录页面</title>
</head>
<body>
	<div id="header">
		<div class="container">
			<div class="row">
				<div class="col-md-4" id="login-logo">
					<i class="glyphicon glyphicon-cutlery"></i> <span>彭彭订餐后台系统</span>
				</div>
			</div>
		</div>
	</div>

	<div id="bg">
		<div class="container">
			<div class="row">
				<div class="col-md-offset-8 col-md-4" id="manage-login">
					<form id="login-form" role="form" class="form-horizontal" method="post">
						<div class="form-group form-header">
							<h3>后台管理系统</h3>
						</div>
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span> <input type="text"
									class="form-control" placeholder="用户名" name="username" id="username" required="required">
							</div>
						</div>
						<div class="form-group">
							<div class="input-group">
								<span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span> <input type="password"
									class="form-control" placeholder="密码" name="password" id="password" required="required">
							</div>
						</div>
						<div class="form-group">
							<a href="/manage/register" style="padding-left:36px;font-size:0.6rem;">没有账号？点击这里注册</a>
						</div>
						<div class="form-group">
							<div class="col-sm-offset-9"><input type="button" class="btn btn-primary" id="btn-login" value="登录"></div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="/plugins/jquery/jquery-3.2.1.min.js"></script>
	<script type="text/javascript"
		src="/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="/plugins/layer/layer.js"></script>
	<script type="text/javascript" src="/js/shizumine.js"></script>
	<script type="text/javascript" src="/js/login.js"></script>
</body>
</html>