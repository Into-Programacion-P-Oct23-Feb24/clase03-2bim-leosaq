/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Ejemplo002 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int[][] arreglo = {{10, 41, 40},
                            {1, 2, 3}, 
                            {1, 12, 4}};
        double suma = 0;

        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int colum = 0; colum < arreglo.length; colum++) {
                if (fila == colum){
                    suma = suma  + arreglo[fila][colum];
                }
            }
        }
        System.out.printf("La suma de los valores es: %.0f\n", suma);
    }
}
/*
En este programa primeramente se declaran los valores que van a ir en las 
respectivas filas y columnas, para consiguiente crear dos ciclos "for" 
que van a recorrer todo el programa. Lo importante de este programa es que 
al utilizar un "if" se puede comparar que mientras el contador en ambos ciclos 
"for" aumenta puedo comparar que sean iguales tanto en fila y columna, y por 
ende pueda sumarlos de acuerdo a la problematica.
*/
