import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Ander Gaona
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char seguir = 's';
        while (seguir == 's' || seguir == 'S'){
            Pantalla.borrarPantalla();
            System.out.println("Introduzca un numero en octal: ");
            int numero1 = teclado.nextInt();
            System.out.println("Introduzca un segundo numero en octal: ");
            int numero2 = teclado.nextInt();
            if (!Utilidades.estaEnOctal(numero1) || !Utilidades.estaEnOctal(numero2)){
                System.out.println("Alguno de los numeros no esta en octal");
            }
            else{
                if (Utilidades.contarCifras(numero1) != Utilidades.contarCifras(numero2)){
                    System.out.println("Los numeros no tienen el mismo numero de cifras");
                }
                else{
                    System.out.println("-----------------------------------------------");
                    System.out.printf("\n %30d \n %30d \n", numero1, numero2);
                    System.out.printf("%22s %8d \n", "Suma Octal: ", 
                    calculadora.sumarEnOctal(numero1, numero2));
                    
                }
            }
            System.out.println("¿Quieres realizar otra suma? (S / s)");
            teclado.nextLine();
            seguir = teclado.nextLine().charAt(0);
        }

    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        Pantalla.borrarPantalla();
        System.out.println("Ahora se dibujara una figura");
        System.out.println("Introduce la altura de la misma (1-10) : ");
        int altura = teclado.nextInt();
        while (altura > 10 || altura < 1){
            System.out.println("Error, introduce la altura de la misma (1-10) : ");
            altura = teclado.nextInt();
        }
        pintor.dibujarFigura(altura);
    }

}
