/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.senac.astec.servlet;

import com.senac.astec.model.Cliente;
import com.senac.astec.model.ItemVenda;
import com.senac.astec.model.Imovel;
import com.senac.astec.model.Venda;
import com.senac.astec.service.ServicoCliente;
import com.senac.astec.service.ServicoItemVenda;
import com.senac.astec.service.ServicoImovel;
import com.senac.astec.service.ServicoVenda;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "VendaServlet", urlPatterns = {"/finalizarvenda"})
public class VendaServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

}
