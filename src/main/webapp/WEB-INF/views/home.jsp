<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<img src = "./images/cat1.jpg">
<P>  The time on the server is ${serverTime}. </P>

<a href="./go1">Go 1</a>
<a href = "./ex/go2">Go 2</a>
<a href= "./go3">Go 3</a>
<a href="./board/boardList">Board List</a>
</body>
</html>
