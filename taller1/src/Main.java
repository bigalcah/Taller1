package taller1.src;
import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static int miScanner() {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        return valor;
    }

    public static boolean validarNumeros(int num) {
        return num > 0;

    }

    public static void largoMatriz(int fila, int col) {
        boolean cumple = true;
        while (cumple) {
            if (validarNumeros(fila) && validarNumeros(col)) {
                System.out.println("cumplen los requerimentos");
                cumple = false;
            } else {
                System.out.println("no cumple los requerimentos");
            }
        }
    }

    public static int[][] llenarMatrizRandom(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(0,10); // Números aleatorios entre 0 y 9
            }
        }
        return matriz;
    }


    public static void mostrarFila(int[][] matriz, int numFila) {
        for (int j = 0; j < matriz[numFila].length; j++) {
            System.out.print(matriz[numFila][j]);
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static boolean matrizCero(int[][] matriz, int cantFilas, int cantColumnas) {
        int total = cantFilas * cantColumnas;
        int contador = 0;

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }
        return contador > total / 2;
    }

    public static int[][] crearMatriz(int fila, int col) {
        int[][] matriz = new int[fila][col];
        return matriz;
    }

    public static void menu() {
        System.out.println("Ingrese el numero de filas: ");
        int fila = miScanner();
        System.out.println("Ingrese el numero de columnas: ");
        int col = miScanner();
        int[][] matriz = null;

        while (true) {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Verificar dimension de matriz");
            System.out.println("2. Crear la Matriz");
            System.out.println("3. Matriz aleatoria");
            System.out.println("4. Indique el numero de fila que quiera mostrar: ");
            System.out.println("5. Verificar si la matriz es de tipo 0");
            System.out.println("6. Mostrar matriz");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opción: ");

            int opcion = miScanner();

            switch (opcion) {
                case 1 -> {
                    largoMatriz(fila, col);
                }

                case 2 -> {
                    matriz = crearMatriz(fila, col);

                }
                case 3 -> {
                    llenarMatrizRandom(matriz);
                }
                case 4 -> {
                    System.out.println("\ningresa el numero de la fila que quieras mostrar");
                    fila = miScanner();
                    mostrarFila(matriz, fila);
                }
                case 5 ->{
                    matrizCero(matriz,fila,col);
                }
                case 6 -> {
                    mostrarMatriz(matriz);
                }
                case 7 -> {
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opción inválida.");
                }
            }
        }
    }

}


