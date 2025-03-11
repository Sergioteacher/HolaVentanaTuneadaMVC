/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holaventanatuneadamvc;


import holaventanatuneadamvc.controlHolaV.ControlHolaV;
import holaventanatuneadamvc.modeloHolaV.ModeloHolaV;
import holaventanatuneadamvc.vistaHolaV.VentanaPrincipal;

/**
 * Clase principal del proyecto
 * @author Sergio Teacher
 */
public class HolaVentanaTuneadaMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Iniciando HolaVentanaTuneadaMVC... ");

        ModeloHolaV mHolaV = new ModeloHolaV();
        VentanaPrincipal VV = new VentanaPrincipal();
        ControlHolaV cHolaV = new ControlHolaV(VV, mHolaV);

        cHolaV.ronronea();
    }
    
}
