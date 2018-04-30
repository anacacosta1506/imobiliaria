    /*
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.astec.service;
import com.senac.astec.dao.UsuarioDAO;
import com.senac.astec.model.Cliente;
import com.senac.astec.model.Login;
import java.io.IOException;
import java.util.List;

public class ServicoUsuario {
     UsuarioDAO usuarioDAO = new UsuarioDAO();
     

    public void cadastrarUsuario(Login usuario) throws IOException, Exception {


        try {
            usuarioDAO.inserirUsuario(usuario);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarUsuario(int idLogin, String nome, String login, String senha, String tipoLogin)
            throws IOException, Exception {
        
        try {
            usuarioDAO.updateUsuario(idLogin, nome, login, senha, tipoLogin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Login> listarUsuarios(String nome, int empresa) throws IOException, Exception {
        try {
            return usuarioDAO.listarUsuario(nome, empresa);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
            
        }
    }
    
    public Login retornaUsuario(int idLogin, String login) throws IOException{
        try {
            return usuarioDAO.encontrarUmUsuario(idLogin, login);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public boolean retornaUsuario(String login) throws IOException{
        try {
            return usuarioDAO.encontrarUsuarioNome(login);
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Login retornaUsuarioLogin(String login, String senha, int empresa) throws IOException{
        try {
            return usuarioDAO.encontrarUsuario(login, senha);
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void excluirUsuario(int idLogin) throws IOException, Exception {
        try {
            usuarioDAO.deletarUsuario(idLogin);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
