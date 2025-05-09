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
         System.out.println("Suma = 1, Resta = 2, Multiplicacion = 3, Division = 4, Potencia = 5, Raiz Cuadrada = 6");
         int opcion = sp.nextInt();
    switch (opcion) {
        case 1:
            double res = calcu.sumar(valor1, valor2);
            System.out.println("la suma es"+ res);
            break;
        case 2:
            double res1= calcu.resta(valor1, valor2);
            System.out.println("la resta  es"+ res1);
            break;
        case 3:
            double res2= calcu.multiplicacion(valor1, valor2);
            System.out.println("la multiplicacion es"+ res2);
            break;
        case 4:
            double res3= calcu.division(valor1, valor2);
            System.out.println("la division  es"+ res3);
            break;
        case 5:
            double res4= calcu.potencia(valor1, valor2);
            System.out.println("la potencia  es"+ res4);
        case 6:
            double res5= calcu.raizCuadrada(valor1);
            System.out.println("la raiz cuadrada  es"+ res5);

        default:
        System.out.println("opcion incorrecta vuelva a intentar");
            break;
    }
    }
}
