<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta charset="UTF-8">
<title>H+ Sport</title>

<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <ul class="navbar">
        <li><a href="">home</a></li>
        <li><a href="">search</a></li>
        <li><a href="">linkedIn</a></li>

    </ul>
	<section id="registration" class="section">
	 <div class="container tagline">
	 <em>Register User</em><br/>
    		 <form:form method="post" action="/registeruser" modelAttribute="newuser" >
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
    			<form:input path="dateOfBirth" type="date" /><br/>
    			<label>Gender</label>
    			<form:select path="gender" items="${genderItems}" />
				<br/>
    			<input type="submit" value="Submit" id="submit">
    		</form:form>
		</div>
	</section>

	<!-- footer -->




</body>
</html>