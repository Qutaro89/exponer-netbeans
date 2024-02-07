/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defensa.github;

/**
 *
 * @author Alumno
 */
import java.util.Random;
import java.util.Scanner;

public class DefensaGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
  
          int numaleatorio = 0, respuesta, intentos = 10;
        Scanner teclado = new Scanner(System.in);
        if (intentos == 10) {
            System.out.println("SE ESTA GENERANDO EL NÚMERO QUE VAS A INTENTAR ADIVINAR");
            System.out.println("SI PONES UN NÚMERO MÁS GRANDE TE DIRE QUE ES MENOR, PERO SI TE QUEDAS POR DE DEBAJO TE DIRE QUE AUMENTES TU RESPUESTA");
            Random dado = new Random();
            numaleatorio = dado.nextInt(50) + 1;//hay un +1 ya que elige los numeros aleatoriamente entre el 1 y el 50
            System.out.println("YA SE HA GENERADO EL NÚMERO. SUERTE ;-)");
        }
        while (intentos != 0) {
            System.out.println("LE QUEDAN " + intentos + " INTENTOS");//digo cuantos intentos te quedan
            System.out.println("¿CUAL ES TU RESPUESTA?");
            respuesta = teclado.nextInt();//a partir de aqui ya comprobamos si la respuesta coincide con el numero
          
            if (respuesta == numaleatorio) {
                System.out.println("ASÍ ES EL NUMERO ALEATORIO ERA " + numaleatorio);
                System.exit(0);
            } else {
                intentos = intentos - 1;
                if (respuesta < numaleatorio) {
                    System.out.println("TE EQUIVOCASTE EL NÚMERO ES MAYOR QUE " + respuesta);
                } else {
                    System.out.println("TE EQUIVOCASTE EL NÚMERO ES MENOR QUE " + respuesta);
                }
            } if (intentos == 0) {
                System.out.println("TE QUEDASTE SIN INTENTOS EL NÚMERO ERA " + numaleatorio);
                System.exit(0);
            }
        }
    }
}
