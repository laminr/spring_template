<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<form:form method="POST" modelAttribute="airportCreate" action="create-new-airport">
		<div>
			<form:input path="name" />
			<form:errors path="name" />
		</div>
		<div>
			<form:input path="city"/>
			<form:errors path="city"/>
		</div>
		<div>
			<form:input path="iata"/>
			<form:errors path="iata"/>
		</div>
		<div>
			<form:input path="icao"/>
			<form:errors path="icao"/>
		</div>
		
		<input type="submit" /> 
	</form:form>
</body>
</html>
