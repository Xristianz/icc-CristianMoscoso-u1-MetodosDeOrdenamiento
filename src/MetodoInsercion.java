public class MetodoInsercion {
    public int[] ordenarAscendente(int[] arreglo, boolean pasos) {
        int n = arreglo.length;
        int pos = 0;
        int aux = 0;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < n; ++i) {
            pos = i;
            aux = arreglo[i];
            while (pos > 0 && arreglo[pos - 1] > aux) {
                if (pasos) {
                    System.out.println("cambiar " + arreglo[pos - 1] + " de la posición " + (pos - 1) + " a la posición " + pos);
                }
                arreglo[pos] = arreglo[pos - 1];
                contComparaciones++;
                --pos;
                if (pasos) {
                    if (pos > 0) {
                        System.out.println("Comparando " + aux + " posición " + pos + " con " + arreglo[pos - 1] + " posición " + (pos - 1) + "");
                    } else {
                        System.out.println("se termina el arreglo");
                    }
                }
                contCambios++;
            }
            arreglo[pos] = aux;
            if (pasos) {
                System.out.println("Colocando " + aux + " en la posición " + pos);
                imprimirArreglo(arreglo);
            }
        }
        int[] contadores = {contComparaciones, contCambios};
        return contadores;
    }

    public int[] ordenarDescendente(int[] arreglo, boolean pasos) {
        int n = arreglo.length;
        int p = 0;
        int aux = 0;
        int contComparaciones = 0;
        int contCambios = 0;
        for (int i = 1; i < n; ++i) {
            p = i;
            aux = arreglo[i];
            while (p > 0 && arreglo[p - 1] < aux) {
                if (pasos) {
                    System.out.println("Se cumple la condición: " + aux + " > " + arreglo[p - 1]);
                    System.out.println("Cambiar " + arreglo[p - 1] + " de la posición " + (p - 1) + " a la posición " + p);
                }
                arreglo[p] = arreglo[p - 1];
                contComparaciones++;
                --p;
                if (pasos) {
                    if (p > 0) {
                        System.out.println("Comparando " + aux + " (posición " + p + ") con " + arreglo[p - 1] + " (posición " + (p - 1) + ")");
                    } else {
                        System.out.println("Continuamos con la siguiente posición, se termina el arreglo");
                    }
                }
                contCambios++;
            }
            arreglo[p] = aux;
            if (pasos) {
                System.out.println("Colocando " + aux + " en la posición " + p);
                imprimirArreglo(arreglo);
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
