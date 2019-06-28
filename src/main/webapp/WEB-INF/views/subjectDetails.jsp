<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Subject Information</title>
	</head>
	<body>
		<h2>Subject Info Saved Successfully:</h2>
		   <table border="1">
		   <tr>
		        <td width="125">Subject ID </td>
		        <td width="125">${subjectId}</td>
		    </tr>
		    <tr>
		        <td width="125">Subject Title</td>
		        <td width="125">${subjectTitle}</td>
		    </tr>
		    <tr>
		        <td width="125">Duration In Hrs</td>
		        <td width="125">${duration}</td>
		    </tr>
		</table>
		<br>
		<br>
		<input type="button" value="Back" onclick="location.href='back'"/>  
	</body>
</html>