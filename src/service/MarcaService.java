/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.DAO.MarcaDAO;
import model.bo.Marca;

/**
 *
 * @author Diego
 */
public class MarcaService {
    public Marca buscarPorId(Long idProduto) {
        MarcaDAO marcaDAO = new MarcaDAO();
        return marcaDAO.buscarPorId(idProduto);
    }
}
