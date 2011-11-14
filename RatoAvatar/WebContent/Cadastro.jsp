<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Cadastro</title>
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
	alert("O campo nome é obrigatório.");
	form.nome.focus();
	return false;
	}
if (form.matricula.value=="") {
	alert("Necessário preencher o campo da matrícula.");
	form.matricula.focus();
	return false;
	}
if (form.login.value=="") {
	alert("Login não está preenchido");
	form.login.focus();
	return false;
	}
if (form.senha.value=="") {
	alert("Preencha o campo senha corretamente.");
	form.senha.focus();
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
		<div id="navigation">
			<ul>

			</ul>
		</div>
		<div id="content">
			<h2>Cadastro</h2>

			<form name="form1" method="post" action="Cadastrar.jsp"
				onsubmit="return validarNulo(this);">
				<table width="180" border="0" align="left" cellpadding="5"
					cellspacing="1">
					<tr>
						<td width="55">Nome:</td>
						<td width="122"><input name="nome" type="text" id="nome"
							size="50">
						</td>
					</tr>
					<tr>
						<td height="18">Matrícula:</td>
						<td><input name="matricula" type="text" id="matricula">
						</td>
					</tr>
					<tr>
						<td height="18">Código:</td>
						<td><input name="codigo" type="text" id="codigo"> <img
							src="/RatoAvatar/imagens/hint.gif"
							title="Para validar seu cadastro
 é necessário um código de acesso. Caso não possua, contatar o responsável pelo deploy do sistema. ">
						</td>
					</tr>
					<tr>
						<td width="55">Login:</td>
						<td width="122"><input name="login" type="text" id="login">
						</td>
					</tr>
					<tr>
						<td height="18">Senha:</td>
						<td><input name="senha" type="password" id="senha">
						</td>
					</tr>
					<tr>
						<td><input type="submit" name="cadastrar" value="Cadastrar">
						</td>
						<td><input type="button" name="cancelar" value="Cancelar"
							onclick="window.close()">
						</td>

					</tr>
				</table>

			</form>
			<br /> <br /> <br />
			<br /> <br /> <br />
			<br /> <br /> <br />
			<br /> <br /> <br />
		</div>
		<div id="footer">Rato Avatar, 2011</div>
	</div>

</body>
</html>