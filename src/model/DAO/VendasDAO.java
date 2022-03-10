package model.DAO;

import java.util.List;
import model.bo.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VendasDAO implements InterfaceDAO<Venda>{
@Override
    public void create(Venda objeto) {
        //Abrindo conexão
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO venda (serieVenda, dtVenda, hrVenda, valDescontoVenda, valTotalVenda, cliente_idcliente, condicaoPagamento_idcindicaoPagamento, diaVencimentoParcela, vendedor_idvendedor) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstm = null;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getSerie());
            pstm.setString(2, String.valueOf(objeto.getDataVenda())); //verificar se funciona
            pstm.setString(3, objeto.getHora());
            pstm.setBigDecimal(4, objeto.getDesconto());
            pstm.setBigDecimal(5, objeto.getTotal());
            pstm.setObject(6, objeto.getCliente());
            pstm.setObject(7, objeto.getCondicaoPagamento());
            pstm.setLong(8, objeto.getDiaVencimentoParcela());
            pstm.setObject(9, objeto.getVendedor());
            
            pstm.executeUpdate();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        //fechar a conexão
        ConnectionFactory.closeConnection(conexao, pstm);
    }  

    @Override
    public List<Venda> retrieve() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Venda retrieve(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Venda retrieve(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(Venda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Venda objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
