package ejercicio04;

import java.util.Scanner;

/**
 * Clase MayorCuatroNumeros.
 * 
 * Objetivo: Determinar el mayor entre cuatro números enteros.
 * 
 * Contenido temático:
 * - Condicionales múltiples.
 * - Uso de variable auxiliar para almacenar el mayor.
 * - Entrada y salida de datos.
 * 
 * Ejemplo:
 * Ingrese: 3, 12, 7, 9 → Resultado: El mayor es 12
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class mayorCuatroNumeros {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita cuatro números enteros,
     * los compara usando condicionales múltiples
     * y muestra cuál es el mayor.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Se leen los cuatro números ingresados por el usuario
        System.out.print("Ingrese cuatro números: ");
        int primerNumero = teclado.nextInt();
        int segundoNumero = teclado.nextInt();
        int tercerNumero = teclado.nextInt();
        int cuartoNumero = teclado.nextInt();

        // Se usa una variable auxiliar para almacenar el mayor encontrado
        int numeroMayor = primerNumero;
        if (segundoNumero > numeroMayor) numeroMayor = segundoNumero;
        if (tercerNumero > numeroMayor) numeroMayor = tercerNumero;
        if (cuartoNumero > numeroMayor) numeroMayor = cuartoNumero;

        // Se muestra el resultado final
        System.out.println("El mayor es: " + numeroMayor);

        teclado.close(); // Se cierra el recurso Scanner
    }
}

