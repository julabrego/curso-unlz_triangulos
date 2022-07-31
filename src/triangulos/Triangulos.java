package triangulos;

import java.util.Scanner;

/**
 *
 * @author abreg
 */
public class Triangulos {

    /**
     * Dado los tres lados de un triangulo, realizar un programa para averiguar que tipo de triangulo es:
     * - Equilatero A== B Y B==C
     * - Isosceles  A==B o B==C o A==C
     * - Escaleno A !=B y B!=C y  A!=C
     */
    public static void main(String[] args) {
        // Declaración de datos de entrada
        int ladoA, ladoB, ladoC;
        Scanner scanner = new Scanner(System.in);
        
        // Imprimo un título
        System.out.println("Qué tipo de triángulo es?");
        System.out.println("-----------------------");
        
        // Se piden los datos necesarios:
        System.out.println("Ingrese medida del lado A: ");
        ladoA = scanner.nextInt();
        
        System.out.println("Ingrese medida del lado B: ");
        ladoB = scanner.nextInt();
        
        System.out.println("Ingrese medida del lado C: ");
        ladoC = scanner.nextInt();
        
        // Manejo de errores. Si algún lado mide 0 no se puede continuar
        if(ladoA == 0 || ladoB == 0 || ladoC == 0){
            System.out.println("*Error*\nNingun lado puede medir 0");
        }else{
            // Si ningún lado vale 0 se puede deducir el tipo de triángulo sin problemas
            if(ladoA == ladoB && ladoB == ladoC){
                System.out.println("Triangulo equilatero");
            }else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
                System.out.println("Triangulo isosceles");
            }else{
                System.out.println("Triangulo escaleno");
            }
        }
    }
    
}
