<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Age</th>
			<th>School ID</th>
		</tr>
		
		<!-- loop over and print our customers -->
		<c:forEach var="student" items="${students}">
		
			<tr>
				<td> ${student.firstName} </td>
				<td> ${student.lastName} </td>
				<td> ${student.age} </td>
				<td> ${student.schoolId} </td>
			</tr>
		
		</c:forEach>
				
	</table>


</body>
</html>