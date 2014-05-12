/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;
import java.io.*;
import com.csvreader.CsvReader;
import java.net.URL;
/**
 *
 * @author Alumnos
 */
public class Secretaria {
    public static void importar(Fila[] arreglo){
         
        String institucion, nombre, primerAp, segundoAp, telefono, tipoPers, nombreCargo, nombreCargoSup, 
            unidadAdmin, clavePuesto, nombrePuesto, tipoVacancia, telefonoDir, conmutador, ext, fax, correo;
        String userDir = System.getProperty("user.dir");
        try{
         
         CsvReader datos_import = new CsvReader( System.getProperty("user.dir")+"/src/directoriopot 2.csv");  
         datos_import.readHeaders();
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
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
