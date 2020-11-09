import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Ander Gaona
 */
public class Utilidades
{

    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        boolean validar = true;
        int cifra = n % 10;
        int numero = n /10;
        while (numero != 0){
            if (cifra >= 8){
                validar = false;
            }
            cifra = numero % 10;
            numero /=  10;
        }
        return validar;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {
        int cifras = 1;
        int cifra = n % 10;
        int numero = n /10;
        while (numero != 0){
            cifras++;
            cifra = numero % 10;
            numero /=  10;
        }
        return cifras;

    }

   
    
}
