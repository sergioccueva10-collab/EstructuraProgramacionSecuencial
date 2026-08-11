//Ejemplo 1: Realizar la carga de dos números enteros por teclado e imprimir su suma y su producto.

import java.util.Scanner;

/*COMENTARIO 1: En la (línea 8) el nombre "EjemploEstructuraSecuencial" en este caso, siempre deberá coincidir con
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

//COMENTARIO 2: No olvidar que después de declarar (línea 12), siempre deberá hacerse una asignación (línea 15 y 18).
/*COMENTARIO 3: Siempre ingresar un 'SOUT' (línea 14 y 17) inmediatamente, porque el usuario será quien vea o realice
alguna acción, es por eso que hay que mostrarle un mensaje indicando qué hacer*/
//COMENTARIO 4: Siempre realizar las operaciones (líneas 20 y 21), se podría decir que también son asignaciones con propósito.
/*COMENTARIO 5: Y finalmente, se deberá añadir un mensaje mediante 'SOUT' para indicar al usuario el resultado, como
se puede evidenciar en las (líneas 23 y 24)*/