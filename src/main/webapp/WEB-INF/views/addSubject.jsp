<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add Subject</title>
	</head>
	<body>
		<h2>Add Subject Form</h2>
		<form:form method="POST" action="saveSubject">
	   		<table>
			    <tr>
			        <td><form:label path="subtitle">Subject Title:</form:label></td>
			        <td><form:input path="subtitle" /></td>
			    </tr>
			    <tr>
			        <td><form:label path="durationInHours">Duration In Hrs</form:label></td>
			        <td><form:input path="durationInHours" /></td>
			    </tr>
			  <tr>
			  <tr>
			  </tr>
			  <tr>
			  </tr>
			      <td colspan="2"><input type="submit" value="Save Subject"/></td>
		      </tr>
		       <tr>
		    </tr>
		    <tr>
		    <td width="102"><input type="button" value="Back" onclick="location.href='back'"/></td>
		    </tr>
			</table>  
		</form:form>
	</body>
</html>