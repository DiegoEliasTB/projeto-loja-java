/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.bo.Cor;

/**
 *
 * @author Diego
 */
public class CorDAO {
    public Cor buscarPorId(Long idCor) {
        String sqlExecutar     =   " SELECT idcor, "
                                 + " descricaoCor "
                                 + " FROM cor "
                                 + " WHERE cor.idcor = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idCor.intValue());
            rst = pstm.executeQuery();  
            Cor cor = new Cor();
            while(rst.next()){
                cor.setIdCor(rst.getLong("idcor"));
                cor.setDescricao(rst.getString("descricaoCor"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return cor; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
}
