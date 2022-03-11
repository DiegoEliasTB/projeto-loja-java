package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import view.TelaCadCliente;
import model.bo.Cliente;
import service.ClienteService;
import service.EnderecoService;

public class ControllerCadCliente implements ActionListener {
    
    TelaCadCliente telaCadCliente;
    public static int codigo;
    
    public ControllerCadCliente(TelaCadCliente telaCadCliente) {
        this.telaCadCliente = telaCadCliente;
        
        telaCadCliente.getjButtonBuscar().addActionListener(this);
        telaCadCliente.getjButtonNovo().addActionListener(this);
        telaCadCliente.getjButtonCancelar().addActionListener(this);
        telaCadCliente.getjButtonGravar().addActionListener(this);
        telaCadCliente.getjButtonSair().addActionListener(this);

        ativa(true);
        ligaDesliga(false);        
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
       
        if (acao.getSource() == telaCadCliente.getjButtonNovo()) {
            ativa(false);
            ligaDesliga(true);
            this.telaCadCliente.getjTFId().setEnabled(false);
        } else if (acao.getSource() == telaCadCliente.getjButtonCancelar()) {
            ativa(true);
            ligaDesliga(false);
        } else if (acao.getSource() == telaCadCliente.getjButtonGravar()) {
            Cliente cliente = new Cliente();
            
            EnderecoService enderecoService = new EnderecoService();
            
            cliente.setNome(this.telaCadCliente.getjTFNome().getText());
            cliente.setDtNasc(LocalDate.parse(this.telaCadCliente.getjFTFDtNasc().getText()));
            cliente.setRgCliente(this.telaCadCliente.getjFTFRG().getText());
            cliente.setCpfCliente(this.telaCadCliente.getjFTFCPF().getText());
            cliente.setFoneCliente(this.telaCadCliente.getjFTFFone1().getText());
            cliente.setFone2Cliente(this.telaCadCliente.getjFTFFone2().getText());
            cliente.setEmail(this.telaCadCliente.getjFTFEmail().getText());
            
            var enderecoId = Integer.parseInt(this.telaCadCliente.getjFTFCep().getText());
            
            cliente.setEndereco(enderecoService.buscar(enderecoId));
            
            //acionar o service da cidade passando o objeto como parametro
            ClienteService service = new ClienteService();

            if (this.telaCadCliente.getjTFId().getText().trim().equalsIgnoreCase("")) {
                service.salvar(cliente);
            } else {
                cliente.setIdCliente(Integer.parseInt(this.telaCadCliente.getjTFId().getText()));
                service.atualizar(cliente);
            }
            
            //Setar o estado do formulário
            ativa(true);
            ligaDesliga(false);
        } else if (acao.getSource() == telaCadCliente.getjButtonSair()) {
            this.telaCadCliente.dispose();
           
        } else if (acao.getSource() == telaCadCliente.getjButtonBuscar()) {
           
//            TelaBusEndereco telaBusEndereco = new TelaBusEndereco(null, true);
//            ControllerBusEndereco controllerBusendereco = new ControllerBusEndereco(telaBusEndereco);
//            telaBusEndereco.setVisible(true);
            
//            if (codigo != 0) {
//                Endereco endereco;
//                EnderecoService enderecoService = new EnderecoService();
//                endereco = enderecoService.buscar(codigo);
//
//                ativa(false);
//                ligaDesliga(true);
//
//                this.telaCadCliente.getjTFCidade().setText(endereco.getCidade().getDescricaoCidade());
//                this.telaCadCliente.getjTFBairro().setText(endereco.getBairro().getDescricaoBairro());
//                this.telaCadCliente.getjLabelLogradouro().setText(endereco.getLogradouroCep());
//            }
        } 
    }
    
    //Método para habilitar/desabilitar botões(controle de estados)
    public void ativa(boolean estado) {
        telaCadCliente.getjButtonNovo().setEnabled(estado);
        telaCadCliente.getjButtonCancelar().setEnabled(!estado);
        telaCadCliente.getjButtonGravar().setEnabled(!estado);
        telaCadCliente.getjButtonBuscar().setEnabled(estado);
        telaCadCliente.getjButtonSair().setEnabled(estado);
    }

    //Método para Ativação/Desativação/Limpeza ds 
    //Componentes do jPanelDados
    public void ligaDesliga(boolean estado) {
        Component[] componentes = this.telaCadCliente.getjPanelDados().getComponents();
        for (Component componenteAtual : componentes) {
            if (componenteAtual instanceof JTextField) {
                ((JTextField) componenteAtual).setText("");
                componenteAtual.setEnabled(estado);
            } else if (componenteAtual instanceof JFormattedTextField) {
                ((JFormattedTextField) componenteAtual).setText("");
                componenteAtual.setEnabled(estado);
            } else if (componenteAtual instanceof JComboBox) {
                ((JComboBox) componenteAtual).setSelectedIndex(0);
                componenteAtual.setEnabled(estado);
            }
        }
    }
}
