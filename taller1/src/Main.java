package taller1.src;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //menu();
        largoMatriz();
    }

    public static int miScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero del 0 al 9: ");
        return scanner.nextInt();
    }

    public static boolean validarNumeros(int num1) {
        return num1 > 0;

    }

    public static int[][] llenarMatrizRandom(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Números aleatorios entre 0 y 9
            }
        }
        return matriz;
    }


    public static void mostrarFila ( int[][] matriz, int numFila){
        for (int j = 0; j < matriz.length; j++) {
            System.out.println(matriz[numFila][j] + "");
        }
    }

    public static boolean matrizCero(int[][] matriz){
        int cantFilas, cantColumnas;
        cantFilas = miScanner();
        cantColumnas = miScanner();
        int total =  cantFilas * cantColumnas;
        int contador = 0;


        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contador++;
                }
            }

        return contador > total / 2;
    }

    public static int largoMatriz() {
        int fila = miScanner();
        int col = miScanner();
        if (validarNumeros(fila) && validarNumeros(col)) {
            System.out.println("El largo de la matriz es correcto");
            return fila;
            return col;
        }else {
            System.out.println("Datos invalidos");
        }
    }
    public static int crearMatriz(int fila, int col){
        int[][] matriz = null;
        return matriz[fila][col];
    }
    public static void menu(){
        int fila = 0, col = 0;
        int[][] matriz = null;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("=== Menú ===");
            System.out.println("1. Definir dimensiones de la matriz: ");
            System.out.println("2. Crear la Matriz");
            System.out.println("3. Matriz aleatoria");
            System.out.println("4. Indique el numero de fila que quiera mostrar: ");
            System.out.println("5. Verificar si la matriz es de tipo 0");
            System.out.print("Seleccione una opción: ");
            int opcion = miScanner();

            switch (opcion) {
                case 1 -> {
                    largoMatriz();
                    }
                }
                case 2 -> {
                    int[][] matriz = crearMatriz(; int fila,int col);
                }
                case 3 -> {
                    llenarMatrizRandom(int[][] matriz);
                }
                case 4-> {
                    int fila = miScanner();
                    mostrarFila(matriz,fila);
                }
                case 5 -> {
                    if (matriz != null) {
                        if (matrizCero(matriz)) {
                            System.out.println("La matriz es de tipo 0.");
                        } else {
                            System.out.println("La matriz no es de tipo 0.");
                        }
                    } else {
                        System.out.println("Primero defina las dimensiones de la matriz.");
                    }
                }
                case 6 -> {
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }

}


