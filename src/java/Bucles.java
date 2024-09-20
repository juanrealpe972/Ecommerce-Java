package java;


public class Bucles {
    public static void main(String[] args) throws Exception {

        // // for(inicialización; condifición; actualización)
        // for (int i = 0; i <= 10; i++) {
        //     System.out.println("El valor de i es: " + i);
        // }

        // for (int i = 1; i <= 3; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         System.out.print("i es: ");
        //         System.out.print(i);
        //         System.out.print(" j es: ");
        //         System.out.println(j);
        //     }
        // }

        // // While
        // int contador = 1;
        // while (contador <= 5) {
        //     System.out.println(contador);
        //     // Actualizar la variable:
        //     contador++;
        // }
        // System.out.println("Juan" + contador);

        // // do while
        // int contador = 1;

        // do{
        //     System.out.println("Esto sucede antes de la condición");
        //     System.out.println(contador);
        //     // Actualización de la variable.
        //     contador++;
        // }while(contador <= 5);
        
        // System.out.println(contador);

        // Controladores de flujo (break, continue, return)

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i);
            if(i == 5){
                // break; // Es urilizado para finalizar el bucle directamente.
                // continue; // Saltea las líneas que continuan del scope.
                return; // Se corta el scope y finaliza el bucle, solo que este es utilizado para retornar cosas.
            }
            System.out.println(i);
        }
    }
}
