<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册或登录</title>
<script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/loginCss.css"/>
<script type="text/javascript" src="js/loginJs.js"></script>
</head>
<body onload="start()">
	<canvas id="canvas"></canvas>
	<div class="d1">
		<div style="height:30px;width:250px;position: relative; left:10%; top:0%;">
			<p7>与世界分享你刚编的故事</p7>
		</div>
		<div style="height:30px;width:250px;position: relative; left:10%; top:0%;">
			<div id="dl1" style="height:30px;width:90px; border-bottom: 3px solid #0381AA;position: relative; left:35px; top:-3px;" onclick="signin(this)">
				<p5 id="dl">登录</p>
			</div>
			<div style="height:30px;width:90px; border-bottom: 3px solid #999999;position: relative; left:125px; top:-36px;" onclick="signup(this)" id="zc1">
				<p6 id="zc">注册</p>
			</div>
		</div>
		<form id="f1" method="post" action="register">
			<table class="t1" id="signup">
				<tr>
					<td><p>账　号　</p></td><td><input id="userId"  type="text"  name="userId"  class="f"  placeholder="请输入邮箱号/手机号"/></td><td class="td1" id="td1"><img src="" /><p3>请输入邮箱号/或者手机号</p3></td>
				</tr>
				<tr>
					<td><p>密　码　</p></td><td><input id="userPass"  type="text"  name="userPass"	class="f" placeholder="请输入密码"/></td><td class="td2" id="td2"><img src="" /><p3>密码不能为空/或特非法符</p3></td>
				</tr>
				<tr>
					<td><p>用户名　</p></td><td><input id="userName"  type="text"   name="userName"	class="f" placeholder="请输入用户名"/></td><td class="td3" id="td3"><img src="" /><p3>验证码不能为空/或不正确</p3></td>
				</tr>
			</table>
		</form>
		
		<form id="f2" method="post" action="login">
			<table class="t1" id="signin">
				<tr>
					<td><p>账　号　</p></td><td><input id="inUserId" type="text"  name="userId"  class="f"  placeholder="请输入邮箱号/手机号"/></td><td class="td1" id="td1"><img src="" /><p3>请输入邮箱号/或者手机号</p3></td>
				</tr>
				<tr>
					<td><p>密　码　</p></td><td><input id="inUserPass" type="text"  name="userPass"	class="f" placeholder="请输入密码"/></td><td class="td2" id="td2"><img src="" /><p3>密码不能为空/或特非法符</p3></td>
				</tr>
				
			</table>
		</form>
		<div class="d2">
			<div class="login" onMouseOver="lo(this)"    onmouseout="lo1(this)" onClick="submit()"><p2 id="an">登录</p2></div>
		</div>
	</div>



	<script>

		//定义画布宽高和生成点的个数
		
		var WIDTH = window.innerWidth-20, HEIGHT = window.innerHeight-20, POINT = 35;
		
		var canvas = document.getElementById('canvas');
		canvas.width = WIDTH,
		canvas.height = HEIGHT;
		var context = canvas.getContext('2d');
		context.strokeStyle = 'rgba(0,0,0,0.02)',
		context.strokeWidth = 1,
		context.fillStyle = 'rgba(0,0,0,0.05)';
		var circleArr = [];

		//线条：开始xy坐标，结束xy坐标，线条透明度
		function Line (x, y, _x, _y, o) {
			this.beginX = x,
			this.beginY = y,
			this.closeX = _x,
			this.closeY = _y,
			this.o = o;
		}
		//点：圆心xy坐标，半径，每帧移动xy的距离
		function Circle (x, y, r, moveX, moveY) {
			this.x = x,
			this.y = y,
			this.r = r,
			this.moveX = moveX,
			this.moveY = moveY;
		}
		//生成max和min之间的随机数
		function num (max, _min) {
			var min = arguments[1] || 0;
			return Math.floor(Math.random()*(max-min+1)+min);
		}
		// 绘制原点
		function drawCricle (cxt, x, y, r, moveX, moveY) {
			var circle = new Circle(x, y, r, moveX, moveY)
			cxt.beginPath()
			cxt.arc(circle.x, circle.y, circle.r, 0, 2*Math.PI)
			cxt.closePath()
			cxt.fill();
			return circle;
		}
		//绘制线条
		function drawLine (cxt, x, y, _x, _y, o) {
			var line = new Line(x, y, _x, _y, o)
			cxt.beginPath()
			cxt.strokeStyle = 'rgba(0,0,0,'+ o +')'
			cxt.moveTo(line.beginX, line.beginY)
			cxt.lineTo(line.closeX, line.closeY)
			cxt.closePath()
			cxt.stroke();

		}
		//初始化生成原点
		function init () {
			circleArr = [];
			for (var i = 0; i < POINT; i++) {
				circleArr.push(drawCricle(context, num(WIDTH), num(HEIGHT), num(15, 2), num(10, -10)/40, num(10, -10)/40));
			}
			draw();
		}

		//每帧绘制
		function draw () {
			context.clearRect(0,0,canvas.width, canvas.height);
			for (var i = 0; i < POINT; i++) {
				drawCricle(context, circleArr[i].x, circleArr[i].y, circleArr[i].r);
			}
			for (var i = 0; i < POINT; i++) {
				for (var j = 0; j < POINT; j++) {
					if (i + j < POINT) {
						var A = Math.abs(circleArr[i+j].x - circleArr[i].x),
							B = Math.abs(circleArr[i+j].y - circleArr[i].y);
						var lineLength = Math.sqrt(A*A + B*B);
						var C = 1/lineLength*7-0.009;
						var lineOpacity = C > 0.03 ? 0.03 : C;
						if (lineOpacity > 0) {
							drawLine(context, circleArr[i].x, circleArr[i].y, circleArr[i+j].x, circleArr[i+j].y, lineOpacity);
						}
					}
				}
			}
		}

		//调用执行
	  function start() {
			init();
			setInterval(function () {
				for (var i = 0; i < POINT; i++) {
					var cir = circleArr[i];
					cir.x += cir.moveX;
					cir.y += cir.moveY;
					if (cir.x > WIDTH) cir.x = 0;
					else if (cir.x < 0) cir.x = WIDTH;
					if (cir.y > HEIGHT) cir.y = 0;
					else if (cir.y < 0) cir.y = HEIGHT;
					
				}
				draw();
			}, 16);
		}
		// 	这个背景是从知乎复制来的
		// 	作者：贤子
		// 	链接：https://www.zhihu.com/question/38407085/answer/86554475
		// 	来源：知乎
		// 	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
	</script>


</body>
</html>