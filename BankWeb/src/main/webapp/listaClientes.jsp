<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Lista Clientes</title>
</head>
<body>

	<h1>Tienda Online</h1>
	<h4>Lista de Clientes</h4>

	<table class="table table-striped">
		<c:set var="counter" value="0" />

		<c:forEach var="customer" items="${requestScope.lista}">
			<c:if test="${not empty customer}">
				<tr>
					<td>${customer.firstName}</td>
					<td>${customer.lastName}</td>
					
					<td><form action="servcuentas" method="post">
							<input type="submit" class="btn btn-primary" role="button"
								value="Mostrar cuentas"> <input type="hidden"
								name="indexCuenta" value="${counter}">
						</form></td>
					<c:set var="counter" value="${counter + 1}" />
				</tr>
			</c:if>
		</c:forEach>
	</table>



</body>
</html>