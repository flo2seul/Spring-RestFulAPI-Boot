<%@ page contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1, h4 {
	text-align: center;
}
a {
	margin: 10px;
}

</style>
</head>
<body>
<jsp:include page="/header.jsp"></jsp:include>
<h1> 메인 페이지 </h1>
<p/>
<p/>
<c:choose>
	<c:when test="${empty loginUser}">
		<h4> <a href="searchPhone.do">핸드폰 목록</a></h4>
		<h4> <a href="login.do">로그인</a></h4>	
	</c:when>
	
	<c:otherwise>
	<h4> <a href="regPhone.do">핸드폰 등록</a> </h4>
	<h4> <a href="searchPhone.do">핸드폰 목록</a></h4>
	</c:otherwise>
</c:choose>
</body>
</html>