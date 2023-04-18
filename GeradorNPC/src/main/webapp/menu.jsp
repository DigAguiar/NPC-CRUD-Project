<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Menu NPC Generator</title>
</head>
<body>
	<h1>Menu do criador de personagem</h1>
	<br>
	<br>

	<form action="mostrarLista" method="post">
		<button type="submit">Ir para lista</button>
	</form>
	
	<form action="adicionandoNPC" method="post">
		<button type="submit" onclick="clicado()">Gerar NPC</button>
	</form>








	<script src="scripts/click.js"></script>
</body>
</html>