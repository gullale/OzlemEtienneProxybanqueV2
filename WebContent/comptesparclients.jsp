<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<H1>Liste compte(s) client</H1>

	<H2>Compte(s) Courant(s)</H2>

	<div>
		<table>
			<tr>
				<th>ClientId</th>
				<th>Numéro du compte</th>
				<th>Date Ouverture</th>
				<th>Solde</th>

			</tr>

			<tr>
				<td>2</td>
				<td>115544</td>
				<td>10/02/2018</td>
				<td>63</td>
			</tr>

		</table>
	</div>




	<H2>Compte(s) Epargne(s)</H2>

	<div>
		<table>
			<tr>
				<th>ClientId</th>
				<th>Numéro du compte</th>
				<th>Date Ouverture</th>
				<th>Solde</th>

			</tr>

			<tr>
				<td>2</td>
				<td>654654</td>
				<td>20/02/2018</td>
				<td>678</td>
			</tr>

		</table>
	</div>



	<div class="button">
		<a href=Accueil.jsp> <br /> <input type="submit"
			value="retour vers l'Acceuil" /> <br />
		</a>

	</div>

	<div class="button">
		<a href=ListeDesClientsParConseiller.jsp><input
			type="submit" value="Retour Liste Clients" />
		</a>

	</div>


</body>
</html>