package ejercicio06;

import java.util.Scanner;

/**
 * Clase GradosEstados.
 * 
 * Objetivo: Determinar el estado del agua según la temperatura.
 * 
 * Contenido temático:
 * - Condicionales simples y compuestos.
 * - Comparaciones con operadores relacionales.
 * - Entrada y salida de datos.
 * 
 * Ejemplo:
 * Ingrese: 25 → Resultado: Líquido
 * 
 * @author Cristian Alexis Lucio Narváez
 */
public class gradosEstados {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita la temperatura en grados Celsius,
     * evalúa las condiciones y muestra el estado del agua
     * (sólido, líquido o gaseoso).
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Se lee la temperatura ingresada por el usuario
        System.out.print("Ingrese la temperatura en °C: ");
        int temperatura = teclado.nextInt();

        // Se determina el estado del agua según la temperatura
        if (temperatura <= 0) {
            System.out.println("Estado: Sólido");
        } else if (temperatura < 100) {
            System.out.println("Estado: Líquido");
        } else {
            System.out.println("Estado: Gaseoso");
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
