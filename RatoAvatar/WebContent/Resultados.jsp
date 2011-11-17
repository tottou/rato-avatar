<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=ISO-8859-1" %>
<%@page import="br.iesb.tottou.action.Lab"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Resultados</title>
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

function validarNulo (form){
	if (form.nome.value=="") {
		alert("O nome do rato não está preenchido corretamente.");
		form.nome.focus();
		return false;
		}
}
	
	function mostrarCriando (){
	
		document.getElementById("criando").style.visibility = 'visible';
		document.getElementById("criar").style.visibility = 'hidden';
		
			}
	
	function mostrarCriar (){
		
		document.getElementById("criando").style.visibility = 'hidden';
		document.getElementById("criar").style.visibility = 'visible';
		
			}
	
	function validarNulo (form){
		if (form.experimento.value=="") {
			alert("O campo do título do experimento é obrigatório.");
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
		String result = request.getParameter("resultados");
	
				//Verifica se está logado
				if (session.getAttribute("loginUsuario") != null 
						|| session.getAttribute("senhaUsuario") != null) {
					
					 %>
		<div id="navigation">
			<ul>
				<li><a href="#"><img src="/RatoAvatar/imagens/user.png" width="12px" height="12px"> <% out.println (session.getAttribute("loginUsuario")); %></a>
				</li>
				<li><a href="Lab.jsp">Laboratório</a>
				</li>				
				<li onclick="window.open('Config.jsp','Ajuda','width=600,height=400,scrollbars=1')"><a href="#">Configurações</a>
				</li>
				<li onclick="window.open('Ajuda.jsp','Ajuda','width=600,height=400,scrollbars=1')"><a href="#">Ajuda</a>
				</li>				
				<li onclick="window.open('Sobre.jsp','Ajuda','width=600,height=400,scrollbars=1')"><a href="#">Sobre</a>
				</li>
				<li><a href="Logoff.jsp">Logoff</a>
				</li>
				
			</ul>
		</div>		
		<div id="content">
			<% if (session.getAttribute("ratoAvatar") != null) {
				
			
			
			
			%>
			<h2>Resultados do Rato Avatar <% out.println (session.getAttribute("ratoAvatar")); %> </h2>
			<h2>Resultado <%out.println (result); %> </h2>

		
					
					
					
					
					<img src="/RatoAvatar/charts/chart<%out.println(""+session.getAttribute("loginUsuario")+session.getAttribute("ratoAvatar")+result);%>.png" >
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					<%
						} else {
							out.println("Você não selecionou um Rato Avatar adequadamente. Clique <a href='Lab.jsp'><b>aqui</b></a> para voltar.");
						}
					
					%>
					
					
					
				<%	
				} else {
					out.println("Você não está logado no sistema. Clique <a href='Index.jsp'><b>aqui</b></a> para voltar e conectar-se");
				}
			%>
			<br /> <br /> <br /><br /> <br /> <br />


		</div>
		<div id="footer">Rato Avatar, 2011</div>
	</div>



</body>
</html>