<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script>
$(function() {
	$('#allProducts').click(function() {
		allProduct();
	});//click
});//function

function allProduct() {
	//비동기 시작...
	$.ajax({
		url:"api/findAllProduct",
		type:'get',
		contentType:"application/json;charset=utf-8",
		dataType:'json',
		error: function(xhr, status, message){
			alert("error : "+message);
		},
		
		success:function(data){
			//alert(data);
			$('#product-list').empty();
			$('#product-list').append("<ul>");
			for(var i=0; i<data.length; i++){
				$('#product-list').append("<li onclick=productInfo('"+data[i].name+"')>"+ data[i].name+"</li>");
			}
			$('#product-list').append("</ul>");		
			
		}//callback
	});//ajax
}//allBook

function productInfo(name) {	
	$.ajax({
		url:"api/findByProductName/"+name,
		
		type:"get",
		contentType:"application/json;charset=utf-8",
		
		error:function(xhr, status, message){
			alert("error : "+message);
		},
		
		success:function(data){
			console.info(data);
			$('#product-info').empty();
			var temp = "";
			temp +="<input type='button' value='추가' onclick='bookInsert()'>";
			temp +="<p></p><table>";
			temp +="<tr><td class=g>이 름</td><td><input type='text' name='name' value='"+data.name+"'></td></tr>";
			temp +="<tr><td class=g>제조사</td><td><input type='text' name='maker' value='"+data.maker+"'></td></tr>";
			temp +="<tr><td class=g>가 격</td><td><input type='text' name='price' value='"+data.price+"'></td></tr></table>";
			
			
			$('#product-info').append(temp);
		}
	});//ajax
}//bookInfo

function addProduct() { 
	$.ajax({
		url:"api/addProduct",
		type:"post",
		data:JSON.stringify({
			"name":$('input[name=isbn]').val(),
			"maker":$('input[name=title]').val(),
			"price":$('input[name=author]').val()
			
		}),
		
		contentType:"application/json;charset=utf-8",
		
		error:function(xhr){
			alert("error "+ xhr.status);
		},		
		success:function(data){		
				alert("INSERT 성공");	
				addProduct();
		}		
	});//ajax
}//bookInsert
</script>
</head>
<body>
<h2 align="center">Product Register Form....</h2>
<form id="addproduct">
상품명 : <input type="text" name="name"><br><br>
제조사 : <input type="text" name="maker"><br><br>
가   격 : <input type="text" name="price"><br><br>
<input type="submit" value="상품등록">
</form>
+++++++++++++++++++++++++++
<br><br>
<h3>상품명, 제조사별 검색방법을 먼저 선택하세요.</h3>
<input type="button" value="상품목록조회" id="allProducts">
	<div id="product-list"></div>
	<br>
	<div id="product-info"></div>
	
<form id="product-list">
<select name="command">
	<option value=""====아래에서 선택하세요====></option>
	<option id="product-info">상품명으로 검색하기</option>
	<option value="api/findByProductMaker/{maker}">제조사로 검색하기</option>
	<option value="findByProductId">상품 아이디로 검색하기</option>
	
</select>
<input type="text" name="word"><br><br>
<input type="submit" value="상품찾기"><br><br>
</form>
</body>
</html>

