package Codigo;

public abstract class Experimento {
   private int idExperimento;
   private String nombreExperimento;
   private int[] poblaciones;
   private Set<Poblacion> poblacionSet;
   

   public Experimento (int idExperimento; String nombreExperimento, int[] poblaciones) {
      this.idExperimento=idExperimento;
      this.nombreExperimento = nombreExperimento;
      this.poblaciones = poblaciones;
   }

    public String getNombreExperimento() {
        return nombreExperimento;
    }
    public void setNombreExperimento(String nombreExperimento) {
        this.nombreExperimento = nombreExperimento;
    }
    public int[] getPoblaciones() {
        return poblaciones;
    }
    public void setPoblaciones(int[] poblaciones) {
        this.poblaciones = poblaciones;
    }
    public void setIdExperimento(int idExperimento) {
        this.idExperimento = idExperimento;
    }
    public int getIdExperimento() {
        return idExperimento;
    }
    @Override
    public String toString() {
        return "Experimento{" +
                "nombreExperimento='" + nombreExperimento + '\'' +
                ", idExperimento=" + idExperimento +
                ", poblaciones=" + Arrays.toString(poblaciones) +
                '}';
    }

    /*CREA UNA POBLACION */
    public void crearPoblacion(){
        this.poblacionSet.add(poblacion);
    }
    /*ELIMINA UN EXPERIMENTO */
    public void eliminarExperimento(int idExperimento) {
        if (poblacion.getPoblacionSet().isEmpty()) {
         System.out.println("No hay nada que borrar");
         } else {
         System.out.print("Introduce el ID de la poblacion a borrar: ");
         int idborrar = Input.leerInt();
         
         }
        
    }

    public void guardarArchivo{}

}