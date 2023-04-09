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
    // Ejercicio 36:
    // La comlejidad temporal del cálculo e = 1/2gt^2 es de tiempo constante O(1), porque está compuesto de una elevación al cuadrado
    // y por operaciones aritméticas básicas. Además no contiene ningún tipo de bucle que se repitan varias veces, por lo que el cálculo
    // no depende de t, sino que es siempre constante.

    // Ejercicio 37:
    // En el ejercicio 37, se muestran dos métodos. En el primero, se muestra un método que toma como parámetro un ArrayList de tipo
    // String y que retorna el primer elemento del contenedor con el método get. En el segundo método, también se le pasa cómo parámetro 
    // un ArrayList de tipo String pero en este caso se retorna el elemento n-ésimo. Ambas funciones acceden al primero elemento y al
    // n-ésimo de forma directa sin depender de n. Por lo tanto, este bloque de código tiene una complejidad temporal constante
    // O(1).

    // Ejercicio 38:

    // En el ejercicio 38 hay qu analizar los bloques de código del ejercicio 35. 
    // La complejidad temporal de sumaNaturales es un método recursivo donde por cada llamada al método, se le resta
    // 1 a numeroNatural hasta que numeroNatural == 0. P.l.t: la complejidad temporal de este método es de tiempo lineal O(n) porque 
    // depende del valor de numeroNatural. El método sumaNaturalesIterativo también es de tiempo lineal porque también depende del 
    // valor de i de la iteración del propio for loop, p.l.t: O(n).

    // Ejercicio 39:
    // En el ejercicio 39 había que resolver cualquier ejercicio del 1 - 11 y calcular su complejidad tempora. Bloque de código:
    
    /*package dominio;

    public class Factorial {
        public static int factorial(int factorial){
            if(factorial == 1){
                return 1;
            } else{
                return factorial * factorial(factorial - 1);
            }
            
        }
    } */
        // La complejidad temporal es O(n)

        // Ejercicio 40: He escogido calcular la complejidad temporal del siguiente apartado del ejercicio 2: suma elementos de una lista

        /*public class SumaElementosLista{
            int m;
            
            public static float sumaElementosArray(float[] array, int m){
                // si la posicion m del array es igual a 0, entonces devolvemos el valor de la posicion m (que es el índice 0).
                if(m == 0){
                    return array[m];
                }
                // sino, devolvemos el valor de la posicion m del array, y le sumamos el valor de la posicion m - 1 del array hasta llegar
                // al paso base.
                else{
                    return array[m] + sumaElementosArray(array, m - 1);
                }
                
            } */
            // La complejidad temporal del bloque de código de arriba para la suma de los elementos de una lista es O(n) de tiempo
            // linean porque cada llamada recursiva procesa solamente un elemento. Así que, el número de llamadas = tamañp de la lista
            // es decir, == n. La complejidad espacial del código también es O(n) porque la comlejidad espacial se refiere a la cantidad 
            // de memoria que utiliza un algoritmo para ejecutarse. Por lo que, en el caso de este algoritmo la cantidad de memoria utilizada
            // dependerá de n, es decir, de la tamaño de la lista. Así que, la cantidad de memoria utilizada es proporcional a n.

            public static int sumaElementosArray(){
                int sum = 0;
                for(int i = 0; i <= numInt.length(); i++){
                    sum +=i;
                }
                return sum;
            }
            // La complejidad temporal del algoritmo iterativo de la suma de los elementos de un Array/ArrayList es O(n), es decir,
            // de tiempo lineal porque realiza una operación constante y básica como la suma a través de los n elementos, por lo tanto,
            // depende de n. La complejidad espacial es constante O(1), porque no guarda el resultado de la suma en una estructura de datos
            // sino que se va actualizando en un contador llamado "sum".

            // Ejercicio 41:
            // La complejidad temporal del ejercicio 41 para un conjunto con cardinalidad n, algoritmo l que ejecuta una instrucción
            // para cada elemento del producto cartesiano de A x A resulta en una complejidad temporal de O(n^2) porque el algoritmo
            // tiene que ejecutar n instrucciones n veces para cada par ordenado (que contiene dos elementos cada par ordenado)
            // del producto cartesiano de A x A, por lo tanto.
        
            // Ejercicio 42:
            
            // La complejidad temporal del ejercicio 42 es de tiempo O(i x j), es decir, depende del número de filas y columnas.

            // Ejerciico 43:
            public static boolean buscar(int e, int[] arreglo){
                for(int i = 0; i <= arreglo.length; i++){
                    if(arreglo[i] == e){
                        return true;

                    } else{
                        return false;
                    }

                }
                return true;
            }
            // La complejidad temporal de este algoritmo en el peor de los casos en O(n) porque tendría que recorrer todo el arreglo
            // para conteniendo n elementos. En el mejor de los casos, sería de tiempo constante O(1). En el caso medio, aunque el 
            // número pueda encontrarse cerca del primer índice, no podemos garantizar que esto pase, p.l.t: tiene una complejidad 
            // temporal lineal O(n) también en el caso medio.
            

            public static boolean buscarRecursivo(int b, int[] arreglo, int i){
                if(i == arreglo.length){
                    return false;
                } else if(arreglo[i] == b){
                    return true;
                } 
                return buscarRecursivo(b, arreglo, i + 1);
                
        }
        // En el peor de los casos este algoritmo tiene una complejidad temporal O(n). En el mejor de los casos sería realizar una
        // sola comparación y por tanto sería constante y en el caso medio sería de promedio unas n/2 comparaciones.

        // Ejercicio 45:
        public static int fibonacciRecursivo(int num){
            if(num == 0){
                return 0;
            } else if(num == 1){
                return 1;
            } else{
                return fibonacciRecursivo(num - 2) + fibonacciRecursivo(num - 1);
            }
        } 
        // La complejidad temporal de este algoritmo es O(2^n). La complejidad espacial es exponencial.

        // Ejercicio 46:
        // En el ejercicio 46 los tiempos mostrados demuestran que para magnitudes del orden de 10^7 el cálculo de un número primo
        // mediante un algoritmo se puede ejecutar de forma muy rápida luego al pasar a magnitudes de 10^8 hacía arriba crece
        // linealmente.

        // Ejercicio 47:
        // En el ejercicio 47 se muestran unos tiempos que corresponden con algoritmo con complejidad temporal exponencial.

        // Ejercicio 48:
        // si una función T(n) está en el orden de f(n), 
        // significa que la tasa de crecimiento de T(n) es como 
        // máximo tan rápida como la tasa de crecimiento de f(n), a partir de un cierto punto n0.

        // Ejercicio 49:
        /* 1.Podemos elegir cualquier valor de n0 que queramos, por ejemplo, n0 = 2. Luego, para cualquier valor de n mayor que 2, podemos encontrar una constante k que cumpla la definición de la notación O.
        Para demostrarlo, tomemos cualquier valor de k que sea mayor o igual que 3 + 2 / log2(2). Por ejemplo, podemos elegir k = 5. Entonces, para todo m mayor que n0 = 2, tenemos:

        3 · log2(m) + 2 ≤ 5 · log2(m)

        Lo que nos muestra que T(n) está acotada superiormente por una constante k multiplicada por log2(n), a partir de un cierto punto n0 (en este caso n0 = 2).

        Por lo tanto, podemos concluir que T(n) ∈ O(log2(n)) y que k = 5 y n0 = 2 son las constantes que demuestran esta afirmación.
        */

        /* 2.No necesariamente. El hecho de que T(n) ∈ O(log2(n)) significa que T(n) está acotada superiormente por una constante k multiplicada por log2(n), a partir de un cierto punto n0. Sin embargo, esto no implica que T(n) esté acotada superiormente por una constante multiplicada por n.
             Por ejemplo, considere la función T(n) = log2(n). Esta función está en el orden de O(log2(n)), ya que está acotada superiormente por una constante multiplicada por log2(n). Sin embargo, T(n) no está en el orden de O(n), ya que no está acotada superiormente por una constante multiplicada por n.
             Por lo tanto, la respuesta es no, el hecho de que T(n) ∈ O(log2(n)) no implica que T(n) ∈ O(n).

            3. No necesariamente. Si T(n) está en el orden de O(log3(n)), significa que T(n) está acotada superiormente por una constante multiplicada por log3(n) a partir de un cierto punto n0. Por lo tanto, podemos escribir:
                T(n) ≤ k1 · log3(n) para todo n > n0
                Ahora, para responder la pregunta, debemos preguntarnos si podemos encontrar una constante k2 tal que:
                T(n) ≤ k2 · log2(n) para todo n > n0
                Sin embargo, esto no es necesariamente cierto. No podemos encontrar una constante k2 para que la desigualdad se cumpla, ya que log2(n) crece más rápido que log3(n). Por lo tanto, T(n) no necesariamente pertenece a O(log2(n)).
                Podemos ilustrar esto con un ejemplo concreto. Considere T(n) = log3(n). Entonces, T(n) está en el orden de O(log3(n)). Sin embargo, si intentamos acotar superiormente T(n) por una constante multiplicada por log2(n), no podemos encontrar una constante que funcione. En otras palabras, no hay ninguna constante k tal que:
                log3(n) ≤ k · log2(n) para todo n > n0
                Por lo tanto, podemos concluir que el hecho de que T(n) ∈ O(log3(n)) no implica que T(n) ∈ O(log2(n)).
            */
            
        // Ejercicio 50:
        // 1. La función uno es simplemente una constante.
        // 2. La función dos es una función lineal
        // 3. La función tres es una función exponencial
        // 4. La función cuatro es una función logaritmica, es decir, va creciendo muy rápida y luego acaba aplanándose
        // 5. La función cinco es una función exponencial de base 2.

        // Ejercicio 51:
         /*
         * la complejidad temporal de la función "f" es O(n log n), 
         * ya que la función se divide en log2(n) llamadas recursivas y cada llamada 
         * tiene una complejidad temporal de O(n) debido a la llamada a "sumaNPrimeros".
         */ 
        /* Ejercicio 52:
        Sí, es cierto que la complejidad en el peor de los casos de la inserción en un ArrayList es diferente si el ArrayList está ordenado o no. Esto se debe a que la inserción en un ArrayList ordenado implica la necesidad de desplazar los elementos existentes para hacer espacio para el nuevo elemento, mientras que la inserción en un ArrayList no ordenado simplemente implica agregar el nuevo elemento al final del ArrayList.
        En un ArrayList no ordenado, la inserción de un elemento en la posición k implica simplemente agregar el elemento 
        al final del ArrayList en O(1) y no se requiere mover ningún otro elemento en el ArrayList. Por lo tanto, la complejidad 
        temporal de la inserción 
        en el peor de los casos es O(1), ya que no hay necesidad de realizar ninguna operación costosa.
        Por otro lado, en un ArrayList ordenado, la inserción de un elemento en la posición k implica mover todos los elementos a la derecha de la posición k una posición hacia la derecha para hacer espacio para el nuevo elemento. Esto implica copiar (n - k) elementos, lo que tiene una complejidad temporal de O(n-k). Además, si el ArrayList está lleno, puede ser necesario redimensionarlo, lo que implica copiar todos los elementos a una nueva matriz con una capacidad mayor. Esto implica una complejidad temporal de O(n). En el peor de los casos, cuando se inserta un elemento en la posición k = 0 en un ArrayList ordenado de tamaño n, se deben mover todos los elementos y redimensionar el ArrayList, lo que implica una complejidad temporal de O(n).
        En resumen, la complejidad en el peor de los casos de la inserción en un ArrayList es O(1) en un ArrayList no ordenado y O(n) en un ArrayList ordenado.
         * 
         * 
         * 
         */

         // Ejercicio 53:
         // 1. log(n) con n = 100 => log(100) = 2 * 10
         // 2. Si n = 100 => n = 100 * 10
         // 3. Si n = 100 y nlog(n) => 100*log(100) = 200 * 10
         // 4. Si n = 100 y n^2 => 100^2 * 10
         // 5. Si n = 100 y n^8 => 100^8 * 10
         // Si n = 100 y 10^n => 10^100 * 10
         
         // Luego se pide lo mismo pero para: 
         // 1. n = 100.000. y
         // 2. n = 100.000 y 1ms en vez de 10ms.

         // Ejercicio 54:
         /*
          * Complejidad del juego: El ajedrez es un juego extremadamente complejo que 
          tiene un gran número de posibles jugadas y combinaciones de movimientos. 
          El número de posiciones legales en el ajedrez es estimado por encima de los 10^43, 
          lo que significa que es prácticamente imposible evaluar todas las posibles combinaciones 
          de movimientos.

          Dificultades algorítmicas: La complejidad del juego implica que no existe un algoritmo conocido que pueda 
          evaluar todas las posibles combinaciones de movimientos en una partida de ajedrez en tiempo razonable. 
          A pesar de los avances en la computación, el problema sigue siendo intratable en la práctica debido a 
          la explosión combinatoria de posibilidades.
          */


}

        

