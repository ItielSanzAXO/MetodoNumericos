public class Problema5 {
    //Determine la menor raiz positiva de f(x) 8sen(x)e^-x - 1
    //con el metodo de Newton-Raphson (5 iteraciones, xi = 0.3)
    //imprimiendo todas las iteraciones
    public static void main(String[] args) {
        double x0 = 0.3; // Valor inicial
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
        // Impresión de que no hay más iteraciones por hacer
        System.out.println("No hay más iteraciones por hacer, se ha alcanzado el error especificado.");
    }
    //Función f(x) = 8sen(x)e^-x - 1
    public static double f(double x){
        return 8*Math.sin(x)*Math.exp(-x) - 1;
    }
    //Derivada de la función f(x), df(x) = 8e^-x(cos(x) - sen(x))
    public static double df(double x){
        return 8*Math.exp(-x)*(Math.cos(x) - Math.sin(x));
    }

}
