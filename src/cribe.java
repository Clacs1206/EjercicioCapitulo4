import java.util.Scanner;
public class cribe
{
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max)
    {
        int i,j;
        if (max >= 2) {
// Declaraciones
            int dim = tamArray(max);
            boolean[] esPrimo = getPrimo(dim);
// Inicializar el array
            for (i=0; i<dim; i++)
                Eliminar0y1(esPrimo, i, true);
// Eliminar el 0 y el 1, que no son primos
            Eliminar0y1(esPrimo, 0, esPrimo[1] = false);
// Criba
            for (i=2; i<Math.sqrt(dim)+1; i++) {
                if (esPrimo[i]) {
// Eliminar los múltiplos de i
                    elimprimos(i, dim, esPrimo);
                }
            }
// ¿Cuántos primos hay?
            int cuenta = 0;
            for (i=0; i<dim; i++) {
                if (esPrimo[i])
                    cuenta++;
            }
// Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            for (i=0, j=0; i<dim; i++) {
                if (esPrimo[i])
                    primos[j++] = i;
            }
            return primos;
        } else { // max < 2
            return new int[0];
// Vector vacío
        }
    }

    private static void Eliminar0y1(boolean[] esPrimo, int x, boolean esPrimo1) {
        esPrimo[x] = esPrimo1;
    }

    private static void elimprimos(int i, int dim, boolean[] esPrimo) {
        int j;
        for (j=2* i; j< dim; j+= i)
            Eliminar0y1(esPrimo, j, false);
    }

    public static boolean[] getPrimo(int dim) {

        boolean[] esPrimo = new boolean[dim];
        return esPrimo;
    }

    private static int tamArray(int max) {
        int dim = max + 1; // Tamaño del array
        return dim;
    }

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int dato=teclado.nextInt();
        int vector[]=new int[dato];
        System.out.println("\nVector inicial hasta :"+dato);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(i+1+"\t");
        }
        vector=generarPrimos(dato);
        System.out.println("\nVector de primos hasta:"+dato);
        for (int i = 0; i < vector.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(vector[i]+"\t");
        }
    }
}
