public class MetodoSeleccion {

    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (pasos) {
                    System.out.println("Comparando " + arreglo[j] + " (posición " + j + ") con " + arreglo[minIdx] + " (posición " + minIdx + ")");
                }
                contComparaciones++;
                if (arreglo[j] < arreglo[minIdx]) {
                    if (pasos) {
                        System.out.println("índice del menor: " + arreglo[j]);
                    }
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                contCambios++;
                if (pasos) {
                    System.out.println("Intercambiando " + arreglo[minIdx] + " (posición " + minIdx + ") con " + arreglo[i] + " (posición " + i + ")");
                }
                arreglo[i] = aux;
                if (pasos) {
                    imprimirArreglo(arreglo);
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
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (pasos) {
                    System.out.println("Comparando " + arreglo[j] + " (posición " + j + ") con " + arreglo[maxIdx] + " (posición " + maxIdx + ")");
                }
                if (arreglo[j] > arreglo[maxIdx]) {
                    if (pasos) {
                        System.out.println("índice del mayor: " + arreglo[j]);
                    }
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                if (pasos) {
                    System.out.println("Intercambiando " + arreglo[maxIdx] + " (posición " + maxIdx + ") con " + arreglo[i] + " (posición " + i + ")");
                }
                arreglo[i] = aux;
                if (pasos) {
                    imprimirArreglo(arreglo);
                }
            }
        }
        int[] contadores = {contComparaciones, contCambios};
        return contadores;
    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}
