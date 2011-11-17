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
				document.getElementById("inicio").style.visibility = 'hidden';
				document.getElementById("playDiv").style.visibility = 'visible';
				document.getElementById("pauseDiv").style.visibility = 'hidden';
				pause = false;
				var aleatorio = ((Math.random() * 6000) + 2000);
				setTimeout(duplicarDiv, aleatorio);

				segs = segs + aleatorio / 1000;
				$("#idTempo").html(secondsToTime(segs));

			}

			function pausex() {
				document.getElementById("inicio").style.visibility = 'hidden';
				document.getElementById("playDiv").style.visibility = 'hidden';
				document.getElementById("pauseDiv").style.visibility = 'visible';
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
			
			function salvar () {
				
				if (confirm("Deseja realmente salvar o experimento? \n(O experimento será encerrado)")) {
					
					$.get("CaixaDeSkinner", {ninja:"salvar"}, function(data) {
						$("#msg").html(data);
					});
					window.open('Salvar.jsp','Cadastro','width=600,height=400');
					 
					} else {						
					return false;
					} 
				
			}
			
			function mostrarCriando (){
				
				document.getElementById("inicio").style.visibility = 'hidden';
				document.getElementById("playDiv").style.visibility = 'visible';
				document.getElementById("pauseDiv").style.visibility = 'hidden';
				
					}
		</script>
		<div id="container">
			<div id="header">
				<h1>Rato Avatar</h1>
			</div>
			<%
			String nomeExpermento = request.getParameter("experimento"); 
			session.setAttribute("nomeExperimento", nomeExpermento);
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
				<h2>Caixa de Skinner</h2>
				<H3>Rato Avatar <% out.println(session.getAttribute("ratoAvatar")); %></H3>


			
				<center>
				<div id="inicio"  style="background: gray;" ><font  color="white">Pressione o botão PLAY para iniciar a simulação</font></div>
				<div id="playDiv" style="visibility: hidden; " ><div id="insidePlay" style="background: gray;" ><font color="white">Simulação em andamento...</font></div> </div>
				<div id="pauseDiv" style="visibility: hidden; "><div id="insidePause" style="background: gray;" ><font color="white">Simulação pausada. </font></div></div>
				
				
				
				<form id="controle" name="Salvar" method="post" action="Lab.jsp">
					<div id="caixa" >
						<br />
						<table border="0" width="30%" align="center">
							<tr>
								<td></td>
								<td>
								<input id="play" type="image" onclick="playx();return false" title="Iniciar ou continuar a simulação" src="/RatoAvatar/imagens/play.png" width="22px"
									height="22px" ></input>
								</td>	
								<td><input id="pause" type="image" value="Pause" onclick="pausex();return false" title="Pausar a simulação" src="/RatoAvatar/imagens/pause.png" width="22px"
									height="22px" ></input>
								</td>								
								<td><input id="ref" type="image" value="Reforco" onclick="reforco();return false" title="Ativar o reforço na Caixa de Skinner" src="/RatoAvatar/imagens/agua.png" width="22px"
									height="22px" ></input>
								</td>
								<td><input id="save" type="image" value="Salvar" onclick="return salvar();"
								 title="Salvar resultados e sair do experimento" src="/RatoAvatar/imagens/save.png" width="22px" height="22px" ></input>
								</td>							
								
							</tr>
						</table>
					</div>
			</form>

				<br/>	<br/>	<br/>



					<form>				
					

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