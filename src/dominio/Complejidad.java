package dominio;
import aplicacion.*;
public class Complejidad{
    // Ejercicio 35 Recursivamente:
    public static int sumaNaturales(int numeroNatural){
        if(numeroNatural == 0){
            return numeroNatural;
        } else{
            return numeroNatural + sumaNaturales(numeroNatural - 1);
        }
    }
    // Ejercicio 35 Iterativamente:
    public static int sumaNaturalesIterativo(int numeroNatural){
        int suma = 0;
        for(int i = 0; i <= numeroNatural; i++){
            suma += i;
        }
        return suma;
    }

    // Código en C:
/* #include <stdio.h>

int sumaNaturales(int numeroNatural) {
    if(numeroNatural == 0) {
        return numeroNatural;
    } else {
        return numeroNatural + sumaNaturales(numeroNatural - 1);
    }
}

    int main() {
    int n;
    printf("Introduce el valor de N: ");
    scanf("%d", &n);

    int suma = sumaNaturales(n);

    printf("La suma de los numeros naturales hasta %d es %d", n, suma);

    return 0;
} */

    /*
     * #include <stdio.h>

int sumaNaturalesIterativo(int numeroNatural) {
    int suma = 0;
    for(int i = 1; i <= numeroNatural; i++){
        suma += i;
    }
    return suma;
}

    int main() {
    int n;
    printf("Introduce el valor de N: ");
    scanf("%d", &n);

    int suma = sumaNaturalesIterativo(n);

    printf("La suma de los numeros naturales hasta %d es %d", n, suma);

    return 0;
}
     */
    
        
}
