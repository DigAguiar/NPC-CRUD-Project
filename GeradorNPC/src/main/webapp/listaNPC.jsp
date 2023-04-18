<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Mostruario</title>
</head>
<body>
	<h1>Lista de NPC's:</h1>
	<br>
	<div align="left">
		<c:forEach items="${listaNPC}" var="npc">
			<ul>
				<li>Raça: ${npc.raca}</li>
				<li>Idade: ${npc.idade}</li>
				<li>Alinhamento: ${npc.alinhamento}</li>
				<li>Atributo alto: ${npc.atributoAlto}</li>
				<li>Atributo baixo${npc.atributoBaixo}</li>
				<li>Estilo de combate: ${npc.estiloCombate}</li>
				<h3>________________________________ </h3>

			</ul>

		</c:forEach>



	</div>


</body>
</html>