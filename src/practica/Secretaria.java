/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.Charset;
/**
 *
 * @author Alumnos
 */
public class Secretaria {
    private String[] cabecera;
    private boolean cargado=false;
    public  void importar(Fila[] arreglo){
         
        String institucion, nombre, primerAp, segundoAp, telefono, tipoPers, nombreCargo, nombreCargoSup, 
            unidadAdmin, clavePuesto, nombrePuesto, tipoVacancia, telefonoDir, conmutador, ext, fax, correo;
        String userDir = System.getProperty("user.dir");
        try{
         
         CsvReader datos_import = new CsvReader( System.getProperty("user.dir")+"/src/directoriopot 2.csv");  
         datos_import.readHeaders();
         cabecera=datos_import.getHeaders();
         int i=0;
         
         while (datos_import.readRecord()){
              institucion=datos_import.get(0);
              nombre=datos_import.get(1);
              primerAp=datos_import.get(2);
              segundoAp=datos_import.get(3);
              telefono=datos_import.get(4);
              tipoPers=datos_import.get(5);
              nombreCargo=datos_import.get(6);
              nombreCargoSup=datos_import.get(7);
              unidadAdmin=datos_import.get(8);
              clavePuesto=datos_import.get(9);
              nombrePuesto=datos_import.get(10);
              tipoVacancia=datos_import.get(11);
              telefonoDir=datos_import.get(12);
              conmutador=datos_import.get(13);
              ext=datos_import.get(14);
              fax=datos_import.get(15);
              correo=datos_import.get(16);
              arreglo[i]=new Fila(institucion, nombre, primerAp, segundoAp, telefono, tipoPers, nombreCargo, nombreCargoSup, unidadAdmin, clavePuesto, nombrePuesto, tipoVacancia, telefonoDir, conmutador, ext, fax, correo);
          i++;
         }
            setCargado(true);
         datos_import.close();
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
    
    public void exportar(Fila[] arreglo){
        String userDir = System.getProperty("user.dir");
        try{
            String file=System.getProperty("user.dir")+"/src/ordenado.csv";
            boolean alreadyExists = new File(file).exists();
         
        if(alreadyExists){
            File ficheroUsuarios = new File(file);
            ficheroUsuarios.delete();
        }
        Charset cs= Charset.forName("UTF-8");
        CsvWriter csvOutput = new CsvWriter(file, ',',cs );
            for (int i = 0; i < cabecera.length; i++) {
                csvOutput.write(cabecera[i]);
            }csvOutput.endRecord();
            
            for (int i = 0; i < arreglo.length; i++) {
                csvOutput.write(arreglo[i].getInstitucion());
                csvOutput.write(arreglo[i].getNombre());
                csvOutput.write(arreglo[i].getPrimerAp());
                csvOutput.write(arreglo[i].getSegundoAp());
                csvOutput.write(arreglo[i].getTelefono());
                csvOutput.write(arreglo[i].getTipoPers());
                csvOutput.write(arreglo[i].getNombreCargo());
                csvOutput.write(arreglo[i].getNombreCargoSup());
                csvOutput.write(arreglo[i].getUnidadAdmin());
                csvOutput.write(arreglo[i].getClavePuesto());
                csvOutput.write(arreglo[i].getNombrePuesto());
                csvOutput.write(arreglo[i].getTipoVacancia());
                csvOutput.write(arreglo[i].getTelefonoDir());
                csvOutput.write(arreglo[i].getConmutador());
                csvOutput.write(arreglo[i].getExt());
                csvOutput.write(arreglo[i].getFax());
                csvOutput.write(arreglo[i].getCorreo());
                csvOutput.endRecord();
            }   
            csvOutput.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    /**
     * @return the cargado
     */
    public boolean isCargado() {
        return cargado;
    }

    /**
     * @param cargado the cargado to set
     */
    public void setCargado(boolean cargado) {
        this.cargado = cargado;
    }
}
