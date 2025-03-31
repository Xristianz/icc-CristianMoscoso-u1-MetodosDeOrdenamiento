public class BorbujaMejorado {
    public int[] ordenarAscendente(int[] arreglo, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (conPasos) {
                    System.out.println("Comparacion " + contComparaciones + " -> " + arreglo[j] + " > " + arreglo[j+1]);
                }
                contComparaciones++;
                
                if (arreglo[j] > arreglo[j+1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    contCambios++;
                    
                    if (conPasos) {
                        System.out.print("Intercambio realizado -> ");
                        imprimirArreglo(arreglo);
                    }
                }
            }
            
            if (conPasos) {
                System.out.print("Estado actual -> ");
                imprimirArreglo(arreglo);
            }
        }
        
        int[] respuestas = {contComparaciones, contCambios};
        return respuestas;
    }

    public int[] ordenarDescendente(int[] arreglo, boolean conPasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (conPasos) {
                    System.out.println("Comparacion " + contComparaciones + " -> " + arreglo[j] + " < " + arreglo[j+1]);
                }
                contComparaciones++;
                
                if (arreglo[j] < arreglo[j+1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                    contCambios++;
                    
                    if (conPasos) {
                        System.out.print("Intercambio realizado -> ");
                        imprimirArreglo(arreglo);
                    }
                }
            }
            
            if (conPasos) {
                System.out.print("Estado actual -> ");
                imprimirArreglo(arreglo);
            }
        }
        
        int[] respuestas = {contComparaciones, contCambios};
        return respuestas;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "-");
        }
        System.out.println();
    }
}