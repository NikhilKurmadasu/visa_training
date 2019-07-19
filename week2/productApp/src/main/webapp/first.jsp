<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" http-equiv="Content-type" content="text/html">
<title>first page</title>
</head>
<body>
	<h1>Unicode Characters</h1>
	<%
		for (int i = 2305; i <= 3200; i++) {
	%>
	<br /> Character: &#<%=i%>; for the value <%=i %>
	<%
	//out.print(i*i);
		}
	%>
</body>
</html>