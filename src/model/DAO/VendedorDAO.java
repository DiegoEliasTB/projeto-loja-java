/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.bo.Cor;
import model.bo.Vendedor;
import service.EnderecoService;

/**
 *
 * @author Diego
 */
public class VendedorDAO {
    public Vendedor buscarPorId(Long idVendedor) {
        String sqlExecutar     =   " SELECT idvendedor, "
                                 + " nomeVendedor, "
                                 + " cpfVendedor, "
                                 + " emailVendedor, "
                                 + " foneVendedor, "
                                 + " fone2Vendedor, "
                                 + " percentComissaoVenda, "
                                 + " percentComissaoRecebto, "
                                 + " compleEnderecoVendedor, "
                                 + " endereco_idcep "
                                 + " FROM vendedor "
                                 + " WHERE vendedor.idvendedor = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try {
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, idVendedor.intValue());
            rst = pstm.executeQuery();  
            Vendedor vendedor = new Vendedor();
            while(rst.next()){
                vendedor.setIdVendedor(rst.getLong("idvendedor"));
                vendedor.setNome(rst.getString("nomeVendedor"));
                vendedor.setCpf(rst.getString("cpfVendedor"));
                vendedor.setEmail(rst.getString("emailVendedor"));
                vendedor.setTelefone1(rst.getString("foneVendedor"));
                vendedor.setTelefone2(rst.getString("fone2Vendedor"));
                vendedor.setPercentualComissao(rst.getBigDecimal("percentComissaoVenda"));
                vendedor.setPercentualRecebido(rst.getBigDecimal("percentComissaoRecebto"));
                vendedor.setCompleEndereco(rst.getString("compleEnderecoVendedor"));
                
                EnderecoService enderecoService = new EnderecoService();
                System.out.println("cep: " + vendedor.getEndereco());
                System.out.println("será?: " + rst.getInt("endereco_idcep"));
                var cep = enderecoService.buscar(rst.getInt("endereco_idcep"));
                System.out.println("cep: " + cep);
                vendedor.setEndereco(cep);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return vendedor; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }
}
