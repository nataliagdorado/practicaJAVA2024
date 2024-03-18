package Excepciones;

public class ExcepcionNoPoblacion extends Exception{
    public ExcepcionNoPoblacion (String mensaje){
        super("No hay poblaciones creadas");
    }
}
