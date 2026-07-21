package ejercicio02;

import java.util.Scanner;

/**
 * Clase mayorDosNumeros.
 * 
 * Objetivo: Determinar el mayor entre dos números enteros.
 * 
 * Contenido temático:
 * - Estructuras de selección (if, else).
 * - Operadores relacionales.
 * - Entrada y salida de datos.
 * 
 * Ejemplo:
 * Ingrese: 8 y 5 → Resultado: El mayor es 8
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class mayorDosNumeros {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita dos números enteros,
     * los compara y muestra cuál es el mayor.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Se leen los dos números ingresados por el usuario
        System.out.print("Ingrese el primer número: ");
        int primerNumero = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int segundoNumero = teclado.nextInt();

        // Se determina cuál número es mayor
        if (primerNumero > segundoNumero) {
            System.out.println("El mayor es: " + primerNumero);
        } else if (segundoNumero > primerNumero) {
            System.out.println("El mayor es: " + segundoNumero);
        } else {
            System.out.println("Son iguales");
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
