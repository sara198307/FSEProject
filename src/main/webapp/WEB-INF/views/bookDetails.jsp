<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Book Information</title>
	</head>
	<body>
		<h2>Book Info Saved Successfully:</h2>
		   <table border="1">
		   <tr>
		        <td width="125">Book ID </td>
		        <td width="125">${bookId}</td>
		    </tr>
		    <tr>
		        <td width="125">Book Title</td>
		        <td width="125">${bookTitle}</td>
		    </tr>
		    <tr>
		        <td width="125">Book Price</td>
		        <td width="125">${bookPrice}</td>
		    </tr>
		     <tr>
		        <td width="125">Book Volume</td>
		        <td width="125">${bookVolume}</td>
		    </tr>
		     <tr>
		        <td width="125">Published Date</td>
		        <td width="125">${publishedDate}</td>
		    </tr>
		</table>
		<br>
		<br>
		<input type="button" value="Back" onclick="location.href='back'"/>  
	</body>
</html>