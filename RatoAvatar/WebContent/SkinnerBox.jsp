<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<html>
<head>
<script src="/RatoAvatar/js/jquery-1.6.4.js"></script>
<link rel="stylesheet" type="text/css" href="/RatoAvatar/css/ra.css">
<title>Rato Avatar - Caixa de Skinner</title>
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

<style type="text/css">
.shiftcontainer {
	position: relative;
	left: 5px; 
	top: 5px; 
}

.shadowcontainer {
	width: 600px; /* container width*/
	background-color: #d1cfd0;
}

.shadowcontainer .innerdiv { 
	background-color: white;
	border: 1px solid gray;
	padding: 6px;
	position: relative;
	left: -5px;
	top: -5px;
}
</style>

</head>
<body>


		<script>
			var pause = false;
			var segs = 0;

			function playx() {
				pause = false;
				var aleatorio = ((Math.random() * 6000) + 2000);
				setTimeout(duplicarDiv, aleatorio);

				segs = segs + aleatorio / 1000;
				$("#idTempo").html(secondsToTime(segs));

			}

			function pausex() {

				pause = true;
			}

			function secondsToTime(secs) {
				var hours = Math.floor(secs / (60 * 60));

				var divisor_for_minutes = secs % (60 * 60);
				var minutes = Math.floor(divisor_for_minutes / 60);

				var divisor_for_seconds = divisor_for_minutes % 60;
				var seconds = Math.ceil(divisor_for_seconds);
				var obj = hours + ":" + minutes + ":" + seconds + " ";

				return obj;
			}

			function duplicarDiv() {
				if (!pause) {
					buscar();
					var novo = $("#model").clone();
					novo.insertAfter("#recipiente");

					novo.fadeIn(1000);

					playx();
				}

			}

			function reforco() {

				$.get("CaixaDeSkinner", function(data) {
					$("#msg").html(data);
				});
				
			}

			function buscar() {

				$.post("CaixaDeSkinner", function(data) {
					$("#msg").html(data);
				});

			}
		</script>
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
					<li><a href="#">Configurações</a></li>
					<li><a href="#">Ajuda</a></li>
					<li><a href="#">Sobre</a></li>
					<li><a href="Logoff.jsp">Logoff</a></li>

				</ul>
			</div>
			<div id="content">
				<h2>Caixa de Skinner</h2>
				<H3>Rato Avatar <% out.println(session.getAttribute("ratoAvatar")); %></H3>

				<center>
					<div id="caixa">
						<br />
						<table border="0" width="45%" align="center">
							<tr>
								<td></td>
								<td><img src="/RatoAvatar/imagens/play.png">
								</td>
								<td><img src="/RatoAvatar/imagens/forward.png">
								</td>
								<td><img src="/RatoAvatar/imagens/agua.png" width="22px"
									height="22px">
								</td>
								<td><img src="/RatoAvatar/imagens/luz.gif" width="22px"
									height="22px">
								</td>
								<td><img src="/RatoAvatar/imagens/af.gif" width="22px"
									height="22px">
								</td>
							</tr>
						</table>
					</div>






					<form>
						<input id="ref" type="button" value="Reforco" onclick="reforco();"></input>
						<input id="play" type="button" value="play" onclick="playx();"></input>
						<input id="pause" type="button" value="pause" onclick="pausex();"></input>


						<div id="model" style="display: none;">

							

							<div class="shiftcontainer">
								<div class="shadowcontainer">
									<div class="innerdiv">
										<table border="0" width="45%" align="center">
										<tr>
										<td>
										<img src="/RatoAvatar/imagens/ratoAvatar.gif" width="35px"
									height="35px">
									</td>
									<td>
										<div id="idTempo" class="outputTextArea"></div>
										<td/><td>
							<div id="msg" class="outputTextArea">Rato posto na Caixa...</div>
							</td>
							</tr>
										</table>
									</div>
								</div>
							</div>
						<br/>

						</div>

						<div id="recipiente"></div>
					</form>

				</center>







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