package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import model.bo.Bairro;
import model.bo.Cidade;
import model.bo.Endereco;
import service.EnderecoService;
import view.TelaCadEndereco;

public class ControllerCadEndereco implements ActionListener {
    
    TelaCadEndereco telaCadEndereco;
    public static int codigo;
    
    public ControllerCadEndereco(TelaCadEndereco telaCadEndereco) {
        this.telaCadEndereco = telaCadEndereco;

        telaCadEndereco.getjButtonBuscar().addActionListener(this);
        telaCadEndereco.getjButtonNovo().addActionListener(this);
        telaCadEndereco.getjButtonCancelar().addActionListener(this);
        telaCadEndereco.getjButtonGravar().addActionListener(this);
        telaCadEndereco.getjButtonSair().addActionListener(this);

        ativa(true);
        ligaDesliga(false);
    }

    @Override
    public void actionPerformed(ActionEvent acao) {
        if (acao.getSource() == telaCadEndereco.getjButtonNovo()) {
            ativa(false);
            ligaDesliga(true);
            //this.telaCadEndereco.getjTFIdCidade().setEnabled(false);
        } else if (acao.getSource() == telaCadEndereco.getjButtonCancelar()) {
            ativa(true);
            ligaDesliga(false);
        } else if (acao.getSource() == telaCadEndereco.getjButtonGravar()) {
            
            //montar um objeto do tipo cidade
            Endereco endereco = new Endereco();
            endereco.setCepCep(this.telaCadEndereco.getjTFCep().getText());
            endereco.setLogradouroCep(this.telaCadEndereco.getjTFLogradouro().getText());
            endereco.setCidade((Cidade) this.telaCadEndereco.getjCBCidade().getSelectedItem());
            endereco.setBairro((Bairro) this.telaCadEndereco.getjCBBairro().getSelectedItem());
            
            
            
            //acionar o service da cidade passando o objeto como parametro
            EnderecoService enderecoSevice = new EnderecoService();

            if (this.telaCadEndereco.getjTFIdEndereco().getText().trim().equalsIgnoreCase("")) {
                enderecoSevice.salvar(endereco);
            } else {
                endereco.setIdCep(Integer.parseInt(this.telaCadEndereco.getjTFIdEndereco().getText()));
//                endereco.atualizar(endereco);
            }
            
            //Setar o estado do formulário
            ativa(true);
            ligaDesliga(false);
        } else if (acao.getSource() == telaCadEndereco.getjButtonBuscar()) {
            codigo = 0;
            //chamada da tela da busca
//            TelaBusCidade telaBusCidade = new TelaBusCidade(null, true);
//            ControllerBusCidade controllerBusCidade = new ControllerBusCidade(telaBusCidade);
//            telaBusCidade.setVisible(true);

//            if (codigo != 0) {
//                Cidade cidade;
//                CidadeService cidadeService = new CidadeService();
//                cidade = cidadeService.buscar(codigo);
//
                ativa(false);
                ligaDesliga(true);
//
//                this.telaCadEndereco.getjTFIdCidade().setText(cidade.getIdCidade() + "");
//                this.telaCadEndereco.getjTFNomeCidade().setText(cidade.getDescricaoCidade());
//                this.telaCadEndereco.getjTFUF().setText(cidade.getUfCidade());
//
//                this.telaCadEndereco.getjTFIdCidade().setEnabled(false);
//            }
        } else if (acao.getSource() == telaCadEndereco.getjButtonSair()) {
        }
    }
    
    //Método para habilitar/desabilitar botões(controle de estados)
    public void ativa(boolean estado) {
        telaCadEndereco.getjButtonNovo().setEnabled(estado);
        telaCadEndereco.getjButtonCancelar().setEnabled(!estado);
        telaCadEndereco.getjButtonGravar().setEnabled(!estado);
        telaCadEndereco.getjButtonBuscar().setEnabled(estado);
        telaCadEndereco.getjButtonSair().setEnabled(estado);
    }
    
    
    //Método para Ativação/Desativação/Limpeza ds 
    //Componentes do jPanelDados
    public void ligaDesliga(boolean estado) {
        Component[] componentes = this.telaCadEndereco.getjPanelDados().getComponents();
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
