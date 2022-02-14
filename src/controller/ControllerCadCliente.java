package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.TelaCadCliente;

public class ControllerCadCliente implements ActionListener {
    
    TelaCadCliente telaCadCliente;
    public static int codigo;
    
    public ControllerCadCliente(TelaCadCliente telaCadCliente) {
        this.telaCadCliente = telaCadCliente;
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
