

public class Calculadora {

    // declaran sus varibles conrrespondientes 
    public Calculadora(){
        // este es el metodo constructor
    }

    // de aca para adelante hacen sus metodos, osea las funciones matematicas que van a tener nuestra calculadora ejemplo

    public double sumar (double valorA, double valorB){
        return valorA + valorB;
    }
    public double resta(double valorA, double valorB){
        return valorA - valorB;
    }
    public double multiplicacion(double valorA, double valorB){ 
        return valorA * valorB;
    }
    public double division(double valorA, double valorB){
        double s;
        if (valorA < 0 && valorB > 0) {
            s = valorB/valorA;
        }else if (valorA> 0 && valorB<0) {
            s = valorA/valorB;
        }
        return s;
    }
    
}