package aplicacion;
import java.util.Scanner;

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
    }
}