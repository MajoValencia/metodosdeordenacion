/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practica;
import java.util.Scanner;


/**
 *
 * @author Alumnos
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Fila[] arreglo = new Fila[94331];
        Secretaria secretaria= new Secretaria();
        secretaria.importar(arreglo);
        System.out.println("Seleccione una opcion para ordenar:\n 1)Nombre \n 2)Apellido Paterno \n 3)Clave Puesto");
        int decicion=sc.nextInt();
        String criterio="";
        switch(decicion){
            case 1:
                criterio="nombre";
                break;
            case 2:
                criterio="apellido";
                break;
            case 3:
                criterio="puesto";
                break;
            default:
                criterio="nombre";
                break;
        }
        quicksort(arreglo, 0, 94330, criterio);
        System.out.println("terminado");
        secretaria.exportar(arreglo);
        // TODO code application logic here
    }
    
    public static void quicksort(Fila A[], int izq, int der, String criterio) {
        Fila pivote = A[izq];
        int i = izq;
        int j = der;
        Fila aux;

        while (i <= j) {
            while (comparar(criterio, A[i], pivote)<0) {
                i++;
            }
            while (comparar(criterio,A[j], pivote)>0) {
                j--;
            }
            if (i < j) {
                aux = A[i];
                A[i] = A[j];
                A[j] = aux;
                i++;
                j--;
            }
        }
        A[izq] = A[j];
        A[j] = pivote;
        if (izq < j - 1) {
            quicksort(A, izq, j ,criterio);
        }
        if (j + 1 < der) {
            quicksort(A, i, der,criterio);
        }
    }

    public static int comparar(String criterio, Fila a, Fila b){
        int resultado=0;
        switch(criterio){
            case "nombre":
                resultado =a.getNombre().compareTo(b.getNombre());
                break;
            case "apellido":
                resultado=a.getPrimerAp().compareTo(b.getPrimerAp());
                break;
            case "puesto":
                resultado=a.getClavePuesto().compareTo(b.getClavePuesto());
                break;
        }
        return resultado;
    }
}
