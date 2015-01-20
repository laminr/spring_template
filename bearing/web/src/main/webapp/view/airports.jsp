<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Airports</title>
</head>
<body>
	<table>
		<tbody>
			<c:forEach items="${ airports }" var="airport">
				<tr>
					<td> <c:out value="${ airport.name }" /> </td>
					<td> <c:out value="${ airport.city }" /> </td>
					<td> <c:out value="${ airport.iata }" /> </td>
					<td> <c:out value="${ airport.icao }" /> </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>