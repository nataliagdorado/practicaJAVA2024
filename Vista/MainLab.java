import java.util.Scanner;

public class MainLab {
    public static void main(String[] args) {
        boolean salir = false;

        // Para la interface gráfica
        //interfaz principal = new interfaz();
        //principal.setVisible(true);


        while (!salir) {
            System.out.println("Bienvenido a WandLab, laboratorio de biología");
            System.out.println("Opciones:");
            System.out.println("1. Añadir experimentos");
            System.out.println("2. Ver experimento");
            System.out.println("3. Crear un nuevo experimento");
            System.out.println("4. Salir del programa");

            System.out.print("Ingrese el número de opción: ");
            String opcion = System.console().readLine();

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
                    System.out.println("Creando un nuevo experimento...");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nombre del experimento:");
                    String nombre = scanner.nextLine();

                    System.out.println("Numero de bacterias:");
                    int numBacterias = scanner.nextInt();

                    System.out.println("Temperatura en grados centígrados:");
                    double temperatura = scanner.nextDouble();

                    /* Arreglar cannot be a resolved type luminosisdad
                    System.out.println("Luminosidad:");
                    String luminosidadInput = scanner.nextLine();
                    Luminosidad luminosidad = Luminosidad.valueOf(luminosidadInput.toUpperCase());
                    */

                    System.out.println("Dosis comida (1-100):");
                    int dosisComida = scanner.nextInt();
                    public void crearExperimento(String nombre, int numBacterias, double temperatura, int dosisComida) {
                        // Crear el objeto Experimento con los valores ingresados por el usuario
                         Experimento experimento = new Experimento(nombre, fechaInicio, fechaFin, numBacterias, temperatura, luminosidad, dosisComida);
                    }
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
