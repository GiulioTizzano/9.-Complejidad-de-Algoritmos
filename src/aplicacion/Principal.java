package aplicacion;
import java.util.Scanner;
import java.util.ArrayList;
import dominio.Complejidad;

public class Principal{
    public static void main(String[] args){
        // Scanner para obtener un número por el usuario:
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserte un numero natural: ");
        int numeroNatural = sc.nextInt();
        sc.close(); 
        System.out.println("La suma de los naturales es: " + Complejidad.sumaNaturales(numeroNatural));
        System.out.println("La suma de los naturales es: " + Complejidad.sumaNaturalesIterativo(numeroNatural)); 
        ArrayList<String> numInt = new ArrayList<String>();
        for(int i = 0; i <= 10; i++){
            numInt.add("1");
        }
        int[] arreglo = {1, 2, 4, 7, 9 , 11, 15, 20, 25, 44, 100011};
        System.out.println("Introduce un número, a ver si se encuentra dentro de la lista: " + Complejidad.buscar(44, arreglo));


    }
}