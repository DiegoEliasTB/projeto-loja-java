package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import javax.swing.table.DefaultTableModel;
import service.CaracteristicaProdutoService;
import service.ProdutoService;
import view.TelaVendas;

public class ControllerVendas implements ActionListener {
    
    TelaVendas telaVendas;
    ProdutoService service = new ProdutoService();
    Long itens = 0L;
    BigDecimal totalVenda = new BigDecimal(0L);
    
    public ControllerVendas(TelaVendas telaVendas) {
        this.telaVendas = telaVendas;
        this.telaVendas.getjButtonBuscaAluno().addActionListener(this);
        this.telaVendas.getjButtonBuscaProduto().addActionListener(this);
        this.telaVendas.getjTextFieldBarraProduto().addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
                    //
                } else if (evt.getKeyCode() == KeyEvent.VK_F1) {
                    
                    //Variáveis para grid
                    Long idProduto = 0L;
                    String nomeProduto = "";
                    Long qtdItens = 0L;
                    BigDecimal valorProduto = new BigDecimal(0L);
                    BigDecimal subTotal = new BigDecimal(0L);
                    
                    itens++;
                                   
                    var campo = telaVendas.getjTextFieldBarraProduto().getText();
                    
                    var codigoBarras = campo.substring(2,15);
                    
                    var produto = service.buscarPorCodigoBarras(codigoBarras);
                    
                    idProduto = produto.getIdProduto();
                    
                    nomeProduto = produto.getDescricao();
                    
                    qtdItens = Long.valueOf(campo.substring(0,1));
                    
                    valorProduto = produto.getValor();

                    subTotal = valorProduto.multiply(BigDecimal.valueOf(qtdItens));
                        
                    totalVenda = totalVenda.add(subTotal);
                    
                    DefaultTableModel tabela = (DefaultTableModel) telaVendas.getjTableItens().getModel();
                    tabela.addRow(new Object[]{
                        itens,
                        idProduto,
                        nomeProduto,
                        qtdItens,
                        valorProduto,
                        subTotal
                    });
                    
                    telaVendas.getjLabelTotal().setText("R$ " + String.valueOf(totalVenda));
                    
                } else if (evt.getKeyCode() == KeyEvent.VK_F2) {
                    
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
}
