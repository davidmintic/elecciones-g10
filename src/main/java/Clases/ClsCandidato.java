package Clases;

import java.util.LinkedList;

/**
 *
 * @author davidperezarias
 */
public class ClsCandidato extends ClsPersona {

    private String partidoPolitico;
    private String descripcion;
    private String mensajeCampania;
    private String ciudadorigen;
    private LinkedList<ClsPropuesta> propuestas;

    public ClsCandidato(String partidoPolitico, String descripcion, String numeroDocumento, String nombre, String telefono, String correo) {
        super(numeroDocumento, nombre, telefono, correo);
        this.partidoPolitico = partidoPolitico;
        this.descripcion = descripcion;
        this.propuestas = new LinkedList<>();
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public String getCiudadorigen() {
        return ciudadorigen;
    }

    public void setCiudadorigen(String ciudadorigen) {
        this.ciudadorigen = ciudadorigen;
    }

    public LinkedList<ClsPropuesta> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<ClsPropuesta> propuestas) {
        this.propuestas = propuestas;
    }

}
