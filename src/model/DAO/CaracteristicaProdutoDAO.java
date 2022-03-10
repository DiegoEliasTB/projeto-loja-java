/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.bo.CaracteristicaProduto;
import service.ProdutoService;

/**
 *
 * @author Diego
 */
public class CaracteristicaProdutoDAO {
 
 
    public CaracteristicaProduto buscarPorId(Long idCaracteristicaProduto) {
        String sqlExecutar     =   " SELECT idCaracteristicaProduto, "
                                 + " produto_idproduto, "
                                 + " cor_idcor, "
                                 + " tamanhoProduto, "
                                 + " barraProduto, "
                                 + " qtdEstoqueProduto "
                                 + " FROM caracteristicaproduto "
                                 + " WHERE caracteristicaproduto.idCaracteristicaProduto = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idCaracteristicaProduto.intValue());
            rst = pstm.executeQuery();  
            CaracteristicaProduto caracteristicaProduto = new CaracteristicaProduto();
            
            ProdutoService produtoService = new ProdutoService();
            
            while(rst.next()){
                caracteristicaProduto.setIdCaracteristicaProduto(rst.getLong("idCaracteristicaProduto"));
                
                final var produto = rst.getLong("produto_idproduto");
                caracteristicaProduto.setProduto(produtoService.buscarPorId(produto));
                

            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return caracteristicaProduto; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
}
