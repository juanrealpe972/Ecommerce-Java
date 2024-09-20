package java;
public class AprendiendoJava {
    // Clase Persona como ejemplo de tipo de dato por referencia
    static class Persona {
        String nombre;
        int edad;
        // Constructor de la clase Persona
        Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }
        // Método para imprimir información de la persona
        void imprimirInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World from Aprendiendo!");
        // </ -------------- Tipos de datos primitivos --------------
        int numero = 5;
        double decimales = 5.52344321;

        char letra = 'J';
        String cadena = "Mi nombre es Juan";

        boolean v = true;
        boolean f = false;

        System.out.println(numero);
        System.out.println(decimales);

        System.out.println(cadena);
        System.out.println(letra);

        System.out.println(v);
        System.out.println(f);

        // -------------- Ejemplos en uso --------------
            String texto = "Juan Camilo Realpe Ceron.";

            int longitud = texto.length();
            System.out.println(longitud);

            char caracter = texto.charAt(0);
            System.out.println(caracter);

            String subString = texto.substring(1, 4);
            System.out.println(subString);

            String minusculas = texto.toLowerCase();
            System.out.println(minusculas);

            String mayusculas = texto.toUpperCase();
            System.out.println(mayusculas);

            int indice = texto.indexOf("Camilo");
            System.out.println(indice);

            String reemplazado = texto.replace("Realpe ", "");
            System.out.println(reemplazado);

            boolean contiene = texto.contains("Juan");
            System.out.println("¿El texto contiene la palabra 'Juan'?: " + contiene);

            String sinEspaciosInicioyFin = texto.trim();
            System.out.println(sinEspaciosInicioyFin);

        // -------------- Tipos de datos primitivos -------------- />

        // </ -------------- Variables por referencia --------------
        // Crear un objeto de la clase Persona (tipo por referencia)
        Persona persona1 = new Persona("Juan", 25);
        Persona persona2 = new Persona("Camilo", 30);

        // Imprimir información de los objetos
        System.out.println("\nDatos de persona1:");
        persona1.imprimirInfo();

        System.out.println("\nDatos de persona2:");
        persona2.imprimirInfo();

        // Cambiar el valor de la propiedad 'edad' a través de la referencia
        persona1.edad = 26;

        System.out.println("\nDatos de persona1 después de modificar la edad:");
        persona1.imprimirInfo();
        // -------------- Variables por referencia -------------- />

        // </ ---------- Operadores matematicos: Son simbolos que operan con variables o valores ----------
        // Aritmeticos:
        int a = 5;
        int b = 4;

        int suma = a + b;
        int resta = b - a;
        int multiplicacion = a * b;

        double aa = 5;
        double bb = 4;
        double division = aa / bb;

        int par = 15 % 2;

        System.out.println("\nSuma: " + suma);
        System.out.println("\nResta: " + resta);
        System.out.println("\nMultiplicación: " + multiplicacion);
        System.out.println("\nDivisión: " + division);
        System.out.println("\n¿Número par? Si es '0' es par, si es '1' es impar, Como resultado obtuvimos: " + par);

        // Asignación
        int c = 5;
        c = 10;
        c += 15;
        c += 25;
        c -= 20;
        c *= 2;
        c /= 2;
        c++;
        c--;

        System.out.println("\nEl valor de c es: " + c);

        int aaa = 3;
        int bbb = 5;

        // OPERADORES DE COMPARACIÓN---------------------------
        boolean isMayor = aaa > bbb;
        boolean isMenor = aaa < bbb;
        boolean isIgual = aaa == bbb;

        System.out.println("\n¿Es 'a' mayor que 'b'? " + isMayor);
        System.out.println("\n¿Es 'a' menor que 'b'? " + isMenor);
        System.out.println("\n¿Es 'a' realmente igual que 'b'? " + isIgual + "\n");
        // OPERADORES DE COMPARACIÓN---------------------------

        // OPERADORES LOGICA ---------------------------
        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; // Ambos deben ser positivos para que de true
        boolean resultadoOR = condicion1 || condicion2; // Uno de los dos debe ser positivo para que de true
        boolean resultadoNOT = !condicion1; // Lo opuesto a lo que tenga asignado previamente

        /*TABLA DE LA VERDAD ------------------------------------|
        |     AND ( && )          OR ( || )           NOT ( ! )  |
        |        | V | F |         | V | F |                     |
        |    | V | V | F |     | V | V | V |             !V | F  |
        |    | F | F | F |     | F | V | F |             !F | V  |
        |--------------------------------------------------------|*/ 

        System.out.println(resultadoAND); 
        System.out.println(resultadoOR);
        System.out.println(resultadoNOT);
        // OPERADORES LOGICA ---------------------------
        // ---------- Operadores matematicos ----------------- />
    }
}
