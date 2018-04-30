
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.astec.servlet;

import com.senac.astec.model.Imovel;
import com.senac.astec.service.ServicoImovel;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ConsultaProdutoServlet", urlPatterns = {"/consultaprodutos"})
public class ConsultaProdutoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          HttpSession sessao = request.getSession();
          ArrayList<Imovel> Lista = new ArrayList();
          ServicoImovel sp = new ServicoImovel();
          String codigoempresa = (String) sessao.getAttribute("Empresa");
          
          try {
            Lista = (ArrayList<Imovel>) sp.procurarProduto("", Integer.parseInt(codigoempresa));
        } catch (Exception e) {
        }   
          sessao.setAttribute("ListaProdutos", Lista);
          
          RequestDispatcher dispatcher
	    = request.getRequestDispatcher("/consultarProduto.jsp");
    dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
