package taller1.src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        menu();
    }

    public static int scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero del 0 al 9");
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

    public static int[][] CrearMatriz(int i, int j){
        int[][] matriz = new int[i][j];
        return matriz;

    }
    public static void mostrarFila(int matriz[][], int numFila){
        for (numFila = 0; numFila < matriz.length; int numColum++){
            System.out.println("Fila:" + numFila);
            for (){

            }

        }

    }

    public static boolean matrizCero(int matriz[][]){

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

            int opcion = scanner.nextInt();

            if (opcion == 1){
                int fila = scanner();
                int col = scanner();
                validarNumeros(fila);
                validarNumeros(col);
            }
        }
    }

}
