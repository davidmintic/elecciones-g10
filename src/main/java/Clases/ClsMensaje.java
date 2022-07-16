/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author davidperezarias
 */
public class ClsMensaje {

    public final String OK = "OK";
    public final String ERROR = "ERROR";
    public final String ADVERTENCIA = "ADVERTENCIA";

    private String tipo;
    private String descripcion;

    public ClsMensaje() {

    }

    public void CambiarMensaje(String tipo, String descripcion) {
        this.tipo = tipo;
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    

}
