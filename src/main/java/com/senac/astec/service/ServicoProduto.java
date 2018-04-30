/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.astec.service;
import com.senac.astec.dao.ImovelDAO;
import com.senac.astec.model.Imovel;
import java.io.IOException;
import java.util.List;
//Classe de Servico de Produto
public class ServicoProduto {
    ImovelDAO imovelDAO = new ImovelDAO();
    
    public void cadastrarProduto(Imovel imovel) throws IOException {
        
        

        try {
            //Realiza a chamada de inserção na fonte de dados
            imovelDAO.inserirImovel(imovel);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
        }
    }

    //Atualiza um imovel na fonte de dados
    public void atualizarProduto(Imovel imovel) throws IOException {
        

        try {
            imovelDAO.updateImovel(imovel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public  List<Imovel> procurarProduto(String nome, int codigoempresa) throws IOException {
        try {
        return imovelDAO.listarImoveis(codigoempresa);
          
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            return null;
        }
    }

    public Imovel encontrarProdutoPorNome(String nome, int codigoempresa) throws IOException {
        try {
            return imovelDAO.encontrarImovel(nome, codigoempresa);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public Imovel encontrarProdutoPorCodigo(int codigo, int codigoempresa) throws IOException {
        try {
            return imovelDAO.encontrarImovelCodigo(codigo, codigoempresa);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    public boolean encontrarProdutoCadastro(String nome, int codigoempresa) throws IOException {
        try {
            return imovelDAO.encontrarImovelCadastro(nome, codigoempresa);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void excluirProduto(Integer codigo, int codigoempresa) throws IOException {
        try {
            imovelDAO.deletarImovel(codigo, codigoempresa);
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
    
    public void atualizaEstoque(Imovel imovel) throws IOException {
        try {
            imovelDAO.updateImovel(imovel);
        } catch (Exception e) {
            System.out.println("Erro");
        }
    }
    
    //Lista imovels de determinada empresa
    public List<Imovel> listarProdutos(int codigoempresa) throws IOException, Exception {
        try {
            return imovelDAO.listarImoveis(codigoempresa);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    //Lista imovels Totais
    public List<Imovel> listarProdutostotais() throws IOException, Exception {
        try {
            return imovelDAO.listarImoveistotais();
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
