package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;
import service.BairroService;
import service.CidadeService;

public class EnderecoDAO implements InterfaceDAO<Endereco> {

    @Override
    public void create(Endereco objeto) {
        //Abrindo conexão
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = "INSERT INTO endereco (cepCep, logradouroCep, bairro_idbairro, cidade_idcidade) VALUES(?,?,?,?)";
        PreparedStatement pstm = null;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCepCep());
            pstm.setString(2, objeto.getLogradouroCep());
            pstm.setInt(3, objeto.getBairro().getIdBairro());
            pstm.setInt(4, objeto.getCidade().getIdCidade());
            
            pstm.executeUpdate();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        //fechar a conexão
        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public List<Endereco> retrieve() {
        String sqlExecutar     =   " SELECT idcep, "
                                 + " cepCep, "
                                 + " logradouroCep, "
                                 + " cidade_idcidade, "
                                 + " bairro_idbairro "
                                 + " FROM endereco";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        List<Endereco> enderecos = new ArrayList<>();
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            rst = pstm.executeQuery();   
            
            BairroService bairroService = new BairroService();
            CidadeService cidadeService = new CidadeService();
            
            while(rst.next()){ 
                Endereco endereco = new Endereco();
                
                endereco.setIdCep(rst.getInt("idcep"));
                endereco.setCepCep(rst.getString("cepCep"));
                endereco.setLogradouroCep(rst.getString("logradouroCep")); 
                endereco.setCidade(cidadeService.buscar(rst.getInt("cidade_idcidade")));
                endereco.setBairro(bairroService.buscar(rst.getInt("bairro_idbairro")));
                
                enderecos.add(endereco);
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return enderecos;       
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public Endereco retrieve(int codigo) {
        String sqlExecutar     =   " SELECT idcep, "
                                 + " cepCep, "
                                 + " logradouroCep, "
                                 + " cidade_idcidade, "
                                 + " bairro_idbairro "
                                 + " FROM endereco"
                                 + " WHERE idcep = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setInt(1, codigo);
            
            rst = pstm.executeQuery();         
            
            Endereco endereco = new Endereco();
            BairroService bairroService = new BairroService();
            CidadeService cidadeService = new CidadeService();
                
            while(rst.next()){
                endereco.setIdCep(rst.getInt("idcep"));
                endereco.setCepCep(rst.getString("cepCep"));
                endereco.setLogradouroCep(rst.getString("logradouroCep")); 
                System.out.println("retorno banco cidade: " + rst.getInt("cidade_idcidade") );
                var cidade = cidadeService.buscar(rst.getInt("cidade_idcidade"));
                
                System.out.println("service com cidade: " + cidade );
                
                endereco.setCidade(cidadeService.buscar(rst.getInt("cidade_idcidade")));
                endereco.setBairro(bairroService.buscar(rst.getInt("bairro_idbairro")));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return endereco;       
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public Endereco retrieve(String descricao) {
        String sqlExecutar     =   " SELECT idcep, "
                                 + " cepCep, "
                                 + " logradouroCep, "
                                 + " cidade_idcidade, "
                                 + " bairro_idbairro "
                                 + " FROM endereco"
                                 + " WHERE cepCep = ?";
        
        Connection conexao     = ConnectionFactory.getConnection();
        PreparedStatement pstm = null;
        ResultSet rst          = null;
        
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, descricao);
            rst = pstm.executeQuery();  
            
            Endereco endereco = new Endereco();
            BairroService bairroService = new BairroService();
            CidadeService cidadeService = new CidadeService();
            
            while(rst.next()){
                endereco.setIdCep(rst.getInt("idcep"));
                endereco.setCepCep(rst.getString("cepCep"));
                endereco.setLogradouroCep(rst.getString("logradouroCep")); 
                endereco.setCidade(cidadeService.buscar(rst.getInt("cidade_idcidade")));
                endereco.setBairro(bairroService.buscar(rst.getInt("bairro_idbairro")));
            }
            ConnectionFactory.closeConnection(conexao, pstm, rst);

            return endereco; 
        } catch(Exception ex){
            ex.printStackTrace();
            ConnectionFactory.closeConnection(conexao, pstm, rst);
            return null;
        }
    }

    @Override
    public void update(Endereco objeto) {
        Connection conexao = ConnectionFactory.getConnection();
        String sqlExecutar = " UPDATE endereco "
                           + " SET cepCep      = ? ,"
                           + " logradouroCep   = ? ,"
                           + " cidade_idcidade = ? ,"
                           + " bairro_idbairro = ? "
                           
                           + " WHERE endereco.idcep = ? ";
        PreparedStatement pstm = null;
        
        BairroService bairroService = new BairroService();
        CidadeService cidadeService = new CidadeService();
            
        try{
            pstm = conexao.prepareStatement(sqlExecutar);
            pstm.setString(1, objeto.getCepCep());
            pstm.setString(2, objeto.getLogradouroCep());
            pstm.setInt(3, objeto.getCidade().getIdCidade());
            pstm.setInt(4, objeto.getBairro().getIdBairro());
            pstm.setInt(5, objeto.getIdCep());
            pstm.executeUpdate();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        ConnectionFactory.closeConnection(conexao, pstm);
    }

    @Override
    public void delete(Endereco objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
