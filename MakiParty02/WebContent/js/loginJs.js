// JavaScript Document
function lo(t){
		t.style.background = "#00BEE7";
}

function lo1(t){
		t.style.background = "#0381AA";
}

function submit(){
		
	var a = $("#an").html();
	if(a=="登录"){
		var id = $("#inUserId").val();
		var pass = $("#inUserPass").val();
		var name = "ok"
		var f = $("#f2")
	}else if(a=="注册"){
		var id = $("#userId").val();
		var pass = $("#userPass").val();
		var name = $("#userName").val();
		var f = $("#f1")
	}
	login(id,pass,name,f)
}
function login(id,pass,name,f){
	if(id!=""&pass!=""&name!=""){
		alert(1);
		f.submit();
	}
}
function signup(t){
	
	t.style.borderColor="#0381AA";
	$("#dl1").css("borderColor","#999999")
	$("#zc").css("color","#0381AA");
	$("#dl").css("color","#999999");
	$("#f2").hide();
	$("#f1").show();
	$("#an").html("注册");
}
function signin(t){
	t.style.borderColor="#0381AA";
	$("#zc1").css("borderColor","#999999")
	$("#zc").css("color","#999999");
	$("#dl").css("color","#0381AA");
	$("#f1").hide();
	$("#f2").show();
	$("#an").html("登录");
	
}

