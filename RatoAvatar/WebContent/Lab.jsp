<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@page import="br.iesb.tottou.action.Lab"%>
<%@page import="java.util.List"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Laboratório</title>
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
				<li><a href="#"><img src="/RatoAvatar/imagens/user.png" width="12px" height="12px"> <% out.println (session.getAttribute("loginUsuario")); %></a>
				</li>
				<li><a href="Lab.jsp">Laboratório</a>
				</li>				
				<li><a href="#">Configurações</a>
				</li>
				<li><a href="#">Ajuda</a>
				</li>
				
				<li><a href="#">Sobre</a>
				</li>
				<li><a href="Logoff.jsp">Logoff</a>
				</li>
				
			</ul>
		</div>		
		<div id="content">
			<h2>Laboratório</h2>

			<h3>Ratos:</h3> <br/><br/>
			<form name="form1" method="post" action="Experimentos.jsp">
					
					<%
					List<String> lista = Lab.ratosALuno( session.getAttribute("loginUsuario").toString());
										
				
					for (String nomeRato : lista) {						
						
						out.println("<input type='radio' name='ratos'  value='"+nomeRato+"'><b>"+nomeRato+"</b><br />");	
						
					}
					if (lista.size()>0) {	
					out.println("<br /><br /><input type='submit' name='Submit' value='Acessar'> <br/><br/>");
					}
					
					
					
					%>
					
					</form>
					
					
					<br/><br/><br/><br/><br/><br/>
					<div id="criar" >
					 
					 <input type="button" value="Novo Rato Avatar" onclick="mostrarCriando();" />
					
					</div>
					
					<div id="criando" style="visibility: hidden; ">
					
					<form name="form" method="post" action="NovoRato.jsp"
				onsubmit="return validarNulo(this);">
					Nome do Rato Avatar: <input name="nome" type="text" id="nome" value=""> 
					<input type="submit" value="Criar" onclick="mostrarCriar();" />					
					</form>
					</div>		
					
					
				
					
					
					
					
					<br/><input type="button" value="Caixa de Skinner" onclick="document.location.href='SkinnerBox.jsp'" />
					
					
					
					
					
					
					
					
					
					
					
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