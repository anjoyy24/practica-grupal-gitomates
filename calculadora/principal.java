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
         System.out.println("Suma = 1, Resta = 2, Multiplicacion = 3, Division = 4");
         int opcion = sp.nextInt();
    switch (opcion) {
        case 1:
            double res = calcu.sumar(valor1, valor2);
            System.out.println("la suma es"+ res);
            break;
        case 2:
            double res= calcu.resta(valor1, valor2)
            System.out.println("la resta  es"+ res);
            break;
        case 3:
            double res= calcu.multiplicacion(valor1, valor2)
            System.out.println("la multiplicacion es"+ res);
            break;
        case 4:
            double res= calcu.division(valor1, valor2)
            System.out.println("la division  es"+ res);
            break;
        default:
        System.out.println("opcion incorrecta vuelva a intentar")
            break;
    }
    }
}
