<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Salvar</title>
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

	<div id="container">
		<div id="header">
			<h1>Rato Avatar</h1>
		</div>
		
		<%
				//Verifica se está logado
				if (session.getAttribute("loginUsuario") != null 
						&& session.getAttribute("senhaUsuario") != null
						&& session.getAttribute("ratoAvatar") !=null) {
					 %>
		
		<div id="content">
			<h2>Salvo!</h2>
				
				
			
					O experimento foi finalizado e salvo com sucesso, o Rato Avatar voltou ao biotério virtual.
					Os resultados do experimento podem ser acessados na página de Experimentos.<br/>
					<br/>
					
					<center> <input type="button" onclick="window.close()" value="Fechar" /> </center>
					
					
					
					
					
					
					
					
					
					
				<%	
				} else {
					out.println("Você não está logado no sistema ou não está utilizando uma cobaia virtual. Clique <a href='Index.jsp'><b>aqui</b></a> para voltar e conectar-se");
				}
			%>
			<br /> <br /> <br /><br /> <br /> <br />


		</div>
		<div id="footer">Rato Avatar, 2011</div>
	</div>



</body>
</html>