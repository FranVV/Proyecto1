/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alumno
 */
public class Modelo {

    public static int[] vectorInt() {
        int[] vint = new int[10];
        int contador=0;
        for (int i = 0; i < vint.length; i++) {
            vint[i]=contador;
            contador++;
        }
        return vint;
    }
    
}
