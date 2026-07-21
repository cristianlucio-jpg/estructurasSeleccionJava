package ejercicio03;

import java.util.Scanner;

/**
 * Clase mayorTresNumeros.
 * 
 * Objetivo: Determinar el mayor entre tres números enteros.
 * 
 * Contenido temático:
 * - Condicionales anidados: permiten comparar progresivamente los valores
 *   y actualizar el mayor encontrado.
 * - Variable auxiliar: almacena el mayor hasta el momento, evitando repetir lógica.
 * - Entrada con Scanner: captura los números ingresados por el usuario.
 * - Salida con System.out: muestra el resultado final en pantalla.
 * 
 * Ejemplo:
 * Ingrese: 4, 9, 7 → Resultado: El mayor es 9
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class mayorTresNumeros {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita tres números enteros,
     * los compara usando condicionales anidados
     * y muestra cuál es el mayor.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese tres números: ");
        int primerNumero = teclado.nextInt();
        int segundoNumero = teclado.nextInt();
        int tercerNumero = teclado.nextInt();

        // Se usa una variable auxiliar para almacenar el mayor encontrado
        int numeroMayor = primerNumero;

        if (segundoNumero > numeroMayor) {
            numeroMayor = segundoNumero;
        }
        if (tercerNumero > numeroMayor) {
            numeroMayor = tercerNumero;
        }

        // Se muestra el resultado final
        System.out.println("El mayor es: " + numeroMayor);

        teclado.close(); // Se cierra el recurso Scanner
    }
}
