package taller1.src;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args){
        menu();
    }

    public static int scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero del 0 al 9: ");
        int num = scanner.nextInt();
        return num;
    }

    public static boolean validarNumeros(int num1){
        if ( num1 > 0){
            return true;
        }else {
            return false;
        }

    }

    public static int[][] llenarMatrizRandom(int matriz[][]){
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Números aleatorios entre 0 y 9
            }
        }




    public static int[][] crearMatriz(int i, int j){
        int[][] matriz = new int[i][j];
        return matriz;

    }
    public static void mostrarFila(int matriz[][], int numFila){
        for(int j = 0; j < matriz.length; j++){
            System.out.println(matriz[numFila][j] + "");
        }
    }

    public static boolean matrizCero(int matriz[][]){
        return false;
    }

    public static void menu(){
        while (true){
            System.out.println("=== Menú ===");
            System.out.println("1. Definir dimensiones de la matriz: ");
            System.out.println("2. Crear la Matriz");
            System.out.println("3. Matriz aleatoria");
            System.out.println("4. Indique el numero de fila que quiera mostrar: ");
            System.out.println("5. Verificar si la matriz es de tipo 0");
            System.out.print("Seleccione una opción: ");
            int opcion = 0;
            opcion = scanner();

            if (opcion == 1){
                int fila = scanner();
                int col = scanner();
                validarNumeros(fila);
                validarNumeros(col);
            }
            else if (opcion == 2){
                int i = scanner();
                int j = scanner();
                crearMatriz(i,j);
        }
    }

}