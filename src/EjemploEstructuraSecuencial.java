//Ejemplo 1: Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.

import java.util.Scanner;

/*Comentario 1: En la (línea 8) el nombre "EjemploEstructuraSecuencial" en este caso, siempre deberá coincidir con
el nombre del proyecto EjemploEstructuraSecuencial.java" */

public class EjemploEstructuraSecuencial {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, suma, producto;

        System.out.println("Ingres el 1er valor: ");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el 2do valor: ");
        num2 = scanner.nextInt();

        suma = num1 + num2;
        producto = num1 * num2;

        System.out.println("La suma es: "+suma);
        System.out.println("El producto es de: "+producto);


    }
}