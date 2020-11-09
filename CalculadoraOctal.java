
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Ander Gaona
 * 
 */
public class CalculadoraOctal
{

    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int cifra1 = n1 % 10;
        int numero1 = n1 /10;
        int cifra2 = n2 % 10;
        int numero2 = n2 /10;
        int suma = 0;
        int potencia = 0;
        while (numero1 >= 0 && numero2 >= 0){
            if (cifra1 + cifra2 >= 8){
                cifra1 *= Math.pow(10,potencia);
                cifra2 *= Math.pow(10,potencia);
                suma += ((cifra1 + cifra2) - 8) + Math.pow(10,potencia + 1);
            }
            else{
               cifra1 *= Math.pow(10,potencia);
               cifra2 *= Math.pow(10,potencia); 
               suma += (cifra1 + cifra2);
            }
            potencia++;
            cifra1 = numero1 % 10;
            numero1 /=  10;
            cifra2 = numero2 % 10;
            numero2 /=  10;
        }
        
        
        return suma;

    }
    
    
}
