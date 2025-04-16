<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!--
		<%
	//String nm = (String) request.getAttribute("name");
	//Integer collection = (Integer) request.getAttribute("collection");
	//String timeNow = (String) request.getAttribute("time");
	%>
		  -->
	
	<h1>Hello , This is Help jsp</h1>
	<h2>My Name is <%= request.getAttribute("name") %></h2>
		and the collection is
		${collection}</h2>
	<h3>
		Current time is
		${time}</h3>
		<h2>Numbers List: ${numbers}</h2>
		<h1>Numbers Are </h1>
		<c:forEach var="item" items="${numbers}">
			<h2>${item}</h2>
		
		</c:forEach>
		OR
		<h1><c:out value="${numbers}"></c:out></h1>
		
</body>
</html>