/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.DAO.TamanhoDAO;
import model.bo.Tamanho;

/**
 *
 * @author Diego
 */
public class TamanhoService {
    
    public Tamanho buscarPorId(Long idTamanho) {
        TamanhoDAO tamanhoDAO = new TamanhoDAO();
        return tamanhoDAO.buscarPorId(idTamanho);
    }
}
