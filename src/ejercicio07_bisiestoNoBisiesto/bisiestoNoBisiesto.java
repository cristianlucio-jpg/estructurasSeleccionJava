package ejercicio07;

import java.util.Scanner;

/**
 * Clase BisiestoNoBisiesto.
 * 
 * Objetivo: Determinar si un año es bisiesto.
 * 
 * Contenido temático:
 * - Estructuras de selección (if, else).
 * - Operadores lógicos y módulo (%).
 * - Entrada y salida de datos.
 * 
 * Ejemplo:
 * Ingrese: 2024 → Resultado: Es bisiesto
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class bisiestoNoBisiesto {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita un año al usuario,
     * evalúa las condiciones de divisibilidad
     * y determina si es bisiesto o no.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Se lee el año ingresado por el usuario
        System.out.print("Ingrese un año: ");
        int anioIngresado = teclado.nextInt();

        // Se determina si el año es bisiesto
        if ((anioIngresado % 4 == 0 && anioIngresado % 100 != 0) || (anioIngresado % 400 == 0)) {
            System.out.println("Es bisiesto");
        } else {
            System.out.println("No es bisiesto");
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
