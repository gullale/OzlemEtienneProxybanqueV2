<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="scopeVarSession" value="Session Value" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="CSS/proxystyle.css" />

<title>Application Proxybanque</title>
</head>
<body>

	<div class=tete>
		<center>
			<H1>Proxybanqu&euro;</H1>
		</center>
		<center>
			<img src="Images/partenariat.jpg" alt="Proxybank logo" width="20%">
		</center>
		<center>
			<h2>La Banque la plus proche de vous</h2>
		</center>
	</div>



	<div>

		<center>
			<!-- Mettre lien vers la servlet dans action-->
			<form action="LoginConseiller" method="post">

				<fieldset class=identifiant>

					<legend> * Authentification Conseiller * </legend>

					<div class="formulaire">

						<input type="text" name="loginFormulaire" value="" placeholder="Login" />
						<input type="password" name="passwordFormulaire" value="" placeholder="Password" />
						
					</div>
					
				</fieldset>

				<div class="button">
					<a href=ListeDesClientsParConseiller.jsp> <br /> <input
						type="submit" value="se connecter" /> <br />
					</a>

				</div>






			</form>
		</center>
	</div>
</body>
</html>

