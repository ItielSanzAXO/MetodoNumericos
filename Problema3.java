public class Problema3 {
    //El polinomio f(x) = 0.0074x^4 - 0.284x^3 + 3.355x^2 - 12.183x + 5
    //tiene una raiz real entre 15 y 20. Aplique el metodo de Newton-Raphson a dicha funcion
    //con valor inicial x0 = 16.15. Explique sus resultados.
    public static void main(String[] args) {
        double x0 = 16.15; // Valor inicial
        double x1 = 0; // Valor inicial de la raíz
        double es = 0.01; // Error especificado
        double ea = 100; // Error aproximado inicial
        int iter = 0; // Contador de iteraciones
        // Bucle que se ejecuta mientras el error aproximado sea mayor que el error especificado
        while(ea > es){
            // Aplicación del método de Newton-Raphson
            x1 = x0 - (f(x0)/df(x0));
            // Cálculo del error aproximado
            ea = Math.abs((x1 - x0)/x1)*100;
            x0 = x1;
            iter++;
            // Impresión de los resultados de cada iteración
            System.out.println("Iteracion: " + iter + " Raiz: " + x1 + " Error: " + ea);
        }
    }
    //Función f(x) = 0.0074x^4 - 0.284x^3 + 3.355x^2 - 12.183x + 5
    public static double f(double x){
        return 0.0074*Math.pow(x,4) - 0.284*Math.pow(x,3) + 3.355*Math.pow(x,2) - 12.183*x + 5;
    }
    //Derivada de la función f(x), df(x) = 0.0296x^3 - 0.852x^2 + 6.71x - 12.183
    public static double df(double x){
        return 0.0296*Math.pow(x,3) - 0.852*Math.pow(x,2) + 6.71*x - 12.183;
    }
}
