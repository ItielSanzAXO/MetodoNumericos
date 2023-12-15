public class Problema4 {
    //Determine la raiz real mas grande de f(x) = 0.95x^3 - 5.9x^2 + 10.9x - 6
    //con el metodo de Newton-Raphson (realiza 5 iteraciones, xi = 3.5)
    public static void main(String[] args) {
        double x0 = 3.5; // Valor inicial
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
    //Función f(x) = 0.95x^3 - 5.9x^2 + 10.9x - 6
    public static double f(double x){
        return 0.95*Math.pow(x,3)-5.9*Math.pow(x,2)+10.9*x-6;
    }
    //Derivada de la función f(x), df(x) = 2.85x^2 - 11.8x + 10.9
    public static double df(double x){
        return 2.85*Math.pow(x,2)-11.8*x+10.9;
    }
}
