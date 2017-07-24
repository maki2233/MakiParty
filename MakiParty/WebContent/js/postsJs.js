// JavaScript Document
function show(){
	alert(1)
	$.post("testPosts",null,function(re){
		var str="";
		for(var i=0;i<re.length;i++){
			str+="	<div class=\"posts\"><ul><li class=\"fromName\">"+re[i].userName+"</li><li class=\"postsTime\">"+re[i].postsTime+"</li><li class=\"postsTitle\">"+re[i].postsTitle+"</li><li class=\"postsValue\">"+re[i].postsValue+"</li></ul></div>"
			$("#d1").html(str);
		}
		
	},"json");
}