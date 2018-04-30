
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.astec.servlet;

import com.senac.astec.model.Cliente;
import com.senac.astec.service.ServicoCliente;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ConsultaClienteServlet", urlPatterns = {"/consultacliente"})
public class ConsultaClienteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          HttpSession sessao = request.getSession();  
          ArrayList<Cliente> Lista = new ArrayList();
          ServicoCliente sc = new ServicoCliente();
          String codigoempresa = (String) sessao.getAttribute("Empresa");
          
          try {
            Lista = (ArrayList<Cliente>) sc.procurarCliente("", Integer.parseInt(codigoempresa));
        } catch (Exception e) {
        }
        
          sessao.setAttribute("ListaClientes", Lista);
          
          RequestDispatcher dispatcher
	    = request.getRequestDispatcher("/consultarCliente.jsp");
    dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}
