package principal;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n;
        System.out.println("Por favor, introduzca el número de elementos que desea dibujar");
        try {
            n = s.nextInt();
        }catch (java.util.InputMismatchException exception){
            System.out.println("Lo lamento, pero debe introducir un número");
        }
        System.out.println("El resto del programa está en construcción");
    }
}
