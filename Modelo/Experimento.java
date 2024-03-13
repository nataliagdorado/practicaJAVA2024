import java.util.Date;
public class Experimento {
    public enum Luminosidad {
        ALTA,
        MEDIA,
        BAJA
    }
    
    public class Experimento {
        String nombre;
        Date fechaInicio;
        Date fechaFin;
        int numBacterias;
        double temperatura;
        Luminosidad luminosidad;
        DosisComida dosisComida;
        Poblacion[] poblacion;

        public Experimento(String nombre, Date fechaInicio, Date fechaFin, int numBacterias, double temperatura, Luminosidad luminosidad, DosisComida dosisComida, Poblacion[] poblacion) {
            this.nombre = nombre;
            this.fechaInicio = fechaInicio;
            this.fechaFin = fechaFin;
            this.numBacterias = numBacterias;
            this.temperatura = temperatura;
            this.luminosidad = luminosidad;
            this.dosisComida = dosisComida;
            this.poblacion = poblacion;
        }
    }
        this.fechaFin = fechaFin;
        this.numBacterias = numBacterias;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
        this.dosisComida = dosisComida;
        this.poblacion = poblacion;
    }
    // Métodos
    gestionarPoblacion();
    guardarArchivo();
    crearPoblacion();
    visualizarPoblaciones();
    borrarPoblacion();
    verDetallesPoblacion();
}