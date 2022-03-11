/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.DAO.CondicaoPagamentoDAO;
import model.bo.CondicaoPagamento;

/**
 *
 * @author Diego
 */
public class CondicaoPagamentoService {
    public CondicaoPagamento buscarPorId(Long idCondicaoPagamento) {
        CondicaoPagamentoDAO dao = new CondicaoPagamentoDAO();
        return dao.buscarPorId(idCondicaoPagamento);
    }
}
