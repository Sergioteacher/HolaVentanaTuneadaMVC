/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holaventanatuneadamvc.controlHolaV;


import holaventanatuneadamvc.modeloHolaV.ModeloHolaV;
import holaventanatuneadamvc.vistaHolaV.VentanaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Teacher
 */
public class ControlHolaV implements ActionListener {
    VentanaPrincipal localVistaV;
    ModeloHolaV localModelV;

    public ControlHolaV(VentanaPrincipal localVistaV, ModeloHolaV localModelV) {
        this.localVistaV = localVistaV;
        this.localModelV = localModelV;

        escuchadores();
    }

    /**
    * Así la clase control puede escuchar los eventos
    */
    private void escuchadores(){
        localVistaV.addActionListenerBtnOk(this);
        localVistaV.addActionListenerMiPanelTuneadoHolaV(this);
    }

    public void ronronea (){
        localVistaV.setVisible(true);
    }

public void actionPerformed(ActionEvent e){
    System.out.println("e-> " + e.getActionCommand());
    switch (e.getActionCommand()){
        case "Ok!":
            casoOk();
        break;
        case "Validar":
            casoValidar();
        break;
        default:
            System.out.println("Se ha pulsado algo ...");
        }
}

    private void casoOk(){
        System.out.println("Se ha pulsado Ok");
        localVistaV.escribeTxtEstado("Hola... " + localModelV.getMicadena());
    }
    private void casoValidar(){
        //una variable temporal para ver mejor como captura los valores
        String tmp;
        System.out.println("Se ha pulsado Validar");
        tmp=localVistaV.getTextFieldCampo();
        
        System.out.println("tmp :" + localModelV.Validando(tmp));
        if (localModelV.Validando(tmp)){
            localModelV.setMicadena(tmp);
            JOptionPane.showMessageDialog(null, "Validación correcta");
        }
        else {
            JOptionPane.showMessageDialog(null, "No has puesto naaaaaa!");
            localModelV.setMicadena("");
        }

        localVistaV.setTextFieldCampo("");
    }

}
