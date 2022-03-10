/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.bo.Tamanho;

/**
 *
 * @author Diego
 */
public class TamanhoDAO {
    public Tamanho buscarPorId(Long idTamanho) {
        String sqlExecutar     =   " SELECT idtamanho, "
                                 + " descricaoTamanho "
                                 + " FROM tamanho "
                                 + " WHERE tamanho.idtamanho = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idTamanho.intValue());
            rst = pstm.executeQuery();  
            Tamanho tamanho = new Tamanho();
      
            while(rst.next()){
                tamanho.setIdTamanho(rst.getLong("idtamanho"));
                tamanho.setDescricao(rst.getString("descricaoTamanho"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return tamanho; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
}
