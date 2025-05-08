import java.util.Scanner;

public class principal {
    public static void main (String arg []){
        calculadora calcu = new calculadora ();
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
            double res = calcu.sumar(valor1, valor2);
            System.out.println("la suma es"+ res);
            break;
    
        default:
            break;
    }
    }
}
