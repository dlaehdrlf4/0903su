<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jqurey 연습</title>
<style>
	a{
		text-decoration:none;
	}
</style>
</head>
<body>
	<input type = "button" value="클릭" id="btn"/>

	<a href = "logout">로그아웃</a>
	
	<nav>
		<ul>
			<li><a href="login.do">로그인</a></li>
			<li><a href="register.do">회원가입</a></li>
		</ul>
	</nav>
</body>
<script src="${pageContext.request.contextPath}/resource/js/jquery.js"></script>
<script>
	//아이디를 사용할 때 #을 사용한다.
	$('#btn').bind('click',function(){
		//console.log("로그를 사용합니다.");
	})
	
	// 브라우저 창을 닫거나 새로 고침을 할 때
	$(window).bind("beforeunload",function(){
		//서버에게 logout 요청을 ajax로 전송
		$.ajax({
			url:"logout"	
		})
	});
	
	//스크립트에 $로 시작하면 거의 jquery를 사용하고 있는 것이다.
	//문서의 내용을 전부 읽자 마자
	$(function(){
		//alert("jqurey를 사용중.")
	})
</script>
</html>