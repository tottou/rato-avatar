<%@page import="br.iesb.tottou.data.AlunoDAO"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Conectando...</title>
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
</head> <body>
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
			Conectando...
		</h2>
		<%
String login = request.getParameter("login"); // Pega o Login vindo do formulário
String senha = request.getParameter("senha"); //Pega a senha vinda do formulário
if (AlunoDAO.seLoginIgualSenha(login,senha)==true) {
out.println("Conectado com sucesso."); //Mostra na tela que foi logado com sucesso
session.setAttribute("loginUsuario", login); //Grava a session com o Login
session.setAttribute("senhaUsuario", senha); //Grava a session com a Senha
out.println("<script>document.location.href='Lab.jsp';</script>"); //Exibe um código javascript para redireionar ao painel
} else { //Se estiverem incorretos...
out.println(" "); //Exibe na tela e pede para voltar
}
%>

<form><center><img src="/RatoAvatar/imagens/deny.png" ><br/><br/><br/> Login ou senha inválidos.<br/> <input type="button" value="Voltar" onclick="history.go(-1)"/></center></form> 
<br /> <br /> <br /><br /> <br /> <br />
	
	</div>
	<div id="footer">
		Rato Avatar, 2011
	</div>
</div>

</body>
</html>