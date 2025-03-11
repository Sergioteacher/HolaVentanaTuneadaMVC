/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holaventanatuneadamvc.controlHolaV;


import holaventanatuneadamvc.modeloHolaV.ModeloHolaV;
import holaventanatuneadamvc.vistaHolaV.VentanaPrincipal;

/**
 *
 * @author Sergio Teacher
 */
public class ControlHolaV {
    VentanaPrincipal localVistaV;
    ModeloHolaV localModelV;

    public ControlHolaV(VentanaPrincipal localVistaV, ModeloHolaV localModelV) {
        this.localVistaV = localVistaV;
        this.localModelV = localModelV;

        localVistaV.setVisible(true);
    }



}
