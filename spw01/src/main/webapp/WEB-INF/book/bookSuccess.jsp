<%@page import="com.encore.spring.domain.Book"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Book vo = (Book) session.getAttribute("bo"); %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<style>
		h2 {
			text-align: center;
			margin-top: 20px;
		}
		p {
			text-align: center;
		}
		p span {
			color: orange;
		}
		a {
			margin: 5px;
		}
	</style>
</head>
<body>
	<h2>결과 페이지</h2>
	<p><span><%= vo.getTitle() %></span>
		정상적으로 저장 되었습니다</p>
	<p><a href="book/Book.html">추가 등록</a><a href="#">도서목록</a></p>
</body>
</html>