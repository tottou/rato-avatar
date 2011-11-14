<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="br.iesb.tottou.action.Cadastro"%>
<%@page import="br.iesb.tottou.data.AlunoDAO"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Cadastrar</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<style>
body, td, a:link, a:visited {
font-family: Verdana;
font-size: 10px;
color: #000000;
text-decoration: none;
}
a:hover{
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
		<h1>
			Rato Avatar
		</h1>
	</div>
	<div id="navigation">
		<ul>
		
		</ul>
	</div>
	<div id="content">
		<h2>
			
		</h2>


<%
String nome = request.getParameter("nome"); 
String matricula = request.getParameter("matricula"); 
String cod = request.getParameter("codigo"); 
String login = request.getParameter("login"); 
String senha = request.getParameter("senha"); 

if (AlunoDAO.seLoginUnico(login)==true) {
	
%>
	
	<form><center><img src="/RatoAvatar/imagens/deny.png" width="100px" height="100px" ><br/><br/><br/> Login já cadastrado.<br/><br/> <input type="button" value="Voltar" onclick="history.go(-1)"/></center></form> 
	<%
	
}
else {
	


if (cod.equals("aluno")||cod.equals("professor")) {
	
	Cadastro.preenche(login, senha, matricula, nome);
	
	out.println("Cadastro realizado com sucesso.");
}
else {
	
	%>
	
	<form><center><img src="/RatoAvatar/imagens/deny.png" width="100px" height="100px" ><br/><br/><br/> Código inválido.<br/><br/> <input type="button" value="Voltar" onclick="history.go(-1)"/></center></form> 
	<%
}
}

%>




<br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br /><br /> <br /> <br />
	</div>
	<div id="footer">
		Rato Avatar, 2011
	</div>
</div>

</body>
</html>