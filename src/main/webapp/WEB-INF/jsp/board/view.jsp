
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset='UTF-8'>
<title>BOARD</title>
</head>
<body>
<h1>상세보기</h1>
<form action='update' method='post'>
<table border='1'>
<tr>
<th>번호</th>
<td><input readonly type='text' name='no' value='${board.no}' readonly></td>
</tr>
<tr>
<th>제목</th>
<td><input type='text' name='title' value='${board.title}'></td>
</tr>
<tr>
<th>내용</th>
<td><input type='text' name='contents' value='${board.contents}'></td>
</tr>
</table>
<p><button>변경하기</button><a href='delete?no=${board.no}'>삭제하기</a></p>
</form>
</body>
</html>