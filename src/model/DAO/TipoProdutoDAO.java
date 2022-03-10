/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.bo.TipoProduto;

/**
 *
 * @author Diego
 */
public class TipoProdutoDAO {
    public TipoProduto buscarPorId(Long idTipoProduto) {
        String sqlExecutar     =   " SELECT idtipoProduto, "
                                 + " descricaoTipoProduto "
                                 + " FROM tipoproduto "
                                 + " WHERE tipoproduto.idtipoProduto = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idTipoProduto.intValue());
            rst = pstm.executeQuery();  
            TipoProduto tipoProduto = new TipoProduto();
      
            while(rst.next()){
                tipoProduto.setIdTipoProduto(rst.getLong("idtipoProduto"));
                tipoProduto.setDescricao(rst.getString("descricaoTipoProduto"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return tipoProduto; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
}
