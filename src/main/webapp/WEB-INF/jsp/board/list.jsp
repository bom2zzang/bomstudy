<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>BOARD</title>
<body>
<h1>BOARD LIST</h1>
<table border='1'>
<tr>
	<th>번호</th><th>제목</th><th>내용</th>
</tr>
<c:forEach items="${list}" var="board">
<tr>
	<td>${board.no }</td>
	<td><a href='${board.no }'>${board.title }</a></td>
	<td>${board.contents }</td>
</tr>
</c:forEach>
</table>




</body>
</head>
</html>
