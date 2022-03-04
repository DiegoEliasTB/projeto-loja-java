package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.bo.Cidade;
import model.bo.Cliente;

public class ClienteDAO implements InterfaceDAO<Cliente> {

    @Override
    public void create(Cliente objeto) {
        //Abrindo conexão
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO cliente (nomeCliente, dtNasCliente, cpfCliente, rgCliente, foneCliente, fone2Cliente, emailCliente, compleEnderecoCliente, endereco_idcep) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ? )";
        PreparedStatement pstm = null;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getNome());
            
            pstm.setString(2, objeto.getDtNasc().toString());
            
            pstm.setString(3, objeto.getCpfCliente());
            pstm.setString(4, objeto.getRgCliente());
            pstm.setString(5, objeto.getFoneCliente());
            pstm.setString(6, objeto.getFone2Cliente());
            pstm.setString(7, objeto.getEmail());
            pstm.setString(8, objeto.getCompleEndereco());                
            
            pstm.setInt(9, objeto.getEndereco().getIdCep());
            
            pstm.executeUpdate();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        //fechar a conexão
        ConnectionFactory.closeConnection(conexao, pstm);
    }
    
    public int buscaTotal() {
         //Abrindo conexão
        
        String sqlExecutar = " SELECT COUNT(*) AS total from cliente ";

        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        int total = 0;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();     
            
            while(rst.next()){
                total = rst.getInt("total");
            }
            
            
            
            
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return total;       
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return 0;
        }
    }

    @Override
    public List<Cliente> retrieve() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente retrieve(int codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Cliente retrieve(String descricao) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void update(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(Cliente objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
