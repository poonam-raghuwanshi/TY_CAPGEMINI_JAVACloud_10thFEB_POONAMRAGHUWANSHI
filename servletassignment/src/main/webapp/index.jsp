<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<form action = "add-user" method = "post">
   Name: <input type = "text" name = "username"/><br/>
   Password: <input type = "password" name = "password"/><br/>
   Email: <input type = "email" name = "email"/><br/>
   Sex: <input type="radio" name="gender" value="male">Male
   		<input type="radio" name="gender" value="female">Female <br/>
   Country: <input type = "text" name = "country"/><br/>		
   <input type = "submit" value = "Submit"/>
   </form>
</body>
</html>
