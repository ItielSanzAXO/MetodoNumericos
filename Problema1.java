public class Problema1 {
    //Utilice el metodo de Newton-Raphson para determinar una raiz de f(x) = -x^2 + 1.8x + 2.5
    //con el uso de x0 = 5. Haga el calculo hasta que el error aproximado sea menor que es = 0.05%
    public static void main(String[] args) {
        double x0 = 5; // Valor inicial
        double x1 = 0; // Valor inicial de la raíz
        double es = 0.05; // Error especificado
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
    //Función f(x) = -x^2 + 1.8x + 2.5
    public static double f(double x){
        return -Math.pow(x,2) + 1.8*x + 2.5;
    }
    //Derivada de la función f(x), df(x) = -2x + 1.8
    public static double df(double x){
        return -2*x + 1.8;
    }
}
