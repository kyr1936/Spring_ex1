<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>BoardWrite Page</h1>
	<form action="./boardWrite" method="POST">
		num : <input type="text" name="num">
		Writer : <input type="text" name="writer">
		Title : <input type="text" name="title">
		Contents : <textarea rows="1" cols="100" name="contents"></textarea>	
		<button>Write</button>
		<p>
		<input type="checkbox" name="check" value="v1">
		<input type="checkbox" name="check" value="v2">
		<input type="checkbox" name="check" value="v3">
		</p>
	</form>
</body>
</html>