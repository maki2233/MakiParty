<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/loginCss.css"/>
<script type="text/javascript" src="js/loginJs.js"></script>
</head>
<body>
	<div class="d1">
	<form id="f1" method="post" action="login">
		<table class="t1">
			<tr>
				<td><p>账　号　</p></td><td><input type="text"  name="userId"  class="f"  placeholder="请输入邮箱号/或者手机号"/></td><td class="td1" id="td1"><img src="img/sign_remove.png" /><p3>请输入邮箱号/或者手机号</p3></td>
			</tr>
			<tr>
				<td><p>密　码　</p></td><td><input type="text"  name="userPass"	class="f" placeholder="请输入密码"/></td><td class="td2" id="td2"><img src="img/sign_remove.png" /><p3>密码不能为空/或特非法符</p3></td>
			</tr>
			<tr>
				<td><p>验证码　</p></td><td><input type="text"   name="code"	class="f" placeholder="请输入验证码"/></td><td class="td3" id="td3"><img src="img/sign_remove.png" /><p3>验证码不能为空/或不正确</p3></td><td><div class="code"></div></td>
			</tr>
		</table>
		</form>
		<div class="d2">
			<div class="login" onMouseOver="lo(this)"    onmouseout="lo1(this)" onClick="login()"><p2>登录</p2></div>
			<div class="register" onMouseOver="re(this)"  onMouseOut="re1(this)" ><p33>注册</p33></div>
		</div>
	</div>
	
</body>
</html>