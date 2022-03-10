/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.bo.Produto;

/**
 *
 * @author Diego
 */
public class ProdutoDAO {
 
 
    public Produto buscarPorId(Long idProduto) {
        String sqlExecutar     =   " SELECT idproduto, "
                                 + " descricaoProduto, "
                                 + " valProduto, "
                                 + " marca_idmarca, "
                                 + " tipoProduto_idtipoProduto, "
                                 + " tamanho_idtamanho "
                                 + " FROM produto "
                                 + " WHERE produto.idproduto = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idProduto.intValue());
            rst = pstm.executeQuery();  
            Produto produto = new Produto();
            while(rst.next()){
                produto.setIdProduto(rst.getLong("idproduto"));
                produto.setDescricao(rst.getString("descricaoProduto"));
                produto.setValor(rst.getBigDecimal("valProduto"));
                //produto.setMarca(rst.getO("marca_idmarca")); fazer marca
                //produto.setTipoProduto(rst.getString("tipoProduto_idtipoProduto"));
                //produto.setDescricao(rst.getString("tamanho_idtamanho"));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            //return cidade; 
            return null;
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
//    public Cidade retrieve(int codigo) {
//        String sqlExecutar     =   " SELECT idcidade, "
//                                 + " descricaoCidade, "
//                                 + " ufCidade "
//                                 + " FROM cidade "
//                                 + " WHERE cidade.idcidade = ?";
//        Connection conexao     = ConnectionFactory.getConnection();
//        PreparedStatement pstm = null;
//        ResultSet rst          = null;
//        
//        try{
//            pstm = conexao.prepareStatement(sqlExecutar);
//            pstm.setInt(1, codigo);
//            rst = pstm.executeQuery();  
//            Cidade cidade = new Cidade();
//            while(rst.next()){
//                cidade.setIdCidade(rst.getInt("idcidade"));
//                cidade.setDescricaoCidade(rst.getString("descricaoCidade"));
//                cidade.setUfCidade(rst.getString("ufCidade"));
//            }
//            ConnectionFactory.closeConnection(conexao, pstm, rst);
//            return cidade; 
//        } catch(Exception ex){
//            ex.printStackTrace();
//            ConnectionFactory.closeConnection(conexao, pstm, rst);
//            return null;
//        }
//    }
}
