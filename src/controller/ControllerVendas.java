package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import service.CaracteristicaProdutoService;
import service.ProdutoService;
import view.TelaVendas;

public class ControllerVendas implements ActionListener {
    
    TelaVendas telaVendas;
    
    public ControllerVendas(TelaVendas telaVendas) {
        this.telaVendas = telaVendas;
        this.telaVendas.getjButtonBuscaAluno().addActionListener(this);
        this.telaVendas.getjButtonBuscaPersonal().addActionListener(this);
        this.telaVendas.getjButtonBuscaProduto().addActionListener(this);
        this.telaVendas.getjTextFieldBarraProduto().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    //
                } else if (evt.getKeyCode() == KeyEvent.VK_F1) {

                    CaracteristicaProdutoService service = new CaracteristicaProdutoService();
                    var sim = service.buscarPorId(3L);
                    
                    System.out.println("sim: " + sim); //teste de serviço
                } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
                    //novoFaturamento();
                } else if (evt.getKeyCode() == KeyEvent.VK_F3) {

                } else if (evt.getKeyCode() == KeyEvent.VK_F4) {

                } else if (evt.getKeyCode() == KeyEvent.VK_F5) {
                    
                }
            }
        });
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    private void buscarProduto() {
        
    }
    
}
