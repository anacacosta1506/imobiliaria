/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.astec.dao;

import com.senac.astec.model.ItemVenda;
import com.senac.astec.utils.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ItemVendaDAO {
    
        ConexaoBanco conexaoBanco = new ConexaoBanco();    
        Connection conn = conexaoBanco.createConnection();
    
    //Cadastra um novo item na venda
    public void cadastrarItemVenda(int idVenda, int idImovel, int quantidade){
                 String query = " INSERT INTO itemvenda (idVenda, idImovel, quantidade)"
        + " values (?, ?, ?)";
                
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, idVenda);
            preparedStatement.setInt(2, idImovel);
            preparedStatement.setInt(3, quantidade);

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao salvar venda");
        }
    }
    
    //Lista itens de determinada venda
    public List<ItemVenda> listarItemVenda(int codigovenda){ //retorna todos itens
        List<ItemVenda> lista = new ArrayList<>();
        System.out.println("Buscando produto na base de dados...");
        String query = "Select v.codigovenda as codigovenda, p.codigo as codigoproduto,p.nome, p.descricao as descricao,\n" +
                       "       c.nome as categoria, v.quantidade, p.precovenda from itemvenda as v\n" +
                       "       inner join produtos p on p.CODIGO = v.CODIGOPRODUTO\n" +
                       "       inner join categoria c on c.CODIGO = p.CODIGOCATEGORIA\n" +
                       "where codigovenda = ?";
        
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setInt(1, codigovenda);
            
            ResultSet rs = preparedStatement.executeQuery();

            
                while (rs.next()){
                    ItemVenda itemvenda = new ItemVenda();
                    itemvenda.setCodigoVenda(rs.getInt(1));
                    itemvenda.setCodigoProduto(rs.getInt(2));
                    itemvenda.setNomeproduto(rs.getString(3));
                    itemvenda.setDescricaoproduto(rs.getString(4));
                    itemvenda.setNomecategoria(rs.getString(5));
                    itemvenda.setQuantidade(rs.getInt(6));
                    itemvenda.setPrevovenda(rs.getDouble(7));
                    lista.add(itemvenda);
                }

            System.out.println("Busca efetuada com sucesso");
        } catch (SQLException ex) {
            System.out.println("Erro ao buscar Itens da venda: "+ex);
        }        
        return lista;
    
    }
}
