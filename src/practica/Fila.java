/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

/**
 *
 * @Autor Alumnos
 */
public class Fila {
    
    private String institucion, nombre, primerAp, segundoAp, telefono, tipoPers, nombreCargo, nombreCargoSup, 
            unidadAdmin, clavePuesto, nombrePuesto, tipoVacancia, telefonoDir, conmutador, ext, fax, correo;

    /**
     * @return the institucion
     */
    public Fila(String institucion, String nombre, String primerAp, String segundoAp, String telefono, String tipoPers, String nombreCargo, String nombreCargoSup, 
            String unidadAdmin, String clavePuesto, String nombrePuesto, String tipoVacancia, String telefonoDir, String conmutador, String ext, String fax, String correo){
        this.institucion=institucion;
        this.nombre=nombre;
        this.primerAp=primerAp;
        this.segundoAp=segundoAp;
        this.telefono=telefono;
        this.tipoPers=tipoPers;
        this.nombreCargo=nombreCargo;
        this.nombreCargoSup=nombreCargoSup;
        this.unidadAdmin=unidadAdmin;
        this.clavePuesto=clavePuesto;
        this.nombrePuesto= nombrePuesto;
        this.tipoVacancia= tipoVacancia;
        this.telefonoDir=telefonoDir;
        this.conmutador=conmutador;
        this.ext=ext;
        this.fax=fax;
        this.correo=correo;

    }
    public String getInstitucion() {
        return institucion;
    }

    /**
     * @param institucion the institucion to set
     */
    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerAp
     */
    public String getPrimerAp() {
        return primerAp;
    }

    /**
     * @param primerAp the primerAp to set
     */
    public void setPrimerAp(String primerAp) {
        this.primerAp = primerAp;
    }

    /**
     * @return the segundoAp
     */
    public String getSegundoAp() {
        return segundoAp;
    }

    /**
     * @param segundoAp the segundoAp to set
     */
    public void setSegundoAp(String segundoAp) {
        this.segundoAp = segundoAp;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the tipoPers
     */
    public String getTipoPers() {
        return tipoPers;
    }

    /**
     * @param tipoPers the tipoPers to set
     */
    public void setTipoPers(String tipoPers) {
        this.tipoPers = tipoPers;
    }

    /**
     * @return the nombreCargo
     */
    public String getNombreCargo() {
        return nombreCargo;
    }

    /**
     * @param nombreCargo the nombreCargo to set
     */
    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    /**
     * @return the nombreCargoSup
     */
    public String getNombreCargoSup() {
        return nombreCargoSup;
    }

    /**
     * @param nombreCargoSup the nombreCargoSup to set
     */
    public void setNombreCargoSup(String nombreCargoSup) {
        this.nombreCargoSup = nombreCargoSup;
    }

    /**
     * @return the unidadAdmin
     */
    public String getUnidadAdmin() {
        return unidadAdmin;
    }

    /**
     * @param unidadAdmin the unidadAdmin to set
     */
    public void setUnidadAdmin(String unidadAdmin) {
        this.unidadAdmin = unidadAdmin;
    }

    /**
     * @return the clavePuesto
     */
    public String getClavePuesto() {
        return clavePuesto;
    }

    /**
     * @param clavePuesto the clavePuesto to set
     */
    public void setClavePuesto(String clavePuesto) {
        this.clavePuesto = clavePuesto;
    }

    /**
     * @return the nombrePuesto
     */
    public String getNombrePuesto() {
        return nombrePuesto;
    }

    /**
     * @param nombrePuesto the nombrePuesto to set
     */
    public void setNombrePuesto(String nombrePuesto) {
        this.nombrePuesto = nombrePuesto;
    }

    /**
     * @return the tipoVacancia
     */
    public String getTipoVacancia() {
        return tipoVacancia;
    }

    /**
     * @param tipoVacancia the tipoVacancia to set
     */
    public void setTipoVacancia(String tipoVacancia) {
        this.tipoVacancia = tipoVacancia;
    }

    /**
     * @return the telefonoDir
     */
    public String getTelefonoDir() {
        return telefonoDir;
    }

    /**
     * @param telefonoDir the telefonoDir to set
     */
    public void setTelefonoDir(String telefonoDir) {
        this.telefonoDir = telefonoDir;
    }

    /**
     * @return the conmutador
     */
    public String getConmutador() {
        return conmutador;
    }

    /**
     * @param conmutador the conmutador to set
     */
    public void setConmutador(String conmutador) {
        this.conmutador = conmutador;
    }

    /**
     * @return the ext
     */
    public String getExt() {
        return ext;
    }

    /**
     * @param ext the ext to set
     */
    public void setExt(String ext) {
        this.ext = ext;
    }

    /**
     * @return the fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String toString(){
        return institucion+"||"+ nombre+ primerAp+ segundoAp+ telefono+ tipoPers+ nombreCargo+ nombreCargoSup+ 
            unidadAdmin+ clavePuesto+ nombrePuesto+ tipoVacancia+ telefonoDir+ conmutador+ ext+ fax+ correo;
    }

}
