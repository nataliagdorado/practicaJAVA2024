public class Poblacion {
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
    public void Experimento(String nombre, int numBacterias, double temperatura, Luminosidad luminosidad, int dosisComida) {
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
    /*
    crearExperimento(); 
    gestionarPoblacion();
    guardarArchivo();
    crearPoblacion();
    visualizarPoblaciones();
    borrarPoblacion();
    verDetallesPoblacion();*/
    
}
