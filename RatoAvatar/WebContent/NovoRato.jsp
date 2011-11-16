<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="br.iesb.tottou.action.Lab"%>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h"%>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Novo Rato</title>
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

<script language="JavaScript">
	function validarNulo(form) {
		if (form.nome.value == "") {
			alert("O nome do rato não está preenchido corretamente.");
			form.nome.focus();
			return false;
		}
	}
</script>
</head>
<body>

	<div id="container">
		<div id="header">
			<h1>Rato Avatar</h1>
		</div>

		<%
			//Verifica se está logado
			if (session.getAttribute("loginUsuario") != null
					|| session.getAttribute("senhaUsuario") != null) {
		%>
		<div id="navigation">
			<ul>
				<li><a href="#"><img src="/RatoAvatar/imagens/user.png"
						width="12px" height="12px"> <%
 	out.println(session.getAttribute("loginUsuario"));
 %>
				</a></li>
				<li><a href="Lab.jsp">Laboratório</a></li>
				<li onclick="window.open('Config.jsp','Ajuda','width=600,height=400,scrollbars=1')"><a href="#">Configurações</a></li>
				<li onclick="window.open('Ajuda.jsp','Ajuda','width=600,height=400,scrollbars=1')"><a href="#">Ajuda</a>
				</li>				
				<li onclick="window.open('Sobre.jsp','Ajuda','width=600,height=400,scrollbars=1')"><a href="#">Sobre</a>
				</li>
				<li><a href="Logoff.jsp">Logoff</a></li>

			</ul>
		</div>


		<div id="content">
			<h2>Novo Rato</h2>


			<%
				String nomeRato = request.getParameter("nome"); 
					String nomeAluno = session.getAttribute("loginUsuario")
							.toString();
					if ((nomeRato != null) && (nomeRato != "") && Lab.seRatoUnico(nomeAluno, nomeRato) ) {
						
						Lab.criarRato(nomeAluno, nomeRato);
						out.println("Rato Avatar "+nomeRato+" criado com sucesso. <br/>");
						out.println("<br/>Todos Ratos Avatar novos estão bem cuidados, alimentados com ração desidratada, e 48 horas com privação de água. (Colocar mais info. aqui) <br/>");				

					}
					else
					{
						
						out.println("<br/><br/><br/>Falha na criação do Rato Avatar. Nome inválido ou já criado em uma tentativa anterior. <br/>");
					}
			%>







		<%
			} else {
				out.println("Você não está logado no sistema. Clique <a href='Index.jsp'><b>aqui</b></a> para voltar e conectar-se");
			}
		%>
		<br /> <br /> <br />
		<br /> <br /> <br />


	</div>
	<div id="footer">Rato Avatar, 2011</div>
	</div>



</body>
</html>