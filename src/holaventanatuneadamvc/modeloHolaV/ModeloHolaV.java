/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holaventanatuneadamvc.modeloHolaV;

/**
 * Datos ...
 * @author Sergio Teacher
 */
public class ModeloHolaV {
    private String Micadena="";

    public String getMicadena() {
        return Micadena;
    }

    public void setMicadena(String Micadena) {
        this.Micadena = Micadena;
    }

    public boolean Validando(String s){
        boolean ttmp=true;
        if (s.length()>0){
            ttmp=true;
        }else{
            ttmp=false;
        }

        return ttmp;
    }
}
