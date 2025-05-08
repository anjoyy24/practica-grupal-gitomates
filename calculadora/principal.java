import java.util.Scanner;

public class Principal {
    public static void main (String arg []){
        Calculadora calcu = new Calculadora ();
        // aca pedimos los valores que neceistamos ejemplo
        Scanner sp = new Scanner (System.in);
        System.out.println("ingresa el primer valor");
         double valor1 = sp.nextDouble();
         System.out.println("ingresa el segundo valor");
         double valor2 = sp.nextDouble();
         System.out.println("Suma = 1, Resta = 2 ...");
         int opcion = sp.nextInt();
    switch (opcion ) {
        case 1:
            calcu.sumar(valor1, valor2);
            break;
    
        default:
            break;
    }
    }
}
