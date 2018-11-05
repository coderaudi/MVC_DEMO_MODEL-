<%@page import="com.audi.mvc.dto.DataBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body {
background-color : skyblue;
display:table-cell;
 text-align:center; 
 vertical-align:middle;}

</style>
<meta charset="ISO-8859-1">
<title>USerHome</title>
</head>
<body>

<% DataBean udata = (DataBean) request.getAttribute("UserData"); %>


<h1>The User Details are as follow</h1>
<h3>

<table align="center" border="5px solid">
	<tr>
		<td> USERNAME </td> <td> <%=udata.getUsername() %> </td>
	</tr>

	<tr>
		<td> UESRID</td> <td> <%=udata.getUserid() %> </td>
	</tr>

	<tr>
		<td> EMAIL </td>  <td> <%=udata.getEmail() %> </td>
	</tr>
	<tr>
		<td> MOBILE NO  </td> <td> <%=udata.getMobile() %> </td>
	</tr>
	<tr>
		<td> ADDRESS  </td> <td> <%=udata.getAddress()%> </td>
	</tr>
	

</table>
</h3>
<marquee> mvc_model Demo project by abhijeetKhire</marquee>
<marquee>
<a href="https://github.com/coderaudi/MVC_DEMO_MODEL-">Project Download github</a>
</marquee>
</body>
</html>