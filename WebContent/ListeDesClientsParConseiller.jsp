<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<c:set var="scopeVarSession" value="Session Value" scope="request" />


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Liste des clients par conseiller</title>
<link rel="stylesheet" href="CSS/proxystyle.css" />
</head>

<body>

	<h1>
		Liste de vos clients <br />
	</h1>



	<div>
		<table>
			<tr>
				<th>ClientId</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Login</th>
				<th>Password</th>
				<th>Adresse</th>
				<th>CodePostal</th>
				<th>Ville</th>
				<th>Téléphone</th>
				<th>Email</th>

			</tr>

			<%-- <c:forEach items="${}" --%>
			<%-- It <c:out value= "${clientId}" ></c:out> --%>
			<%-- </c:forEach> --%>

			<tr>
				<td>Alfreds Futterkiste</td>
				<td>Maria Anders</td>
				<td>Germany</td>
			</tr>
			<tr>
				<td>Centro comercial Moctezuma</td>
				<td>Francisco Chang</td>
				<td>Mexico</td>
			</tr>

		</table>
	</div>



	<div>



		<br /> <input type="button" name="insertClient"
			value="Nouveau Client"> <br />

	</div>





</body>
</html>