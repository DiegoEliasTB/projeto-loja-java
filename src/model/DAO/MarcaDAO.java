/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.bo.Marca;

/**
 *
 * @author Diego
 */
public class MarcaDAO {
    public Marca buscarPorId(Long idMarca) {
        String sqlExecutar     =   " SELECT idmarca, "
                                 + " descricaoMarca "
                                 + " FROM marca "
                                 + " WHERE marca.idmarca = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idMarca.intValue());
            rst = pstm.executeQuery();  
            Marca marca = new Marca();
            while(rst.next()){
                marca.setIdMarca(rst.getLong("idmarca"));
                marca.setDescricao(rst.getString("descricaoMarca"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return marca; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
}
