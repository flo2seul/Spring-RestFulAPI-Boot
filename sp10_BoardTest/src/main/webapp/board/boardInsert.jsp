<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 추가</title>
<script type="text/javascript" src="js/jquery-1.10.1.js"></script>
<script type="text/javascript">
	/*$(function () {
		$("#fileForm").submit(function(){
			var formData = $("#fileForm").serialize();
			console.log("formData: "+ formData);
		});
	});*/
</script>
</head>
<body>
	<h3>파일 업로드 테스트</h3>
	<form id="fileForm" method="post" action="boardInsert.do" enctype="multipart/form-data">
		<table>
			<tr>
				<td>제목: </td>
				<td><input type="text" id="title" name="title"></td>
			</tr>
			<tr>
				<td>아이디: </td>
				<td><input type="text" id="id" name="id"></td>
			</tr>
			<tr>
				<td>내용: </td>
				<td><textarea rows="15" cols="50" name="contents" id="contents"></textarea></td>
			</tr>
			<tr>
				<td>파일: </td>
				<td><input type="file" name="uploadFile" id="uploadFile"></td>
			</tr>	
		</table>

		<br><br>
		<input type="submit" value="작성"> 
		<input type="button" id="btn" value="취소" />
	</form>
</body>
</html>