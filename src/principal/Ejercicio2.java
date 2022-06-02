/*
Analisis
Proposito: Vamos a diseñar un programa que calcule una potencia positiva real utilizando un subprograma recursivo.
Precondicion: Los números introducidos deben ser positivos.
Entrada: Valores introducidos por teclado.
Salida: Valor del resultado de la potencia.
Variables
Real a, resultado
Entero n


Inicio
Definir variables
Introducir variables
Llamar Potencia
Mostrar Resultado

Modulos:
Potencia
    Definir variables
    Si(n==0)
        resultado=1
    Sino
        resultado=a*Potencia(a, n-1)
    FinSi
    Devolver resultado
FinPotencia
FinPP
 */
package principal;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        // Se definen las variables
        float a;
        int n;
        float resultado;
        // Se introducen los valores de las variables
        System.out.println("Por favor, introduzca el valor de la base");
        a=s.nextInt();
        System.out.println("Por favor, introduzca el valor del exponente");
        n=s.nextInt();
        // Se llama a la función Potencia
        resultado=Potencia(a, n);
        // Se muestra en pantalla la solución de la potencia
        System.out.println("La solución recursiva es "+resultado);
    }
    public static float Potencia(float a, int n){
        // Se inicializa la variable resultado
        float resultado;
        // Se inicia el Si
        if (n==0){
            resultado=1;
        }
        // Se inicia el Sino
        else {
            resultado=a*Potencia(a, n-1);
        }
        // Se devuelve la variable resultado
        return resultado;
    }
}
