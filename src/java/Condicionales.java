package java;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) throws Exception {

        // // Condicionales "if, else"
        // int edad = 70;
        // if(edad > 18 && edad <=60) {
        //     System.out.println("Puedes irte de fiesta.");
        // }else if(edad > 60) {
        //     System.out.println("No puedes entrar a la fiesta, ya que no es para mayores de 60 años.");
        // }else if(edad == 18) {
        //     System.out.println("Tienes la edad justa para irte de fiesta");
        // }else {
        //     System.out.println("No puedes irte de fiesta, eres menor de edad");
        // }

        // Condicionales if-else y switch
        // // Pregunta a solucionar: ¿Qué tipo de bebida te gusta?
        // String bebida = "Café";

        // // Con if y else funciona pero no es lo ideal. Es por eso se que utiliza Switch
        // if(bebida == "Café") {
        //     System.err.println("Buenísima elección, de paso combina con el logo de Java");
        // }else if(bebida == "Tinto"){
        //     System.out.println("¡Buen elección!, pero no es tan popular como el café");
        // }else if(bebida == "Gaseosa") {
        //     System.out.println("Ten cuidado con el azúcar porque es mala para la salud");
        // }else if(bebida == "Vino"){
        //     System.out.println("¡Buen elección!, eres uno de los mios");
        // }else {
        //     System.out.println("¡Disfrutá de tu bebida!");
        // }

        // // Cuando es necesario hacer muchas comparaciones es preferiblemente utilizar Switch
        // switch (bebida) {
        //     case "Café":
        //         System.err.println("Buenísima elección, de paso combina con el logo de Java");
        //         break;
        //     case "Tinto":
        //         System.out.println("¡Buen elección!, pero no es tan popular como el café");
        //         break;
        //     case "Gaseosa":
        //         System.out.println("Ten cuidado con el azúcar porque es mala para la salud");
        //         break;
        //     case "Vino":
        //         System.out.println("¡Buen elección!, eres uno de los mios");
        //         break;
        //     case "Agua":
        //         System.out.println("Perfecto para la salud");
        //         break;
        //     default:
        //         System.out.println("¡Disfrutá de tu bebida!");
        //         break;
        // }

        // Input en consola llamado Scanner.
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n" + "Bienvenido a la maquina de bebidas");
        System.out.println("Elija una de las siguientes opciones: \n");
        System.out.println("1. Café");
        System.out.println("2. Tinto");
        System.out.println("3. Gaseosa");
        System.out.println("4. Vino");
        System.out.println("5. Agua");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.err.println("Café! Buenísima elección, de paso combina con el logo de Java");
                break;
            case 2:
                System.out.println("Tinto! ¡Buen elección!, pero no es tan popular como el café");
                break;
            case 3:
                System.out.println("Gaseosa! Ten cuidado con el azúcar porque es mala para la salud");
                break;
            case 4:
                System.out.println("Vino! ¡Buen elección!, eres uno de los mios");
                break;
            case 5:
                System.out.println("Agua! Perfecto para la salud");
                break;
            default:
                System.out.println("Opción no valida. Fin del programa.");
                break;
        }

        if(opcion <= 5){
            System.out.println("¡Disfrutá de tu bebida!");
        }

        scanner.close();

    }
}
