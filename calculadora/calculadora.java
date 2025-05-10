
public class Calculadora {

    // declaran sus varibles conrrespondientes 
    public Calculadora(){
        // este es el metodo constructor
    }

    // de aca para adelante hacen sus metodos, osea las funciones matematicas que van a tener nuestra calculadora ejemplo

    public double sumar (double valorA, double valorB){
        return valorA + valorB;
    }
    
    public double potencia(double valorA, double valorB){
        double res;
        res = Math.pow(valorA, valorB);
        return res;
    }


    public double raizCuadrada(double valorA){
        double res;
        res = Math.sqrt(valorA);
        return res;

    }
    
    
    public double restar (double valorA, double valorB){
        return valorA - valorB;
    } 

    public static double multiplicacion(double valorA, double valorB){
        return valorA*valorB;
    }

    public static double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("Error: No se puede dividir por cero.");
        return 0;
    }
    return a / b;
    }
    try {
        double resultado = dividir(10, 0);
        System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
        System.out.println("Error: " + e.getMessage());
    }



}