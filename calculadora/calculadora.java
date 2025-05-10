 package calculadora;

public class Calculadora {

    // declaran sus varibles conrrespondientes 
    public Calculadora(){
        // este es el metodo constructor
    }

    // de aca para adelante hacen sus metodos, osea las funciones matematicas que van a tener nuestra calculadora ejemplo

    public double sumar (double valorA, double valorB){
        return valorA + valorB;
    }
    
    public static double dividir(double a, double b) {
    if (b == 0) {
        System.out.println("¡Error! División por cero.");
        return 0;
    }
    return a / b;
}

}