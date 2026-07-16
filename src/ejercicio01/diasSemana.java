package ejercicio01;

import java.util.Scanner;

/**
 * Clase diasSemana.
 * 
 * Objetivo: Mostrar el día de la semana según un número ingresado (1–7).
 * 
 * Contenido temático:
 * - Estructuras de selección (switch).
 * - Entrada de datos con Scanner.
 * - Salida de datos con System.out.
 * 
 * Ejemplo:
 * Ingrese: 3 → Resultado: Miércoles
 * 
 * @author Cristian Alexis Lucio Narvaéz
 */
public class diasSemana {

    /**
     * Método principal que ejecuta el programa.
     * 
     * Este método solicita un número entre 1 y 7,
     * y muestra el día de la semana correspondiente.
     * 
     * @param args argumentos de línea de comandos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un número (1-7): ");
        int numeroDia = teclado.nextInt();

        // Se selecciona el día de la semana según el número ingresado
        switch (numeroDia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miércoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sábado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("Número inválido");
        }

        teclado.close(); // Se cierra el recurso Scanner
    }
}
