<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>H+ Sport</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

	<form:form method="post" action="/updateUserDetails" modelAttribute="userDetails">
        			<form:input path="id" type="hidden" />
        			<label>Username</label> <form:input path="username" type="text" />
        			<form:errors path="username" cssClass="errors" />
        			<br/>
        			<label>Password</label> <form:input path="password" type="password" />
        			    			<form:errors path="password" cssClass="errors" />
    <br/>
        			<label>First Name</label> <form:input path="firstName" type="text" />
        			    			<form:errors path="firstName" cssClass="errors" />
    <br/>
        			<label>Last Name</label> <form:input path="lastName" type="text" />
        			    			<form:errors path="lastName" cssClass="errors" />
    <br/>
        			<label>What do you want to do? </label>
    				<form:radiobutton path="activity" id="activity" value="Playing a sport" />Play a Sport?
    				<form:radiobutton path="activity" id="activity" value="Exercise in Gym" />Hit the Gym?<br/>
        			<label>Date of birth</label>
        			<form:input path="dateOfBirth" type="date" />
        			<form:errors path="dateOfBirth" cssClass="errors" />
        			<br/>
        			<label>Gender</label>
        			<form:select path="gender" items="${genderItems}" />
    				<br/>
        			<input type="submit" value="Submit" id="submit">
        		</form:form>



</body>
</html>