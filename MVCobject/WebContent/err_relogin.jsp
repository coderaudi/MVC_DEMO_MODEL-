<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Relogin</title>
</head>
<body>


<h1>Get user Details</h1>

<form action="getdata" method="post">
	<table>
		<tr>
			<td></td> <td> <font color="red"><%=request.getAttribute("invaliduser") %></font> </td>
		</tr>
		<tr>
			<td>UserId</td> <td><input type="text" name="userid" required="required"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Search"></td> <td><input type="reset" value="reset"></td>
		</tr>
	</table>
</form>
<marquee> mvc_model Demo project by abhijeetKhire</marquee>
<marquee>
<a href="https://github.com/coderaudi/MVC_DEMO_MODEL-">Project Download github</a>
</marquee>
</body>
</html>