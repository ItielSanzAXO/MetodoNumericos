public class Problema2 {
    //Determine las raices reales de f(x) = -1 + 5.5x - 4x^2 + 0.5x^3
    //con el metodo de Newton-Raphson dentro de es = 0.01%
    public static void main(String[] args) {
        double x0 = 0; // Valor inicial
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
    //Función f(x) = -1 + 5.5x - 4x^2 + 0.5x^3
    public static double f(double x){
        return -1 + 5.5*x - 4*Math.pow(x,2) + 0.5*Math.pow(x,3);
    }
    //Derivada de la función f(x), df(x) = 5.5 - 8x + 1.5x^2
    public static double df(double x){
        return 1.5*Math.pow(x,2)-8*x+5.5;
    }
}
