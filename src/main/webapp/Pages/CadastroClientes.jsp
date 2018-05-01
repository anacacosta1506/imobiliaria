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
                    <form action = "CadastroClientes" method = "GET">
			<div class="form-header">CADASTRO DE CLIENTES</div>
			<div class="form-content">
				<div class="form-block-row">
                            <div>
                              <label>Nome:</label>
                              <input type="text" id="nome">
                            </div>
                            <div>
                              <label>Data de Nascimento:</label>
                              <input type="text" id="dataNasc">
                            </div>
                            <div>
                              <label>RG:</label>
                              <input type="text" id="rg">
                            </div>
                            <div>
                              <label>CPF:</label>
                              <input type="text" id="cpf">
                            </div>
                            <div>
                              <label>Sexo:</label>
                              <select>
                                <option value="selecione">Selecione</option>
                                <option value="feminino">Feminino</option>
                                <option value="masculino">Masculino</option>
                              </select>
                            </div>
                            <div>
                              <label>Telefone:</label>
                              <input type="text" id="telefone">
                            </div>
                            <div>
                              <label>Celular:</label>
                              <input type="text" id="celular">
                            </div>
                            <div>
                              <label>E-mail:</label>
                              <input type="text" id="email">
                            </div>
                            <div>
                              <label>CEP:</label>
                              <input type="text" id="cep">
                            </div>
                            <div>
                              <label>Logradouro:</label>
                              <input type="text" id="logradouro">
                            </div>
                            <div>
                              <label>Número:</label>
                              <input type="text" id="numero">
                            </div>
                            <div>
                              <label>Complemento:</label>
                              <input type="text" id="complemento">
                            </div>
                            <div>
                              <label>Bairro:</label>
                              <input type="text" id="bairro">
                            </div>
                            <div>
                              <label>Cidade:</label>
                              <input type="text" id="cidade">
                            </div>
                            <div>
                              <label>Estado:</label>
                              <input type="text" id="estado">
                            </div>                            
  			</div>
  			<div class="form-block-row">
          <div>
            <label>Email:</label>
            <input type="text" >
          </div>
          <div>
            <label>CPF(opcional):</label>
            <input type="text" >
          </div>
          <div>
            <label>Gênero:</label>
            <input type="text" >
          </div>
  			</div>
  			</div>
  			<div class="form-button">
                            <button type="submit">Salvar</button>
  			</div>
                    </form>
		</div>
	</div>
</body>
</html>
