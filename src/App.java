import java.util.Scanner;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        App main = new App();
        MetodoBurbuja mB = new MetodoBurbuja();
        MetodoSeleccion mS = new MetodoSeleccion();
        MetodoInsercion mI = new MetodoInsercion();
        BorbujaMejorado mBMejorado = new BorbujaMejorado();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){

            int[] arreglo = new int[]{12, -7, 25, 0, -15, 33, 19, -22, 5, 48, -3, 27, -30, 14, 7, -1, 41, 20, -11, 8};

            System.out.println("Seleccione el metodo de ordenamiento:");
            System.out.println("1. Burbuja");
            System.out.println("2. Seleccion");
            System.out.println("3. Insersion: ");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Terminar");
            int metodo = scanner.nextInt();

            if(metodo == 5){
                System.out.println("Fin....Gracias");
                continuar = false;
                break;
            }

            int validar=0;
            String orden= null;
            while (validar==0){
                System.out.println("Ingrese de que forma desea ordenar: Asendente (A) o Desendente (D)");
                orden = scanner.next();
                if(orden.equalsIgnoreCase("A") || orden.equalsIgnoreCase("D")){
                    validar = 1;
                }else{
                    System.out.println("Seleccione una opcion entre A y D");
                }
            }

            System.out.println("Seleccione Con Pasos (True) o Sin Pasos (False)");
            boolean pasos = scanner.nextBoolean();

            int[] contadores = null;
            switch (metodo) {
                case 1:
                    System.out.println("=====METODO DE BURBUJA====");
                    System.out.println("El arreglo: ");
                    main.imprimirArreglo(arreglo);
                    switch (orden) {
                        case "A", "a":
                            contadores = mB.ordenarAscendente(arreglo,pasos);
                            break;
                    
                        case "D", "d":
                            contadores = mB.ordenarDescendente(arreglo, pasos);
                            break;
                    }
                    System.out.println("El arreglo ordenado: ");
                    main.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones: "+contadores[0]);
                    System.out.println("Cambios: "+contadores[1]);
                    break;

                case 2:
                    System.out.println("====METODO DE SELECCION====");
                    System.out.println("El arreglo: ");
                    main.imprimirArreglo(arreglo);
                    switch (orden) {
                        case "A", "a":
                            contadores = mS.ordenarAscendente(arreglo,pasos);
                            break;
                    
                        case "D", "d":
                            contadores = mS.ordenarDescendente(arreglo, pasos);
                            break;
                    }
                    System.out.println("El arreglo ordenado: ");
                    main.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones: "+contadores[0]);
                    System.out.println("Cambios: "+contadores[1]);
                    break;

                case 3:
                    System.out.println("====METODO DE INSERCION====");
                    System.out.println("El arreglo: ");
                    main.imprimirArreglo(arreglo);
                    switch (orden) {
                        case "A", "a":
                            contadores = mI.ordenarAscendente(arreglo,pasos);
                            break;
                    
                        case "D", "d":
                            contadores = mI.ordenarDescendente(arreglo, pasos);
                            break;
                    }
                    System.out.println("El arreglo ordenado: ");
                    main.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones: "+contadores[0]);
                    System.out.println("Cambios: "+contadores[1]);
                    break;

                case 4:
                    System.out.println("====METODO DE BURBUJA MEJORADO====");
                    System.out.println("El arreglo: ");
                    main.imprimirArreglo(arreglo);
                    switch (orden) {
                        case "A", "a":
                            contadores = mBMejorado.ordenarAscendente(arreglo,pasos);
                            break;
                    
                        case "D", "d":
                            contadores = mBMejorado.ordenarDescendente(arreglo, pasos);
                            break;
                    }
                    System.out.println("El arreglo ordenado es: ");
                    main.imprimirArreglo(arreglo);
                    System.out.println("Comparaciones: "+contadores[0]);
                    System.out.println("Cambios: "+contadores[1]);
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }
        }
    }
    public void imprimirArreglo(int[] arreglo) {
        for(int i = 0; i < arreglo.length; ++i) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}

