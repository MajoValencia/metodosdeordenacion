/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;



/**
 *
 * @author Alumnos
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String userDir = System.getProperty("user.dir");
        System.out.println(userDir);
        
        Fila[] arreglo = new Fila[94331];
        Secretaria.importar(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
            
        }
        // TODO code application logic here
    }
    
}
