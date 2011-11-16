<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Login</title>
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

	
		<div id="content">			
			<center>
				<img src="/RatoAvatar/imagens/ratoAvatarz.jpg" title="Line art by Craig Swanson \n 
				Final Art by Roberta Maria \n Rato Avatar by Arthur Heleno"> <br /> <br />
				
				<br />Para conectar-se no sistema informe seu login e senha:
			</center>
			<br />
			<br />

			<form name="form1" method="post" action="Logar.jsp">
				<table width="180" border="0" align="center" cellpadding="0"
					cellspacing="1">
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
					<tr>
						<td colspan="2"><div align="center">
								<input type="submit" name="Submit" value="Login"> <input
									type="button" name="cadastrar" value="Cadastrar"
									onclick="window.open('Cadastro.jsp','Cadastro','width=600,height=400')">
								<input type="button" name="ajuda" value="Ajuda"
									onclick="window.open('Ajuda.jsp','Ajuda','width=600,height=400,scrollbars=1')">
							</div>
						</td>
					</tr>
				</table>
			</form>
			<br /> <br /> <br />

		</div>
		<div id="footer">Rato Avatar, 2011</div>
	

</body>
</html>