<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="CSS/proxystyle.css" />
<title>Nouveau Client</title>
</head>
<body>

	<H1>Création d'un nouveau Client</H1>


	<form action="/InsertClient" method="post">

		<br /> <input type="text" name="nom" value="" placeholder="nom">
		<br /> <input type="text" name="prenom" value="" placeholder="prénom">
		<br /> <input type="text" name="login" value="" placeholder="login">
		<br /> <input type="password" name="password" value="" placeholder="Password">
		<br /> <input type="text" name="adresse" value="" placeholder="Adresse">
		<br /> <input type="text" name="codePostal" value="" placeholder="Code Postal">
		<br /> <input type="text" name="ville" value="" placeholder="Ville">
		<br /> <input type="text" name="telephone" value="" placeholder="Téléphone">
		<br /> <input type="text" name="email" value="" placeholder="email">
		<br /> <input type="text" name="idConseiller" placeholder="ID Conseiller">

		<br />
		<br/> 
		
		<div class="button">
		<input type="submit" value="Enregistrer">
		</div>
	</form>






</body>
</html>