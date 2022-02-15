package service;

import controller.InterfaceService;
import java.util.List;
import model.DAO.EnderecoDAO;
import model.bo.Endereco;

public class EnderecoService implements InterfaceService<Endereco> {

    @Override
    public void salvar(Endereco endereco) {
        EnderecoDAO enderecoDAO = new EnderecoDAO();
        enderecoDAO.create(endereco);
    }

    @Override
    public List<Endereco> buscar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Endereco buscar(int codigo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Endereco buscar(String descricao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void atualizar(Endereco objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void apagar(Endereco objeto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    
    
}
