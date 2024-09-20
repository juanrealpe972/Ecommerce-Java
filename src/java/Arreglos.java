package java;
public class Arreglos {
    public static void main(String[] args) throws Exception {
        /* 
        Arreglos estructura de datos que tienen valores del mismo tipo bajo un mismo nombre
        Estos valores se distribuyen secuencialmente en la memoria y se puede acceder a ellos mediante un indice
        LOS ARREGLOS SON TAMBIEN LLAMADOS VECTORES O MATRICES
        */

        //tipdato  nombre 0  1   2   3   4
        int[] numeros = {10, 20, 30, 40, 50};
        numeros[2] = 70;

        // System.out.println(numeros[0]); // Para acceder y mostrar por consola el número que indiquemos
        // System.out.println(numeros.length); // length: indica cuantos elementos existen en el arreglo

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        } // Es el mas utilizado

        // forEach
        for (int numero : numeros) {
            System.out.println(numero);
        }

        String palabra = "Abecedario";
        System.out.println(palabra.length());
    }
}
