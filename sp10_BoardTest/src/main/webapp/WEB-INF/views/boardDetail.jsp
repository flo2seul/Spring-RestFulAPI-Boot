<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardDetail</title>
</head>
<body>
<h1>${vo.no} ${vo.title}</h1>
<h2>${vo.id}</h2>
<p>${vo.contents}</p>
<a href="fileDown.do?filename=${vo.fileName}">${vo.fileName }</a>
${filepath}
<img alt="" src="${filepath}${vo.fileName}">
<img alt="" src="C:\encore_lsy\SpringMVCProject\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\sp10_BoardTest\upload\"${vo.fileName}>
</body>
</html>