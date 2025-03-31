public class MetodoBurbuja {

    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Comparando " + arreglo[j] + " de la posición " + j + 
                                    " con " + arreglo[j + 1] + " de la posición " + (j + 1));
                }
                if (arreglo[i] > arreglo[j]) {
                    contCambios++;
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    if (pasos) {
                        System.out.println("Intercambiando " + arreglo[i] + " de la posición " + i + 
                                        " con " + arreglo[j] + " de la posición " + j);
                    }
                    arreglo[j] = aux;
                    if (pasos) {
                        imprimirArreglo(arreglo);
                    }
                } else {
                    System.out.println("No se cumple la condición para intercambiar.");
                }
            }
        }
        int[] contadores = {contComparaciones, contCambios};
        return contadores;
    }

    public int[] ordenarDescendente(int[] arreglo, boolean pasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Comparando " + arreglo[j] + " de la posición " + j + 
                                    " con " + arreglo[j + 1] + " de la posición " + (j + 1));
                }
                if (arreglo[i] < arreglo[j]) {
                    contCambios++;
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    if (pasos) {
                        System.out.println("Intercambiando " + arreglo[i] + " de la posición " + i + 
                                        " con " + arreglo[j] + " de la posición " + j);
                    }
                    arreglo[j] = aux;
                    if (pasos) {
                        imprimirArreglo(arreglo);
                    }
                } else {
                    System.out.println("No se cumple la condición para intercambiar.");
                }
            }
        }
        int[] contadores = {contComparaciones, contCambios};
        return contadores;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; ++i) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
