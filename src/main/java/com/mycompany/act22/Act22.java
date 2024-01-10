/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act22;

/**
 *
 * @author ceti
 */
public class Act22 {

 public static boolean dia_laboral(String dia) {
        switch(dia) {
            case "Lunes":
                return true;
            case "Martes":
                return true;
            case "Miercoles":
                return true;
            case "Jueves":
                return true;
            case "Viernes":
                return true;
            case "Sabado":
                return false;
            case "Domingo":
                return false;
            default:
                return false;
        }
    }
    public static void main(String[] args) {
        
              if (dia_laboral("Lunes") == true) {
            System.out.println("Esto es un dia laboral porque devuelve true");
        } else {
            System.out.println("Esto no es un dia laboral porque devuelve false"); }
    }
}
