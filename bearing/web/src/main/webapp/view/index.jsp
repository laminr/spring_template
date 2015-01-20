<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>
		<spring:message code="title.index" />
		${code}
	</title>
</head>
<body>
	<spring:message code="label.airport.code" arguments="${code}" />
</body>
</html>