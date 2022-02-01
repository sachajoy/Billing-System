<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>H+ Sport</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<h3> List of User <h3>
	<ul>
	<c:forEach var="user" items="${userList}">
	    <li>
	        <a href="/udpateUser/${user.id}">
	            ${user.username}
	        </a>
	    </li>

 </c:forEach>



</body>
</html>