<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="../Styles/Login.css">
	<link rel="stylesheet" type="text/css" href="../Styles/Cadastros.css">
	<meta charset="utf-8">
	<title>Cadastro de Imóveis</title>
</head>
<body>
	<div class="application-container">
		<div class="form-container">
			<div class="form-header">CADASTRO DE IMÓVEIS</div>
			<div class="form-content">
				<div class="form-block">
				<label>Nome:</label>
				<input type="text" id="nome">
				<label>CEP:</label>
				<input type="text" id="cep">
				<label>Logradouro:</label>
				<input type="text" id="logradouro">
				<label>Número:</label>
				<input type="text" id="numero">
				<label>Complemento:</label>
				<input type="text" id="complemento">				
				<label>Bairro:</label>
				<input type="text" id="bairro">
				<label>Estado:</label>
				<input type="text" id="estado">
				<label>Descrição:</label>
				<input type="text" id="descricao">
			</div>
			<div class="form-block-row">
				<div>
					<p>Nº Dorm:</p>
					<input class="spinner" type="number" id="numDorm">
				</div>
				<div>
					<p>Tamanho:</p>
					<input type="text" id="tamanho">
				</div>
				<div>
					<p>Vagas:</p>
					<input class="spinner" type="number" id="vagas">
				</div>
			</div>
			<div class="form-block">
				<label>Andar:</label>
				<input type="text" id="andar">
				<label>Mobiliado:</label>
				<input type="checkbox" name="mobiliado" value="sim">Sim
				<label>Aceita pets:</label>
				<input type="checkbox" name="pets" value="sim">Sim
			</div>
			<div class="form-block">
				<label>Aluguel/Compra:</label>
				<input type="radio" name="tipoImovel" value="aluguel"> Aluguel<br>
  				<input type="radio" name="tipoImovel" value="venda">Venda
  				<label>Valor:</label>
				<input type="text" id="valor">
				<label>Condominio:</label>
				<input type="text" id="condominio">
				<label>IPTU:</label>
				<input type="text" id="iptu">
				<label>Seguro:</label>
				<input type="text" id="seguro">
				<label>Parcela:</label>
				<input type="radio" name="parcelaImovel" value="sim"> Sim<br>
  				<input type="radio" name="parcelaImovel" value="nao">Não
  				<label>Valor da entrada:</label>
				<input type="text" id="valorEntrada">
				
			</div>
			</div>
			<div class="form-button">
				<button>Salvar</button>
			</div>
		</div>
	</div>
</body>
</html>
