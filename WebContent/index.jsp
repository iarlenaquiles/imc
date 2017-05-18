<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@	page errorPage="paginaErro.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>IMC</title>
</head>
<body>
	<%@ include file="cabecalho.jsp"%>
	<form action="imc" method="post">
		Massa: <input type="text" name="massa" /> Altura: <input type="text"
			name="altura" />
		<button type="submit">Calcular</button>
	</form>

	IMC: ${imc} kg/m² <br>
	Classificação: ${classificacao}
	<br>


	<%@ include file="rodape.jsp"%>
</body>
</html>