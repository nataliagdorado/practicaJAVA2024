package Vista;
import Codigo.Poblacion;
import Codigo.Dosis;
import Codigo.Experimento;
import Codigo.Luminosidad;
import Exepciones.ExcepcionNoPoblacion;
import java.util.Scanner;


public class MainLab throws Excepciones {
    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido a BioLab, laboratorio de biología");
            System.out.println("Opciones:");
            System.out.println("1. Añadir experimentos");
            System.out.println("2. Ver experimento");
            System.out.println("3. Crear un nuevo experimento");
            System.out.println("4. Salir del programa");

            System.out.print("Ingrese el número de opción: ");
            String opcion = new Scanner(System.in).nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Cargando experimentos...");
                    //Seleccionar
                    break;
                case "2":
                    System.out.println("Viendo experimento...");
                    // Lógica para ver experimento
                    break;
                case "3":
                    // Lógica para crear un nuevo experimento
                    break;
                case "4":
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
                    break;
            }

            System.out.println();
        }
    }
}
