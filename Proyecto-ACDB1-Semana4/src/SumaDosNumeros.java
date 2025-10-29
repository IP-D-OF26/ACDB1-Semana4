/**
 * Ejercicio01: Dados dos numero enteros de entrada, procesarlos en una suma y 
 * presentar los resultados
 * @author Daniel Irene
 * @version 1.0
 */
import java.util.Scanner;
public class SumaDosNumeros {
    public static void main(String[] args) {
        //ENTRADA DE DATOS
        //[Clase-Api-JDK-para-ingreso-datos: Scanner -> java.util] 
        //[nombre-variable/obj-para-ingredo-datos: nombreVariable] 
        //[=] inicializar el objeto/variable
        //[Clase-Api-JDK-para-ingreso-datos: Scanner ] 
        //[Fuento-del-ingreso-datos: System.in => las entradas del sistema]
        Scanner teclado = new Scanner(System.in);
        int num1, num2, respuesta;
        System.out.println("Deme dos numeros: "); //Carpintaria => tunear
        num1 = teclado.nextInt();
        num2 = teclado.nextInt();
        respuesta = num1 + num2;
        System.out.println("La respuestas es: ");
        System.out.println(respuesta);
        
    }
}

/**
 * RUN
 */
