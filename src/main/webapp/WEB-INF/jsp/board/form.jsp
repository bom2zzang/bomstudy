<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BOARD</title>
</head>
<body>

<h1>등록</h1>
<form action="add" method="post">
<table border='1'>
<tr>
    <th>제목</th><td><input type="text" name="title"></td>
</tr>
<tr>
    <th>내용</th><td><input type="text" name="contents"></td>
</tr>
</table>
<button>등록</button>

</form>

</body>
</html>