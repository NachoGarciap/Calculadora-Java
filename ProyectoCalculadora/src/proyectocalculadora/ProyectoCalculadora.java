package proyectocalculadora;

import java.util.Scanner;

public class ProyectoCalculadora {

    /*Nivel 1.
Debe solicitar al usuario la operación aritmética que quiere realizar : Los valores permitidos son SUM, RES, MUL y DIV correspondientes a las operaciones aritméticas básicas.

Si el usuario introduce un comando no valido informará al usuario de que el comando es desconocido y puede utilizar HELP para mostrar las operaciones disponibles.

El comando HELP mostrara al usuario los posibles comandos disponibles.

Cuando se introduzca un comando aritmético valido se pedirán el primer operador y el segundo y se mostrara por pantalla el resultado de la operación con una frase "Resultado de la 
operación XXXXXX" donde XXXXXX es el resultado

Después de realizar la operación el programa mostrará al usuario el siguiente mensaje "Si quiere salir introduzca el comando EXIT". Si el usuario introduce EXIT debe terminar la ejecución. 
     */
    public static void main(String[] args) {

        double sum, res, mul, div;
        double resultado=0;
        double num1 = 0, num2 = 0;
        String opcion = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una operacion: ");
        opcion = sc.nextLine();

        System.out.println("Introduce el primer numero");
        num1 = sc.nextDouble();

        System.out.println("Introduce el segundo numero");
        num2 = sc.nextDouble();

        switch (opcion) {
            case "SUM":
                resultado = num1 + num2;
                break;
            case "RES":
                resultado = num1 - num2;
                break;
            case "MUL":
                resultado = num1 * num2;
                break;
            case "DIV":
                resultado = num1 / num2;
                break;
        }

        System.out.println("El resultado es: " + resultado);

    }

}
