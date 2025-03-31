public class MetodoInsercion {
    public int ordenarAsd(int[] arreglo, boolean pasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        
        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            
            if (pasos) {
                System.out.println("i=" + i + ", j=" + j);
            }
            
            while (j >= 0 && aux < arreglo[j]) {
                contComparaciones++;
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
                
                if (pasos) {
                    System.out.print("Desplazamiento -> ");
                    imprimirArreglo(arreglo);
                }
            }
            arreglo[j + 1] = aux;
            
            if (pasos) {
                System.out.print("Inserción -> ");
                imprimirArreglo(arreglo);
            }
        }
        return contComparaciones;
    }
    
    public int ordenarDes(int[] arreglo, boolean pasos) {
        int tam = arreglo.length;
        int contComparaciones = 0;
        
        for (int i = 1; i < tam; i++) {
            int aux = arreglo[i];
            int j = i - 1;
            
            if (pasos) {
                System.out.println("i=" + i + ", j=" + j);
            }
            
            while (j >= 0 && aux > arreglo[j]) {
                contComparaciones++;
                arreglo[j + 1] = arreglo[j];
                j = j - 1;
                
                if (pasos) {
                    System.out.print("Desplazamiento -> ");
                    imprimirArreglo(arreglo);
                }
            }
            arreglo[j + 1] = aux;
            
            if (pasos) {
                System.out.print("Inserción -> ");
                imprimirArreglo(arreglo);
            }
        }
        return contComparaciones;
    }
    
    private void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "-");
        }
        System.out.println();
    }
}