public class pruebaArrayList {
    public static void main(String[] args) {
        int[] edades=new int[10];
    
        for (int i=0; i < edades.length; i++) {
            edades[i]=i;
            System.out.println("Elemento " + i + ": " + edades[i]);
        }
    
        int suma=0;
    
        for (int i=0; i < 10; i++) {
            suma=suma+edades[i];
        }
    
        System.out.println("Suma " + suma);
        float matriz[][]=new float[4][5];
    
        for (int i=0; i < matriz.length; i++) {
            for (int j=0; j < matriz[0].length; j++) {
                matriz[i][j]=i *100+j;
                System.out.println("Elemento " + i + ", " + j + ": " +matriz[i][j]);
            }
        }
    }
    }

