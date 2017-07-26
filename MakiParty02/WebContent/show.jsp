<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/show.css"/>
<script type="text/javascript" src="js/show.js"></script>
</head>
<body onload="load()">
	<div class="title">
		<div class="time">
			
		</div>
		<div class="user">
			<img  src="img/contact.png">
			<p id="userP1"><s:property value="userModel.userName"/></p>
		</div>
	</div>
	<div class="body">
		<div class="ft">
			<div class="ss">
				<div style="height:40px;width:70px;border-left: 3px solid #888888;position: relative; left:230px;">
					<img style="position: relative; left:12px;top:4px;" src="img/magnifier.png">
				</div>
			</div>
			<div class="gongneng">
				<img  src="img/star.png">　
				<img src="img/music.png">　
				<img src="img/add.png">　
			</div>
		</div>
		<s:iterator value="list2" var="user">
		
			<div class="posts">
				<p id="postsId" style="display: none;"><s:property  value="#user.id"/></p>
				<div class="formUser">
					<img  id="fromUserTx"src="img/contact.png">
					<p id="formUserName"><s:property value="#user.userName"/></p>
					<p id="formUserJs"><s:property value="#user.email"/></p>
				</div>
				<div class="postsTitle">
					<h1 id="postsTitle"><s:property value="#user.postsTitle"/></h1>
				</div>
				
				<div class="postsValue">
					<span id="postsValue"><s:property value="#user.postsValue"/>...</span>
					<div class="zk" >
						展开全文
						<img src="img/zk.png" style="position: relative;top:2px;">
					</div>
					<span id="postsValue2">
						<s:property value="#user.postsValue"/>
					</span>
				</div>
				<div class="postsFooter">
					<div class="dz">
						<div class="ding">
							<div class="shang">
							
							</div>
							<p id="ds" style="position: absolute;top:-5px;left:30px;font-size:12px;color:#999999;">123</p>
						</div>
						<div class="cai">
							<div class="xia"></div>
						</div>
					</div>
					<div class="pj">
						<img src="img/pj.png">
						<p id="hfs" style="position: absolute;top:-13px;left:30px;font-size:12px;color:#999999;">123 个回复</p>
					</div>
				</div>
			</div>
			<div style="height:30px;"></div>
		</s:iterator>
		</div>

</body>
</html>