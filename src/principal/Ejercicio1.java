package principal;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("Por favor, introduzca el número que desea verificar");
        try {
            num = s.nextInt();
        }catch (java.util.InputMismatchException exception){
            System.out.println("Lo lamento, pero debe introducir un número");
        }
        System.out.println("El resto del programa está en construcción");
    }
}
