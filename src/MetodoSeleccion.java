public class MetodoSeleccion {
    public int ordenarDesSeleccion(int[] arreglo, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (arreglo[maxIdx] < arreglo[j]) {
                    maxIdx = j;
                }
                
                if (conPasos) {
                    System.out.println("Comparando " + arreglo[maxIdx] + " con " + arreglo[j]);
                }
            }
            
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
                
                if (conPasos) {
                    System.out.print("Intercambio -> ");
                    imprimirArreglo(arreglo);
                }
            }
        }
        return contComparaciones;
    }
    
    public int ordenarAsdSeleccion(int[] arreglo, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (arreglo[minIdx] > arreglo[j]) {
                    minIdx = j;
                }
                
                if (conPasos) {
                    System.out.println("Comparando " + arreglo[minIdx] + " con " + arreglo[j]);
                }
            }
            
            if (minIdx != i) {
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
                
                if (conPasos) {
                    System.out.print("Intercambio -> ");
                    imprimirArreglo(arreglo);
                }
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
