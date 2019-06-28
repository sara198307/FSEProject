<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Home</title>
	</head>
	<body>
		<h2>Subject And Book Management</h2>
		<form>
	   		<table>
			    <tr>
			        <td width="250"><label for = "Subject">Subject Management:</label></td>
			        <td width="102"><input type="button" value="Add Subject" onclick="location.href='addSubject'"/></td>
			        <td width="102"><input type="button" value="Search Subject" onclick="location.href='searchSubject'"/></td>
			         <td width="102"><input type="button" value="Delete Subject" onclick="location.href='deleteSubject'"/></td>
			    </tr>
			    <tr>
			    </tr>
			   <tr>
			        <td width="127"><label for = "Book">Book Management:</label></td>
			        <td width="102"><input type="button" value="Add Book" onclick="location.href='addBook'"/></td>
			        <td width="102"><input type="button" value="Search Book" onclick="location.href='searchBook'"/></td>
			         <td width="102"><input type="button" value="Delete Book" onclick="location.href='deleteBook'"/></td>
			</table>  
		</form>
	</body>
</html>