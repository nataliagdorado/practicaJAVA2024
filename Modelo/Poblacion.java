import path.to.luminosidad;
import path.to.dosisComida;
public class Poblacion extends Experimento {
    String nombre;
    Date fechaInicio;
    Date fechaFin;
    int numBacterias;
    double temperatura;
    luminosidad luminosidad;
    dosisComida Dosis;

    public Poblacion(string nombre, date fechaInicio, date fechaFin, int numBacterias, double temperatura, luminosidad luminosidad, dosisComida Dosis) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.numBacterias = numBacterias;
        this.temperatura = temperatura;
        this.luminosidad = luminosidad;
        this.Dosis = Dosis;
    }
}