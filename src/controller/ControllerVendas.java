package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaVendas;

public class ControllerVendas implements ActionListener {
    
    TelaVendas telaVendas;
    
    public ControllerVendas(TelaVendas telaVendas) {
        this.telaVendas = telaVendas;
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
