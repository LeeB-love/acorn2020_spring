<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>친구리스트</h1>
	<ul>
		<c:forEach var="tmp" items="${friendsList }">
			<li>${tmp }</li>
		</c:forEach>
	</ul>
</body>
</html>