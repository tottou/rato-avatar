<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Logoff</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<style>
body,td,a:link,a:visited {
	font-family: Verdana;
	font-size: 10px;
	color: #000000;
	text-decoration: none;
}

a:hover {
	color: #FF0000;
}

input {
	font-family: Verdana, Arial, Helvetica, sans-serif;
	font-size: 10px;
	background-color: #FFFFFF;
	border: 1px solid #000000;
}
</style>
</head>
<body>
	<%
		//Destroi as sessions
		session.invalidate();
	%>

	<div id="container">
		<div id="header">
			<h1>Rato Avatar</h1>
		</div>
		<div id="navigation">
			<ul>
			
				
			</ul>
		</div>
		<div id="content">
			<h2>Logoff</h2>
			<center>
				<img src="/RatoAvatar/imagens/disconnect.png"> <br /><br/>
				<br /> Você saiu do sistema com sucesso. <br /><br> <input type="button"
					value="Início" onclick="document.location.href='Index.jsp'" />
			</center>
			<br /> <br /> <br /><br /> <br /> <br />
		</div>
		<div id="footer">Rato Avatar, 2011</div>
	</div>


</body>
</html>