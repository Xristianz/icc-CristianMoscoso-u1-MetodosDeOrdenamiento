import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        MetodoBurbuja MetodoBurbujaClase = new MetodoBurbuja();
        MetodoSeleccion ms = new MetodoSeleccion();
        MetodoInsercion mi = new MetodoInsercion();
        BorbujaMejorado mbs = new BorbujaMejorado();
        
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            int[] arreglo = new int[10000];
            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int)(Math.random() * 10000) + 1;
            }
            
            System.out.println("Seleccione el metodo de ordenamiento");
            System.out.println("1 burbuja");
            System.out.println("2 seleccion");
            System.out.println("3 insercion");
            System.out.println("4 burbuja mejorado");
            System.out.println("5 salir");
            
            int metodo = getPositive(scanner, "\t Ingrese la opcion");
            
            if (metodo == 5) {
                continuar = false;
                break;
            }
            
            System.out.println("Desea ver los pasos?(true/false)");
            boolean conPasos = scanner.nextBoolean();

            String[] posibles = {"A", "D"};
            String orden = getValidString(scanner, posibles, "deseea ordenar asendentemnte(A) o descendente(D)?");
            boolean ascendente = orden.equalsIgnoreCase("A");
            int contComparaciones = 0;
            int[] respuestas;
            
            System.out.print("Arreglo original -> ");
            MetodoBurbujaClase.imprimirArreglo(arreglo);
            
            switch(metodo) {
                case 1:
                    System.out.println("Metodo de burbuja");
                    contComparaciones = MetodoBurbujaClase.ordenar(arreglo, !ascendente, conPasos);
                    System.out.print("Arreglo ordenado -> ");
                    MetodoBurbujaClase.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + contComparaciones);
                    break;
                    
                case 2:
                    System.out.println("Metodo de seleccion");
                    if (ascendente) {
                        contComparaciones = ms.ordenarAsdSeleccion(arreglo, conPasos);
                    } else {
                        contComparaciones = ms.ordenarDesSeleccion(arreglo, conPasos);
                    }
                    System.out.print("Arreglo ordenado -> ");
                    MetodoBurbujaClase.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + contComparaciones);
                    break;
                    
                case 3:
                    System.out.println("Metodo de insercion");
                    if (ascendente) {
                        contComparaciones = mi.ordenarAsd(arreglo, conPasos);
                    } else {
                        contComparaciones = mi.ordenarDes(arreglo, conPasos);
                    }
                    System.out.print("Arreglo ordenado -> ");
                    MetodoBurbujaClase.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + contComparaciones);
                    break;
                    
                case 4:
                    System.out.println("Metodo de burbuja mejorado");
                    if (ascendente) {
                        respuestas = mbs.ordenarAscendente(arreglo, conPasos);
                    } else {
                        respuestas = mbs.ordenarDescendente(arreglo, conPasos);
                    }
                    System.out.print("Arreglo ordenado -> ");
                    mbs.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones -> " + respuestas[0]);
                    System.out.println("Intercambios -> " + respuestas[1]);
                    break;
                    
                default:
                    System.out.println("Opcion incorrecta");
            }
        }
    }

    public static int getPositive(Scanner scanner, String message) {
        int number;
        do {
            System.out.print(message + ": ");
            number = scanner.nextInt();
            if (number <= 0) {
                System.out.println("El numero debe ser positivo. Intente nuevamente");
            }
        } while (number <= 0);
        return number;
    }

    public static String getValidString(Scanner scanner, String[] posibles, String message) {
        String input;
        boolean valido;
        do {
            System.out.print(message + ": ");
            input = scanner.next();
            valido = false;
            for (String posible : posibles) {
                if (input.equalsIgnoreCase(posible)) {
                    valido = true;
                    break;
                }
            }
        } while (!valido);
        return input;
    }
}
