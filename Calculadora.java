package Calc;

public class Calculadora {

    private static final double PI = 3.14159265358979;
    private static final double E = 2.718281828459;
 
    public Calculadora() {
    }

    public double sumar(double a, double b){
        return a + b;
    }    

    public double restar(double a, double b){
        return a - b;
    }

    public double multiplicar(double a, double b){
        return a * b;
    }

    public double dividir(double a, double b) throws ArithmeticException{
        if (b != 0){
            return a / b;
        } else {
            throw new ArithmeticException("Intent de divisió entre zero.");
        }
    }

    public double potencia(double base, double exponent){
        return Math.pow(base, exponent);
    }

    public double valorAbsolut(double valor){
        return Math.abs(valor);
    }
}
