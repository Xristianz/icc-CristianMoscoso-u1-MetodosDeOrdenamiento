public class BorbujaMejorado {
    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Comparando " + arreglo[j] + " de la posición " + j + 
                                    " con " + arreglo[j + 1] + " de la posición " + (j + 1));
                }
                if (arreglo[j] > arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    if (pasos) {
                        System.out.println("Intercambio " + arreglo[j] + " de la posición " + j + 
                                        " con " + arreglo[j + 1] + " de la posición " + (j + 1));
                    }
                    arreglo[j + 1] = aux;
                    if (pasos) {
                        imprimirArreglo(arreglo);
                    }
                } else {
                    System.out.println("No se puede intercambiar.");
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
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Comparando " + arreglo[j] + " de la posición " + j + 
                                    " con " + arreglo[j + 1] + " de la posición " + (j + 1));
                }
                if (arreglo[j] < arreglo[j + 1]) {
                    contCambios++;
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    if (pasos) {
                        System.out.println("Intercambio " + arreglo[j] + " de la posición " + j + 
                                        " con " + arreglo[j + 1] + " de la posición " + (j + 1));
                    }
                    arreglo[j + 1] = aux;
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
