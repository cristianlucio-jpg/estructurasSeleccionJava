package ejercicio05;

import java.util.Scanner;

/**
 * Clase SignoZodiaco.
 * 
 * Objetivo: Determinar el signo zodiacal según la fecha de nacimiento.
 * 
 * Contenido temático:
 * - Condicionales compuestos.
 * - Operadores lógicos (&&, ||).
 * - Entrada y salida de datos.
 * 
 * Ejemplo:
 * Ingrese: 15/04 → Resultado: Aries
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class signoZodiaco {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita la fecha de nacimiento (mes y día),
     * evalúa las condiciones lógicas y muestra el signo zodiacal correspondiente.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Se leen los datos de entrada: mes y día de nacimiento
        System.out.print("Ingrese el mes (1-12): ");
        int mesNacimiento = teclado.nextInt();
        System.out.print("Ingrese el día: ");
        int diaNacimiento = teclado.nextInt();

        // Se determina el signo zodiacal según la fecha ingresada
        if ((mesNacimiento == 3 && diaNacimiento >= 21) || (mesNacimiento == 4 && diaNacimiento <= 20)) {
            System.out.println("Aries");
        } else if ((mesNacimiento == 4 && diaNacimiento >= 21) || (mesNacimiento == 5 && diaNacimiento <= 20)) {
            System.out.println("Tauro");
        } else {
            System.out.println("Otro signo...");
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}

