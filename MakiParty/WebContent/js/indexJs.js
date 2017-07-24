// JavaScript Document
function show(){
	$.post("show",null,function(re){
		var str="";
		for(var i=0;i<re.length;i++){
			str += "<div class=\"posts\"><div class=\"title\">"+re[i].postsTitle+"</div><div class=\"value\">"+re[i].postsValue+"</div></div>";
		}
		$(".body").html(str);
	},"json");
}