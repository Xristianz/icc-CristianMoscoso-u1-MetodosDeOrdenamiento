public class MetodoBurbuja {
    public int ordenar(int[] arreglo, boolean isDes, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (conPasos) {
                    System.out.println("i=" + i + " j=" + j);
                }
                contComparaciones++;
                
                if (isDes) {
                    if (arreglo[i] < arreglo[j]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                    }
                } else {
                    if (arreglo[i] > arreglo[j]) {
                        int aux = arreglo[j];
                        arreglo[j] = arreglo[i];
                        arreglo[i] = aux;
                    }
                }
            }
        }
        return contComparaciones;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "-");
        }
        System.out.println();
    }
}
