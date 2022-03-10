/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.DAO.ProdutoDAO;
import model.bo.Produto;

/**
 *
 * @author Diego
 */
public class ProdutoService {
    
    public Produto buscarPorId(Long idProduto) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.buscarPorId(idProduto);
    }
    
    public Produto buscarPorCodigoBarras(String codBarras) {
        ProdutoDAO dao = new ProdutoDAO();
        return dao.buscarPorCodigoBarras(codBarras);
    }
}
