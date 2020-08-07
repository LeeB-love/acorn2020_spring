<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/view/home.jsp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/bootstrap.css" />
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
</head>
<body>
<div class="container">
	<h1>인덱스 페이지입니다.</h1>
	<p>Spring framework 동작중...</p>
	<ul>
		<li><a href="test/play.html">spring 컨트롤러를 거치지 않는 요청</a></li>
		<li><a href="test/game.jsp">spring 컨트롤러를 거치지 않는 요청2</a></li>
		<li><a href="friends.do">친구 목록 보기</a></li>
		<li><a href="friends2.do">친구 목록 보기2</a></li>
		<li><a href="friends3.do">친구 목록 보기3</a></li>
		<li><a href="delete.do">친구 정보 삭제(리다이렉트 이동)</a></li>
		<li><a href="delete2.do">친구 정보 삭제2(리다이렉트 이동)</a></li>
		<li><a href="users/signup_form.do">회원 가입 폼</a></li>
	</ul>
	<ol>
	<c:forEach var="tmp" items="${noticeList }">
		<li>${tmp }</li>
	</c:forEach>
	</ol>
	
</div>
</body>
</html>