import java.util.Date;
import java.util.Scanner;

public class Experimento {
    public static void main(String[] args) {
    
    public enum Luminosidad {
        ALTA,
        MEDIA,
        BAJA
    }
    
    private String nombre;
    private int numBacterias;
    private double temperatura;
    private Luminosidad luminosidad;
    private int dosisComida;

    // Constructor
    public Experimento(String nombre, int numBacterias, double temperatura, Luminosidad luminosidad, int dosisComida) {
        this.nombre = nombre;
        this.numBacterias = numBacterias;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
        this.dosisComida = dosisComida;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    
    public int getNumBacterias() {
        return numBacterias;
    }
    
    public double getTemperatura() {
        return temperatura;
    }
    
    public Luminosidad getLuminosidad() {
        return luminosidad;
    }
    
    public int getDosisComida() {
        return dosisComida;
    }
    
    
    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setNumBacterias(int numBacterias) {
        this.numBacterias = numBacterias;
    }
    
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }
    
    public void setLuminosidad(Luminosidad luminosidad) {
        this.luminosidad = luminosidad;
    }
    
    public void setDosisComida(int dosisComida) {
        this.dosisComida = dosisComida;
    }
    
    // Métodos
    Experimento crearExperimento(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nombre del experimento:");
            String nombre = scanner.nextLine();

            System.out.println("Numero de bacterias:");
            int numBacterias = scanner.nextInt();

            System.out.println("Temperatura en grados centígrados:");
            double temperatura = scanner.nextDouble();

            System.out.println("Luminosidad:");
            String luminosidadInput = scanner.nextLine();
            Luminosidad luminosidad = Luminosidad.valueOf(luminosidadInput.toUpperCase());

            System.out.println("Dosis comida (1-100):");
            int dosisComida = scanner.nextInt();

            // Crear el objeto Experimento con los valores ingresados por el usuario
            Experimento experimento = new Experimento(nombre, fechaInicio, fechaFin, numBacterias, temperatura, luminosidad, dosisComida);

            return experimento;
}
    gestionarPoblacion();
    guardarArchivo();
    crearPoblacion();
    visualizarPoblaciones();
    borrarPoblacion();
    verDetallesPoblacion();
}
}